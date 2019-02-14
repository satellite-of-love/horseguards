package com.jessitron.hg.RenameMethod;

public class CallerOfRenamedMethod {

	public void doTheThing(AnotherClassWithOldMethod acwom, DefinerOfRenamedMethod corm) {
		// blah blah

		System.out.println("Here is the result: " + corm.oldMethodName());
		System.out.println("Here is another result: " + acwom.oldMethodName());
	}

}