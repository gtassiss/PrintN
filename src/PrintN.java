import java.util.Scanner;
public class PrintN {



    public static void main(String[] args) {
        System.out.print("Enter #: ");
        Scanner keyboard = new Scanner(System.in);//user enters number
        int counter = 0;//
        int Sum = 0;
        String var = "";
        int i = keyboard.nextInt();
        while (counter < i) {
            Sum = Sum + counter;
            counter++;
            System.out.print("["+counter+"]");






        }
    }
 }

