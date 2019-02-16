package com.titanbankcorp.system;
import com.titanbankcorp.records.*;
public class Factory {
Database data = new Operations();
Account acc = new Account();
	Database getDatabase(){
		return data;
	}
	Account getAccount(){
		return acc;
	}
	
}
