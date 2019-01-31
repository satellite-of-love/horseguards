package com.jessitron.hg.undeprecate;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;

import java.util.Set;

public class UseDeprecatedMethod {
    public String carrot() {

        ConcurrentHashMultiset<String> chm = ConcurrentHashMultiset.create();
        chm.add("foo");

        // this is deprecated in Guava 23.6+
        Set<Multiset.Entry<String>> entrySet = chm.createEntrySet();

        int len = entrySet.size();

        return "I like to createEntrySet some days " + len;
    }
}
