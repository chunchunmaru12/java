import org.w3c.dom.ls.LSOutput;

public class HcfLcm {
    public static void main(String[] args) {
        int a=10,b=15   ;
        int temp1=a;
        int temp2=b;
        int temp;
        int hcf,lcm;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;

        }
        hcf=a;
        lcm=((temp1*temp2)/hcf);
        System.out.println("HCF = "+hcf);
        System.out.println("LCM = "+lcm);

    }

}
