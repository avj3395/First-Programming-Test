
import java.util.Scanner;

public class Problem4 {
    
    public static void main(final String args[]) {
        int count=0; // variable declaration
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
      int length = read.nextInt();
      int [] elementarray = new int[length];// Array declaration  
      System.out.println("Enter the elements of the array:");

      for(int i=0; i<length; i++ ) {
        elementarray[i] = read.nextInt();//Assign data to Array variables
     }
    

     for(int j=1;j<10;j++){ //first loop is for check 1 t0 9 number is divisible or not

        for(int k=0;k<length;k++){//second loop for check individual array elements is divisible or not

            if(elementarray[k] % j == 0){
                count = count+1;//if any number is divisible count will increment
            }
        }
        System.out.println("multiple of "+ j+" = "+count+"\n");
        count = 0;//when one output is printed then the count will goes to zero because j value is changed to 1 to 9
     }
    }
}
