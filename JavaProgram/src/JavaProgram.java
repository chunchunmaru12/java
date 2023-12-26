public class JavaProgram {

    public static void checkVowel1(String name){
        char arr[] = name.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                System.out.print(" "+arr[i]);
            }
        }
    }


    public static void calcInves(double p,double r,double t){
        double a=0;
        for(int i=0;i<4;i++){
            a+= Math.pow(p*(1+(r/t)),i);
            System.out.println(a);
        }

    }

    public static void main(String[] args) {

        calcInves(1000,10,5);
        checkVowel1(new String("diya is sus"));

    }
}
