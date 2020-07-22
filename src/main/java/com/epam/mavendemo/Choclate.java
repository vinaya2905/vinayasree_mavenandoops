package com.epam.mavendemo;

public class Choclate extends Gift implements Comparable<Choclate>{
	String name;
	Choclate(String taste,String color,int weight,String name){
		super(taste,color,weight);
		this.name=name;

	}
	public int getWeight() {
		return weight;
	}
	public int compareTo(Choclate o) {
		int cw=((Choclate) o).getWeight();
		return this.weight-cw;
	}
}
