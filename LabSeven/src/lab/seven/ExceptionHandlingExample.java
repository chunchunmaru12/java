package lab.seven;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        //Exceptional Handling  examples
        //1. Zero Division
        //try block-block of code where exception might rise
        //are kept inside it
        try{
            int number=200;
            int result=number/0;
            System.out.println("Result: " +result);
        }
         catch (Exception e){
            //catch block- handeles the exception raised inside try block
             System.out.println("Cannot divide by zero");
          
        }
        System.out.println("");
        //2.IndexOutOfBoundException
        String sports[]={"Football","Cricket","Tennis"};
        try{
            System.out.println("From 22 July: "+sports[5]+"tournament");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("");
       //3.ArithmeticException with finally clause
       try{
       int num=12313;
           System.out.println(num/0);
       }catch(ArithmeticException e){
           System.out.println("Error :" + e.getMessage());
       }finally{
           System.out.println("Finally block exutes either expection is raised or not");
       }
                //4. Null Pointer Exception
        String price = null;
        try{
            
        }catch(NumberFormatException e){
            System.out.println("Error:" + e.getMessage());
        }
        }
    }
    

