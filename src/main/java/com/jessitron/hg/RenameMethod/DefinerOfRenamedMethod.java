package com.jessitron.hg.RenameMethod;

public class DefinerOfRenamedMethod {

	/**
	 * This is not very useful, but it represents something that is.
	 * @deprecated use updatedMethodName instead
	 * @return string
	 */
	@Deprecated
	public String oldMethodName() {
		return "I am the old version. I am deprecated.";
	}

	/**
	 * This is at least as useful, and has a different name.
	 * @return string
	 */
	public String updatedMethodName() {
		return "I am the updated version. Good job.";
	}

}
