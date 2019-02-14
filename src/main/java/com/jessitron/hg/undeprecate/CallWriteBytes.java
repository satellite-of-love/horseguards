package com.jessitron.hg.undeprecate;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class CallWriteBytes {

	public void doStuff() {
		ByteArrayDataOutput op = ByteStreams.newDataOutput();

		/*
		 * should be: la la la op.write(
		 * "I am the string of danger".getBytes(Charsets.UTF_8));
		 */
		op.writeBytes("I am the string of danger");

		// also this one.
		String foolark = "I am also evil and treacherous";

		/*
		 * should be: op.write(foolark.getBytes(Charsets.UTF_8));
		 */
		op.writeBytes(foolark);
	}

}
