import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
            System.out.println("Enter your username: ");
            Scanner n= new Scanner(System.in);
            String name=n.next();
            System.out.println("Enter your password");
            String pass = n.next();
            if(name.matches("[a-zA-Z]+") && pass.matches("[a-zA-Z]+")){
                System.out.println("Your username: " + name);
                System.out.println("Your password: "+pass);
            }else{
                System.out.println("Enter only strings");
            }
    }
}
