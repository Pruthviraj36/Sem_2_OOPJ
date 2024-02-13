import java.util.Scanner;
class L1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(args[0]);
        
        int x =  Integer.parseInt(args[0]);
        int y =  Integer.parseInt(args[1]);

        System.out.println("Sum is : " + (x + y));
        sc.close();
    }
}