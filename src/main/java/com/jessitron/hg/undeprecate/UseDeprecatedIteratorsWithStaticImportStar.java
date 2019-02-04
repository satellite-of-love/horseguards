package com.jessitron.hg.undeprecate;

import java.util.Iterator;

import static com.google.common.collect.Iterators.*;

public class UseDeprecatedIteratorsWithStaticImportStar {

    public void doStuff() {
        Iterator<String> it = emptyIterator() /* TODO: use java.util.Collections.emptyIterator */;
    }
}


