package com.boffins.arrays;

public class MethodArray {
	int [] getArray(){
		System.out.println("This is get array method");
		int [] array = {11,12,13,14,15};
		return array;
	}
	
	
	void setArray(String[] array){
		for(String ar : array){
			System.out.println("in set array");
			System.out.println(ar);
		}
	}
	public static void main(String[] args) {
		MethodArray m = new MethodArray();
		int [] array = m.getArray();
		for(int aa : array){
			System.out.println(aa);
		}
		String str [] = {"sana","mana","ena"};
		m.setArray(str);
		
	}

}
