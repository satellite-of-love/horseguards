package com.jessitron.hg.undeprecate;

import static java.util.Collections.emptyIterator;

import java.util.Iterator;

public class UseDeprecatedIteratorsWithStaticImport {

    public void doStuff() {
        Iterator<String> it = emptyIterator();
    }
}


