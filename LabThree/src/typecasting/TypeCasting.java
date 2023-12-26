package typecasting;

public class TypeCasting {
    public static void main(String args[]){
        // Type casting examples
        byte num = 12;
        int val = num;

        double result = 58.78;
        int my_result = (int)result;

        char code = 'a';
        int pin_code = (int)code; // converts 'a' into ASCII value

        // in case of non-primitive datatype
        String reg_no = "123"; // depends upon value while converting
        int std_reg_no = Integer.parseInt(reg_no);

        System.out.println(val);
        System.out.println(my_result);
        System.out.println(pin_code);
        System.out.println(std_reg_no);
    }
}