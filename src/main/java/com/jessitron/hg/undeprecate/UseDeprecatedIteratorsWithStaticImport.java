package com.jessitron.hg.undeprecate;

import static com.google.common.collect.Iterators.emptyIterator;

import java.util.Iterator;

public class UseDeprecatedIteratorsWithStaticImport {

    public void doStuff() {
        Iterator<String> it = emptyIterator();
    }
}


