package com.epam.mavendemo;

public class Sweet extends Gift{
	String name;
	//String color;
	//int weight;
	String shape;
	Sweet(String taste,String color,int weight,String name,String shape){
		super(taste,color,weight);
		this.name=name;
		this.shape=shape;
	}
	public int getWeight() {
		return weight;
	}

}
