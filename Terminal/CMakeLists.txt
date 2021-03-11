cmake_minimum_required(VERSION 3.17)
project(Terminal C)

set(CMAKE_C_STANDARD 99)

add_executable(Terminal main.c terminal.h UI.c Initilisation.c CatchSigInt.c ChangeDirectory.c ArgumentHandler.c)