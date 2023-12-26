package casestudy.one.bmi;
import java.util.Scanner;
public class BMICalculator {
    User user;
    public BMICalculator(){
        this.user= new User();
    }
    public double calculateBMI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight in KG: ");
        try{
            this.user.setWeight(sc.nextDouble());
        }catch (Exception e){
            System.out.println("Please enter valid input");
        }
        System.out.println("Enter your height in Meter: ");
        try{
            this.user.setHeight(sc.nextDouble());
        }
        catch (Exception e){
            System.out.println("Please enter valid input");
        }
        double bmi= this.user.getWeight()/Math.pow(this.user.getHeight(),2);
        return bmi;
    }
    public  String showIndex(double bmi){
        String index=null;
        if(bmi<0&&bmi>100){
            index="please insert proper data: Height in meter and weight in kg";
        }else if(bmi>0 && bmi<=16){
            index = "You're severly underweight";
        } else if (bmi>16 && bmi <=18.4){
            index = "You are underweight";
        } else if (bmi>18.4 && bmi<=24.9) {
            index = "You are Normal";
        }else if (bmi>24.9 && bmi<= 29.9){
            index ="You are overweight";
        }else if (bmi>29.9 && bmi<= 34.9){
            index ="You are moderately obese";
        }else if (bmi>34.9 && bmi<= 39.9){
            index ="You are severely obese";
        }else if (bmi>39.9){
            index ="You are Morbidly obese";
        }
        return index;
    }
    public void calculate(String flag){
        switch (flag.toLowerCase()){
            case "us":
                System.out.println("Your index: " + this.showIndex(this.calculateUsBmi()));
                break;
            case "metric":
                System.out.println("Your index: " + this.showIndex(this.calculateBMI()));
                break;
            default:
                System.out.println("Enter either 'us' or 'metric'");}}
    public double calculateUsBmi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight in LBS: ");
        try{
            this.user.setWeight(sc.nextDouble());
        }catch (Exception e){
            System.out.println("Please enter valid input");}
        System.out.println("Enter your height in Inches: ");
        try{
            this.user.setHeight(sc.nextDouble());}
        catch (Exception e){
            System.out.println("Please enter valid input");}
        double bmi= this.user.getWeight()/(Math.pow(this.user.getHeight(),2)*703);
        return bmi;
    }
    public static void main(String[] args) {
        BMICalculator s = new BMICalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit 'us' or 'metric' ");
        s.calculate(sc.next());
    }
}


