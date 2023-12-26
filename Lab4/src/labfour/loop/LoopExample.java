package labfour.loop;

import java.util.Scanner;
public class LoopExample {
    public static void main(String[] args) {
        //for
        for(int i=0;i<5;i++){
            System.out.println("Your number is "+i);
        }
        for (int i=0;i<10;i++){
            if (i==5){

                continue;
            }
            if(i==7){
                break;
            }
            System.out.println(i);
        }
    for(int i=0;i<5;i++){
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
    String country_code[][]={
            {"Nepal","Np"},
            {"India","In"},
            {"China","Cn"},
            {"Srinlanka","Sri"}
    };
    for(int i=0;i<4;i++){
        for(int j=0;j<2;j++) {
            System.out.print(country_code[i][j] + " ");
        }
        System.out.println("");
    }
    int counter=0;
    String sports[]={"Football","Basketball","cricket"};
    int length= sports.length;
        //while
    while(counter<length){
        System.out.println("Sports Name " +sports[counter]);
        counter++;
    }
    int m[][]={
            {1,3},
            {2,5}
    };
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
    }
    //break with while loop
        String users[][]={
            {"RAM","SHYAM"},
                {"shyam","s123"}
    };
    String username="RAM";
    String password="SHYAM";
    int c=0;
    while (c < users.length){
        for (int i =0; i< users[c].length;i++){
            if(users[c][0]==username && users[c][1]==password ){
                System.out.println("Login success");
                break;
            }
            System.out.println("invalid");


        }
break;

    }

    //for each
        int roll[]={1,2,3,4,5};
    int sum=0;
        for (int val:roll) {
            sum+=val;
        }
        System.out.println("Sum of int array "+sum);

        String house[][]={
                {"red","blue"},{"Green","yellow"}
        };
        for (String[] data:house) {
                System.out.println(data[0]+" "+data[1]);
        }
//    String name[];
//    Scanner n=new Scanner(System.in);
//        System.out.println("Enter name ");
//        String nam=n.next();
//
    /* task ; write 5 example of for each loop including do- while*/
//    int num[][];
//    Scanner no=new Scanner(System.in);
//    int naa[][] = new int[0][];
//    for(int i=0;i<2;i++){
//        for(int j=0;j<2;j++){
//            int n=no.nextInt();
//            n=naa[i][j];
//
//        }
//    }
//    for(int a[]:naa){
//        System.out.printf(a[0]+" ");
//    }
        int n[][]={
                {1,2},{3,4}

        };
        int co=0;
        for(int a[]:n){
            do{
                System.out.println(a[1]);
                co++;
            }while(co<1);
        }

    }
}