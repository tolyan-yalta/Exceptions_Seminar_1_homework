// 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

// Реализованы методы с исключениями:
// 1. ArithmeticException
// 2. NumberFormatException
// 3. NegativeArraySizeException

public class Task_1 {
    public static void main(String[] args) {

        int x = 10; int y = 0;
        //resultDivision(x, y);
        String value = "abc";
        //transformation(value);
        int length = -2;
        initiationArray(length);

    }
    
    // Если вторым аргументом передадим 0, то получим
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    public static void resultDivision(int a, int b) {
        int res = 0;
        res = a / b;
        System.out.println(res);
    }

    // Если в строке вместо числа будет текст, то получим
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
    public static void transformation(String value){
        Integer res = Integer.valueOf(value);
        System.out.println(res);
    }
    
    // Если аргументом передадим отрицательное число, то получим
    // Exception in thread "main" java.lang.NegativeArraySizeException: -2
    public static void initiationArray(int number) {
        int[] arr = new int[number];
        int length = arr.length;
        System.out.println(length);
    }
}
