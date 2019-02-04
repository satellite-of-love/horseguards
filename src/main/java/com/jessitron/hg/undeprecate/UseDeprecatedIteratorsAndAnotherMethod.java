package com.jessitron.hg.undeprecate;

import com.google.common.collect.Iterators;
import java.util.Iterator;

public class UseDeprecatedIteratorsAndAnotherMethod {

    public void doStuff() {
        Iterator<String> it = Iterators.foo();

        Iterator<Integer> other = Iterators.foo(1,2,3);
    }
}


