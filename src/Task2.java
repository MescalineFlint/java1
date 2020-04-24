public class Task2 {
    public static void printJava() {
        String q = "Хорошо идут дела";
        String w = "Изучаю Java я!";
        String e = " ";
        System.out.println(q);
        System.out.println(w);
        System.out.print(q);
        System.out.print(e);
        System.out.println(w);
        System.out.print(w);
        System.out.print(e);
        System.out.println(q);
    }
    public static int subtraction(int x, int y) {
        int z = x - y;
        System.out.println("Вызвана функция subtraction() с параметрами x = " + x + ", y = " + y);
        return z;
    }
    public static int addition(int x, int y) {
        int z = x + y;
        System.out.println("Вызвана функция addition() с параметрами x = " + x + ", y = " + y);
        return z;
    }
    public static int multiplication(int x, int y) {
        int z = x * y;
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + ", y = " + y);
        return z;
    }
    public static void calculation() {
        int a = 34;
        int b = 55;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = addition(a, b);
        System.out.println("a + b = " + c);
        c = subtraction(a, b);
        System.out.println("a - b = " + c);
        c = multiplication(a, b);
        System.out.println("a * b = " + c);
    }
    public static void main (String[] args) {
        printJava();
        subtraction(45,12);
        subtraction(23, 55);
        addition(128,787);
        addition(528,387);
        multiplication(124, 87);
        multiplication(1528, 3);
    }
}


