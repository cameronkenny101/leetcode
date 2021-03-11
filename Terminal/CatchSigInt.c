//
// Created by cameron on 11/03/2021.
//

#include "terminal.h"


void sigIntHandler(int sigNum) {
    signal(SIGINT, sigIntHandler);
    printf("\n");
    greeting();
    fflush(stdout);
}

