import java.util.Scanner;

public class BlockThird {
    public static int nod, nok, P;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите количесво цифр ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите цифры:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        //==================== чёт не чёт
        System.out.println("Нечетные элементы:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
        System.out.println("Четные элементы:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" " + array[i]);
            }
        }
        // =================== наибольшее и наименьшее
        int x = array[0];
        int y = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= x) {
                x = array[i];
            }
            if (array[i] <= y)
                y = array[i];
        }
        System.out.println();
        System.out.println("Наибольшее число " + x + ", наименьшее число " + y);
        //==================== делятся на 3 или на 9
        System.out.println("Числа которые делятся на 3 либо на 9:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 || array[i] % 9 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        //===================== делятся на 5 и на 7
        System.out.println();
        System.out.println("Числа которые делятся на 5 и на 7:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        // ============== числа в десятичной записи которых нет одинаковых цифр
        System.out.println();
        System.out.println("Трехзначные числа в десятичной записи который нет одинаковых цифр:");
        int a, b, c;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 99) {
                a = array[i] / 100;
                b = array[i] / 10 % 10;
                c = array[i] % 10;
                if (a != b && b != c && a != c) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        //Наибольший общий делитель и наименьшее общее кратное этих чисел
        P = 1;
        for (int i = 0; i < array.length; i++) { //Нахождение НОД всех чисел массива
            if (i + 1 < array.length) {
                for (int j = i + 1; j <= i + 1; j++) {
                    nod = gcd(array[i], array[j]);
                    P = array[i] * array[j];
                    nok = P / nod;
                }
                array[i + 1] = nod;
                array[i + 1] = nok;
            }

        }
        System.out.println();
        System.out.println("НОД  чисел равен " + nod);
        System.out.println("НОК  чисел равен " + nok);
    }

    static int gcd(int a, int b) { //метод вычисляющий НОД
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}