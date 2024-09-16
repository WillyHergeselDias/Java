import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    List<Integer> nums = new ArrayList<>();
    for(int i = 1; i <= num; i++){
        nums.add(i);
    }
    System.out.println(nums);
    }
}
