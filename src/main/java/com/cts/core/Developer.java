package com.cts.core;

public class Developer {
	
	private Language lang;

	public Developer(Language lang) {
		super();
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Developer [lang=" + lang + "]";
	}
	
	

}
