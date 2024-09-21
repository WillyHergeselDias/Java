import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String chars = input.nextLine();
      String ch = chars;
      int num = input.nextInt();
      for(int i = 0; i <= num; i++){
         chars += ch;
      }
      System.out.println(chars);
    }
}