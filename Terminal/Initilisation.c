//
// Created by cameron on 11/03/2021.
//

#include "terminal.h"

_Noreturn void init() {
    char *userInput;
    char **userArguments;
    signal(SIGINT, sigIntHandler);

    while (true) {
        greeting();
        userInput = readUserInput();
        userArguments = splitIntoArguments(userInput);
        handleArgument(userArguments);
        free(userArguments);
        free(userInput);
    }
}


