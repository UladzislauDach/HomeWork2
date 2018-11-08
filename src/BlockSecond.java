import java.util.Scanner;

public class BlockSecond {
    public static void main(String[] args) {
        summaChisel2();
        summaChisel3();
        okruglenie();
        delenie();
    }

    public static void summaChisel2() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите двухзначное число");
        int n = vvod.nextInt();
        int a = n / 10;
        int b = n % 10;
        System.out.println("Cумма цифр числа " + n + " = " + (a + b));
    }

    public static void summaChisel3() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите трёхзначное число");
        int n = vvod.nextInt();
        int a = n / 100;
        int b = (n - (100 * a)) / 10;
        int c = n % 10;
        int d = a + b + c;
        System.out.println("Cумма цифр числа " + n + " = " + (a + b + c));
    }

    public static void okruglenie() {
        System.out.println("Введите дробное число для округления");
        Scanner vvod = new Scanner(System.in);
        float n = vvod.nextFloat();
        int a = (int) n;
        float c = n - a;
        if (c >= 0.5) {
            System.out.println(++a);
        } else {
            System.out.println(a);
        }
    }

    public static void delenie() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите делимое число");
        int q = vvod.nextInt();
        System.out.println("Введите делитель");
        int w = vvod.nextInt();
        System.out.println(q + "/" + w + "=" + (q / w) + " и " + (q % w) + " в остатке");
    }
}
