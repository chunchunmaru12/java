package labfive;
//lab5 function/method
public class FunctionExample {
    //user defined function example
    //1, without parameter and without return type
    public void calculateTotal(){
        double prices[]={2300.43,798.99,900};
        double total=0;
        for(double val:prices){
            total+=val;
        }
        System.out.println("Total: "+total);
    }
    //without paramter and with return type
    public boolean getStatus(){
        String user="dav";
        if (user=="dav")
            return true;
        else
            return false;
    }
    //with parameter and with return type
    public double calculateAreaOfCircle(double r){
        double pi=3.141;
        return pi*r*r;
    }
    //with parameter but no return type
//    public void checkNumber(int n){
//        if(n<0)
//            System.out.println("Negative");
//        else if(n>0)
//            System.out.println("Postive");
//        else
//            System.out.println("Zero");
//    }
    public void checkLogin(String username,String password){
        if(username=="dav"&&password=="dav123")
            System.out.println("Login Success");
        else
            System.out.println("invalid User");

    }
    //5. static method example
   static void calculateInterest(double p,double t,double r){
        if(p<=0 || t<=0 || r<=0){
            System.out.println("must be more than 0");
        }
        else{
            double interest=(p*t*r)/100;
            System.out.println("Interest "+interest);
        }
    }
    static void main(String[] args) {
        FunctionExample s1= new FunctionExample();
        s1.calculateTotal();
        if(s1.getStatus()){
            System.out.println("verified user");
        }
        else{
            System.out.println("unverified user");
        }
        System.out.println("The area of circle is  "+s1.calculateAreaOfCircle(7));



//        s1.checkNumber(-1);
        s1.checkLogin("dav","dav123");
        //calling static method directly
        calculateInterest(1000,10,5);
        //calling static method with class name
        FunctionExample.calculateInterest(1500,2,2.4);
    }
}
