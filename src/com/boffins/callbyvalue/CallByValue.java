package com.boffins.callbyvalue;

public class CallByValue {
int data=100;

void change(CallByValue obj){
	obj.data = obj.data+500;
	System.out.println(data);
	
}

	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		System.out.println("before change "+" "+obj.data);
		obj.change(obj);
		System.out.println("after change "+" "+obj.data);
		
	}

}
