package com.boffins.single;

public class TestMain {

	public static void main(String[] args) {
		
		
		Sample obj = Sample.getSample();
		obj.display();
		
		Sample obj2 = Sample.getSample();
		Sample obj3 = Sample.getSample();
		obj2.display();
		obj3.display();
	}

}
