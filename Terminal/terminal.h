//
// Created by cameron on 11/03/2021.
//

#ifndef TERMINAL_TERMINAL_H
#define TERMINAL_TERMINAL_H

#include <stdio.h>
#include <string.h>
#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <sys/wait.h>
#include <time.h>
#include <stdbool.h>
#include <stdlib.h>

_Noreturn void init();
void greeting();
char* readUserInput();
char** splitIntoArguments(char *userInput);
void executeCommand(char **userArguments);
void removeNewLine(char *s);
void sigIntHandler(int sigNum);
void changeDirectory(char **userArguments);
void handleArgument(char **userArguments);

#endif //TERMINAL_TERMINAL_H
