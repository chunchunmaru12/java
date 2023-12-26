package dav.scanner.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CredentialChecker {
    private String username;
    private String password;
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String user){
        this.username=user;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
         this.password = pass;
     }
     public boolean checkCredential(){
        boolean status = false;
        if(this.getUsername().equals("dav")&& this.getPassword().equals("1234")){

           status=true;
        }
        return status;
     }
    public static void main(String[] args) {
        CredentialChecker ac= new CredentialChecker();
       Scanner p = new Scanner(System.in);
        System.out.println("Enter your name: ");
       String name= p.next();
        System.out.println("Enter password: ");
       String password=p.next();
       ac.setUsername(name);
       ac.setPassword(password);
       if(ac.checkCredential()){
           System.out.println("Login Success");
       }
       else {
           System.out.println("Invalid User");
       }
    }
}
