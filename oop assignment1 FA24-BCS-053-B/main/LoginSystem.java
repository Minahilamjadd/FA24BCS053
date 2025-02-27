package main;
import java.io.console;
import user.UserManager;


public class LoginSystem{
	public static void main(String[] args){
	Console console=System.console();
	System.out.println("enter username");
	String user=console.readLine();
	System.out.println("enter password");
	char[] pass=console.readPassword;

	String Pass = String.valueOf(pass);
	if(UserManager.LoginProcessor.authenticate(user, pass)==true){
	System.out.println("login successful");
}
	else{
	System.out.println("incorrect credentials");
}
}
}