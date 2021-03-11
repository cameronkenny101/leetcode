//
// Created by cameron on 11/03/2021.
//

#include "terminal.h"

void changeDirectory(char **args) {
    if(args[1] == NULL)
        printf("Expected an argument to cd\n");
    else {
        if(chdir(args[1]) != 0)
            printf("Error in changing directory\n");
    }
}

