import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (int i = 3; i <=n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
    }    }
    
}
