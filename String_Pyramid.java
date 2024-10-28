import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     /*User string input*/
     String chars = input.nextLine();
     String ch = chars;
     /*User given range*/
     int num = input.nextInt();
     for(int i = 0; i < num; i++){
         System.out.println(chars);
         chars += ch;
     }
    }
}