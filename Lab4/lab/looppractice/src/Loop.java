public class Loop {
    public static void main(String[] args) {
        int num[]={5,1,3,12,10,9};
        int temp;
        for(int i=0;i< num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("The largest number = "+num[num.length-1]);
        System.out.println("The smallest number = "+num[0]);
    }
}
