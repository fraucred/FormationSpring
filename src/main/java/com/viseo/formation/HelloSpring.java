package com.viseo.formation;

import org.springframework.context.annotation.Profile;

@Profile("tests")
public class HelloSpring {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Spring says hello to you " + name + "!");
	}
}