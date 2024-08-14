import java.util.Scanner;

public class Pallindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pal = sc.nextInt();
        int rev = 0, temp = pal;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (pal == rev) {
            System.out.println(pal + " is a pallindrome.");
        } else {
            System.out.println(pal + " is not a pallindrome.");
        }
    }
}
