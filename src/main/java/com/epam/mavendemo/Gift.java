package com.epam.mavendemo;

public abstract class Gift {
	int weight;
	String color;
	String taste;
	Gift(String taste,String color,int weight){
		this.taste=taste;
		this.color=color;
		this.weight=weight;
	}
	
}
