//import java.util.*;
//import java.io.*;



public class ATMData extends ATMChecking {

	private String accountNumber;
    private  String password;
    
    public ATMData (String accountNumber ,String password) {
    	super(accountNumber, password, (Integer) null);
    	
    }
    public String getID() {
    	return this.accountNumber = accountNumber;
    }
    public String getPass() {
    	return this.password = password;
    }

}
