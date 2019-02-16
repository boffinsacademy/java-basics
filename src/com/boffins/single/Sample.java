package com.boffins.single;

public class Sample {
private static Sample obj;
	private Sample(){
		
	}
	
	
public static Sample getSample(){
		if(obj==null){
			obj = new Sample();			
		}
		return obj;
	}

int i=0;

void display(){
	System.out.println("hello world sample"+" "+i++);
}
	
}
