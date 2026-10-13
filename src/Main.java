import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola :D");
        System.out.println("Dame un numero");
        int num1 = sc.nextInt();
        System.out.println("Dame otro numero");
        int num2 = sc.nextInt();
        suma(num1, num2);
    }
    public static int suma(int a, int b){
        return a + b;
    }
}