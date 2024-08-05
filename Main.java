import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, x;
        a = sc.nextInt();
        for ( int i=1; i<=a; i++) {
            x=(int)(6*Math.random()+1);
            System.out.print(x+" ");
        }
        System.out.println("Конец серии!");
    }
}