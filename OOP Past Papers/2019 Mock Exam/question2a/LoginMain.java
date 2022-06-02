package question2a;

public class LoginMain {
    public static void main(String[] args) {
         Login login1;
         Login login2;

         login1 = Login.getInstance();
         login2 = Login.getInstance();

         System.out.println(login1.validateUser("Manju","Manju"));
         System.out.println(login2.validateUser("manju","Manju"));

         System.out.println(login1.equals(login2));
    }
}
