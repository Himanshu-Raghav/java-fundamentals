 import java.util.*;
public class day1pr2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math = input.nextInt();
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        double average = (math + physics + chemistry) / 3.0;
        System.out.println(average);
  }
}