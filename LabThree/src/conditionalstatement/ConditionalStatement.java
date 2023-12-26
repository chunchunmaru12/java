package conditionalstatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        /*conditional statement example
        note:statement must be true in order to execute the code inside if statement
        1. if statement = checks if single statement only
         */
        String status = "inactive";
        if (status != "active") {
            System.out.println("User is offline");
        }

        //if else statement
        int age = 18;
        if (age < 18) {
            System.out.println("You arenot eligible to vote");
        } else {
            System.out.println("You are eligigble");
        }
        boolean r = false;
        if (r) {
            System.out.println("absent");
        } else {
            System.out.println("Present");
        }
        /*if else if*/
        double marks = 40;
        if (marks < 0 || marks > 100)
            System.out.println("marks must be between 0 to 100");
        else if (marks <= 39.99 && marks >= 0)
            System.out.println("failed");
        else if (marks <= 59.9 && marks >= 40)
            System.out.println("Third division");
        else if (marks <= 69.99 && marks >= 60)
            System.out.println("Second divsion");
        else if (marks <= 79.99 && marks >= 70)
            System.out.println("First division");
        else if (marks <= 89.99 && marks >= 80)
            System.out.println("distinction");
        else
            System.out.println("absent");
        /* nested if*/
        String user = "Dav";
        String password = "dav123";
        if (user == "Dav")
            if (password == "dav123")
                System.out.println("Login Success");
            else
                System.out.println("Wrong password");
        else
            System.out.println("wrong user");
        }
    }


