package com.boffins.arrays;

public class User {

	public static void main(String[] args) {
	
		usertype a = new usertype(121, "shekhar");
		usertype b = new usertype(1221, "atul");
		usertype c = new usertype(121, "vishal");
		
		
		usertype [] u = new usertype[3];
		u[0]=a;
		
		u[2]=c;
		
		
		for(Object uu : u){
			
			if(uu instanceof usertype){
			usertype aa = (usertype)uu;
			System.out.println(aa.roll+"  "+aa.name);
		}
			if(uu==null){
				System.out.println(uu);
			}
	}
		
		
	}
}
