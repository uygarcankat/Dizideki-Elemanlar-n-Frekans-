import java.util.Scanner;


public class Frekans {

    static boolean isfind(int [] array,int value){

        for(int i:array){
            if(i==value){

                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {


       Scanner input= new Scanner(System.in) ;


        System.out.println("Kaç sayı girmek istersiniz");
       int n=input.nextInt();
       int []array=new int [n];
        int []new_arr=new int [n];

        int d=0;


       for(int i=0;i<n;i++){

           System.out.println("Lütfen sayı giriniz");
           array[i]=input.nextInt();

       }

       for(int i=0;i<n;i++){
           int c=0;
           for(int j=0;j<n;j++){
               if(array[i]==array[j]){

                   c++;
               }
           }
           if(!isfind(new_arr,array[i])) {

               new_arr[d++] = array[i];


           System.out.println(array[i] + " sayısı " + c + " kez tekrar edildi. ");}

       }
    }
}
