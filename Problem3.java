import java.util.Scanner;

public class Problem3 {
   
    public static void main(final String args[]) {

        Scanner read = new Scanner(System.in);
       System.out.println("Enter the limit");
       int number = read.nextInt(); // variable declaration & Assign data to variables
       
      if(number % 2 == 0){

        int num = number-1;//subtract one from the input limit because when the user enter even number the output shows same as the entered number + 1. (it is same as odd number)
        N_oddnumber(num);//method calling

      }
      else{
        N_oddnumber(number);//method calling
      }
       


    }

    private static void N_oddnumber(int number) {

       
        System.out.println("series of number is : ");

        for(int i=1; i<= (2*number);i++){

            if (i % 2 != 0) {

                System.out.println(i);
            }

           
        }
    }
       
    
}
