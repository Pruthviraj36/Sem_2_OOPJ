import java.util.Scanner;
class L1_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Enter two numbers");
        System.out.println("Sum is : " + (x + y));

        sc.close();
    }
}