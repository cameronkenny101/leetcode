//
// Created by cameron on 11/03/2021.
//

#include "terminal.h"

void handleArgument(char **userArguments) {
    if(strcmp(userArguments[0], "cd") == 0)
        changeDirectory(userArguments);
    else
        executeCommand(userArguments);
}

void executeCommand(char **userArguments) {
    pid_t child;

    child = fork();
    if(child < 0) {
        printf("Error in forking new child");
        exit(EXIT_FAILURE);
    } else if(child == 0) {
        if(execvp(userArguments[0], userArguments) == -1) {
            printf("Error in executing command\n");
        }
        exit(EXIT_FAILURE);
    } else {
        wait(NULL);
    }
}

char** splitIntoArguments(char *userInput) {
    char **args = NULL;
    char *ptr = strtok(userInput, " ");
    int numSpaces = 0;

    while (ptr) {
        args = realloc(args, sizeof (char*) * ++numSpaces);

        if(args == NULL)
            exit(-1);
        args[numSpaces - 1] = ptr;
        ptr = strtok(NULL, " ");
    }

    args = realloc(args, sizeof (char*) * numSpaces + 1);
    args[numSpaces] = 0;
    return args;
}

