package user;
import util.PasswordValidator;
public class UserManager{
		
	static String storedUsername = "FA24-BCS-053";
	static String storedPassword = "abc1234";
		 
	class LoginProcessor{
     		static boolean authenticate(String Username, String Password){
			if(storedUsername.equals(Username) && storedPassword.equals(Password)){
				return true;}
			return false;
}
}	

}
