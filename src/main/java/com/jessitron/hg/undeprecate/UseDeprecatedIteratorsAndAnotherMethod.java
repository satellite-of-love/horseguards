package com.jessitron.hg.undeprecate;

import com.google.common.collect.Iterators;
import java.util.Iterator;

public class UseDeprecatedIteratorsAndAnotherMethod {

    public void doStuff() {
        Iterator<String> it = Iterators.emptyIterator();

        Iterator<Integer> other = Iterators.cycle(1,2,3);
    }
}


