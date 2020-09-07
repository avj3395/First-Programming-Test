import java.util.Scanner;

public class Problem2 {
    public static void main(final String args[]) {

        Scanner read = new Scanner(System.in);
       System.out.println("Enter the limit");
       int number = read.nextInt(); // variable declaration & Assign data to variables
       
       N_oddnumber(number);//method calling


    }

    private static void N_oddnumber(int number) {

        System.out.println("series of number is : ");
//check the number is odd. if the remainder of the i/2 is not zero it is odd
        for(int i=1; i<= (2*number);i++){

            if (i % 2 != 0) {

                System.out.println(i);
            }

           
        }
    }
}

