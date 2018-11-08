import java.util.Scanner;

public class BlockFirst {
    public static void main(String[] args) {
        Name();
        formyla();
    }
    public static void Name() {
        String a = "Hello";
        Scanner name = new Scanner(System.in);
        System.out.println("Введите имя");
        String b = name.nextLine();
        System.out.println(a + " " + b + "!");
    }
    public static void formyla (){
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = chislo.nextInt();
        System.out.println("Введите число b");
        int b = chislo.nextInt();
        int c = 4 * (a+b-1) / 3 ;
        System.out.println("4*(a+b-1)/3=" + c);
    }
}
