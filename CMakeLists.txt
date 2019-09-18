cmake_minimum_required(VERSION 3.12)
include(FindJava)
include(UseJava)
find_package(Java 8)

project(JavaTest LANGUAGES JAVA)

file(GLOB jva src/main/java/com/ToLazyToMakeShitUp/*.java)

add_jar(main
        SOURCES ${jva}
        ENTRY_POINT com/ToLazyToMakeShitUp/Main
)
