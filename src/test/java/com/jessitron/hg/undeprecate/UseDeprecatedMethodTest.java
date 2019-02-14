package com.jessitron.hg.undeprecate;

import org.junit.Test;

import static org.junit.Assert.*;

public class UseDeprecatedMethodTest {

	@Test
	public void doesntBarf() {

		String result = new UseDeprecatedMethod().carrot();

		assertEquals("I like to create" + "EntrySet some days 1", result);
	}

}