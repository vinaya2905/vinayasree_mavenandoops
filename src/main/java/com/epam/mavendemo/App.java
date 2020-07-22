package com.epam.mavendemo;

import java.util.Arrays;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//total number of gifts
        int sCount=0;//sweets count
        int cCount=0;//chocolate count
        int tw=0;//total weight
        System.out.println("Selecting choclate or sweet");
        while(t-->0) {
        	String s=sc.next();
        	
        	if(s.equals("Sweet")) {
        		sCount++;
        	}
        	else {
        		cCount++;
        	}
        }
        Sweet sw[]=new Sweet[sCount];
        Choclate co[]=new Choclate[cCount];
        for(int i=0;i<cCount;i++) {
        	int w=sc.nextInt();//weight
        	String n=sc.next();//name
        	String c=sc.next();//color
        	String ta=sc.next();//taste
        	tw+=w;//calculating weight
        	co[i]=new Choclate(ta,c,w,n);
        }
        Arrays.sort(co);
        //printing weight of gifts which are choclates
        System.out.println("weight of choclates in sorted order");
        for(Choclate temp:co) {
        	System.out.print(temp.getWeight()+" ");
        }
        System.out.println();
        System.out.println("printing weight of choclates in given range");
        int left=sc.nextInt();
    	int right=sc.nextInt();
    	//printing candies in given range
    	
        for(Choclate tp:co) {
        	int x=tp.getWeight();
        	if(x>=left && x<=right) {
        		System.out.print(tp.getWeight()+" ");
        	}
        }
        System.out.println();
        for(int j=0;j<sCount;j++) {
        	int we=sc.nextInt();//weight
        	String na=sc.next();//name
        	String cl=sc.next();//color
        	String tas=sc.next();//taste
        	String sh=sc.next();//shape
        	tw+=we;//calculating weight
        	sw[j]=new Sweet(tas,cl,we,na,sh);
        }
        //printing weight of all gifts 
        System.out.println("printing weight of all gifts ");
        System.out.println(tw);
        //printing weight of gifts which are sweets
        System.out.println("printing weight of gifts which are sweets");
        for(Sweet se:sw) {
        	System.out.print(se.getWeight()+" ");
        }
        sc.close();   
    }
}
