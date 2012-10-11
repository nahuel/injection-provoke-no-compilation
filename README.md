injection-provoke-no-compilation
================================

leiningen injection provokes no compilation, bug test

Try doing:

    cd without-injection-ok
    lein compile
    find . -iname IJavaScriptEnv.class
    # it will find it

    cd ..
    cd with-injection-wrong
    lein compile
    find . -iname IJavaScriptEnv.class
    # NO FILE FOUND, adding :injection to project.clj provokes
    # this file will not be compiled

    lein version:
    Leiningen 2.0.0-preview10 on Java 1.7.0_05 Java HotSpot(TM) 64-Bit Server VM

