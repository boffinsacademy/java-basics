package com.boffins.arrays;
import java.util.*;

public class FirstArray {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int [][] roll = new int[3][3];
		
		/*for(int i=0; i<roll.length; i++){
			for(int j=0; j<roll.length;j++){
				int x =obj.nextInt();
				roll[i][j]=x;
			}
		}*/
usertype [] arr = new usertype[4];

usertype a = new usertype(1212, "shek");
usertype b = new usertype(1213, "shekhu");
usertype c = new usertype(1214, "shekhar");
int i=0;
	arr [0] = a;
	arr [2] = b;
	arr [3] = c;
for(Object u : arr){
	
	if(u instanceof usertype){
		usertype uu = (usertype)u;
	System.out.println(uu.roll+"   "+uu.name);
	}
	if(u==null){
		System.out.println("index where null value is present"+" "+i);
		System.out.println(u);
	}
	i++;
}

	

boolean [] stud = new boolean[2];
stud[1]=true;
for(boolean bb : stud){
	System.out.println(bb);
}
	}

}
