import java.util.Scanner;

public class Program
{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();
     for(int i = 1; i <= 10; i++){
         System.out.println(String.valueOf(num) + " x "  + String.valueOf(i) + " = " + num*i);
     }
    }
}