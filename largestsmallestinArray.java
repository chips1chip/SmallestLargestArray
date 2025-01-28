import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); // Input three numbers
        if (a > b && a > c) 
            System.out.println("a is largest"); // a is largest
        else if (b > a && b > c) 
            System.out.println("b is largest"); // b is largest
        else 
            System.out.println("c is largest"); // c is largest
    }
}
