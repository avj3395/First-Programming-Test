import java.util.Scanner;

public class Calculator{  
    public static void main(final String args[]) {

        double firstnum, secondnum, answer; // variable declaration
        String operater;// variable declaration

        final Scanner read = new Scanner(System.in);
     System.out.println("Welcome to the Calculater Please enter your Arithamatic operation. \n");
     System.out.println("Addition: +"+"\n"+"Sbstraction: -"+"\n"+"Multiplication: *"+"\n"+"Division: /"+"\n");
     operater=read.nextLine();
     System.out.println("Enter two numbers ");
     firstnum=read.nextDouble();
     secondnum=read.nextDouble();

     switch(operater){

        case "+":
            answer = firstnum+secondnum;
            System.out.println(firstnum+" + "+secondnum+" = "+answer);
            break;
        case "-":
            answer = firstnum-secondnum;
            System.out.println(firstnum+" - "+secondnum+" = "+answer);
            break;    
        case "*":
            answer = firstnum*secondnum;
            System.out.println(firstnum+" * "+secondnum+" = "+answer);
            break;
        case "/":
            answer = firstnum/secondnum;
            System.out.println(firstnum+" / "+secondnum+" = "+answer);
            break;
        default:System.out.println("you enterd a wrong operation");     
     }




    }  
}  