package com.jessitron.hg.undeprecate;

import com.google.common.base.Charsets;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class CallWriteBytes {

    public void doStuff() {
        ByteArrayDataOutput op = ByteStreams.newDataOutput();


        /* should be:
        op.write(
                "I am the string of danger".getBytes(Charsets.UTF_8));
         */
        op.write("I am the string of danger".getBytes(Charsets.UTF_8));

        // also this one.
        String foolark = "I am also evil and treacherous";

        /* should be:
         op.write(foolark.getBytes(Charsets.UTF_8));
         */
        op.write(foolark.getBytes(Charsets.UTF_8));
    }
}
