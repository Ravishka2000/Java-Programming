package question2a;

public class Login {

    private static Login uniqueInstance;

    private Login(){}

    public static Login getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new Login();
        }
        return uniqueInstance;
    }

    public boolean validateUser(String user, String password){
        if(user.equals(password)){
            return true;
        }
        else {
            return false;
        }
    }
}
