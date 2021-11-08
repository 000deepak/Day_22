import java.util.Arrays;
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        String[] sArray = s.split("\\s*,\\s*");
        System.out.println(Arrays.toString(sArray));
    }
}
