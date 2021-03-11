//
// Created by cameron on 11/03/2021.
//

#include "terminal.h"

char* readUserInput() {
    char *userInput;
    size_t length = 0;

    if(getline(&userInput, &length, stdin) == -1) {
        if(feof(stdin)) {
            printf("\n");
            exit(EXIT_SUCCESS);
        } else {
            printf("Error in reading user input");
            exit(EXIT_FAILURE);
        }
    }
    removeNewLine(userInput);
    return userInput;
}

void greeting() {
    int month, day, hours, mins;
    time_t currentTime = time(NULL);

    struct tm *myTime = localtime(&currentTime);

    month = myTime->tm_mon + 1;
    day = myTime->tm_mday;
    hours = myTime->tm_hour;
    mins = myTime->tm_min;

    printf("[%d/%d %d:%d]# ", day, month, hours, mins);
}

void removeNewLine(char *s) {
    while(*s) {
        if(*s == '\n')
            *s = '\0';
        s++;
    }
}

