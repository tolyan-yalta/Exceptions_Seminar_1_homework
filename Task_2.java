// 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

// Удалось получить исключения:
// 1. ArrayIndexOutOfBoundsException
// 2. NumberFormatException
// 3. NullPointerException

public class Task_2 {
    public static void main(String[] args) {

        // Рабочий вариант (исключений нет)
        String[][] arr = {{"1", "0", "2", "3", "4"}, {"2", "3", "5", "6", "7"}};

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        //String[][] arr = {{"1", "0", "2", "3"}, {"2", "3", "5", "6"}};

        // Exception in thread "main" java.lang.NumberFormatException: For input string: "1.3"
        //String[][] arr = {{"1.3", "0", "2", "3", "4"}, {"2", "3", "5", "6", "7"}};

        // Exception in thread "main" java.lang.NullPointerException: Cannot load from object array because "arr[i]" is null
        //String[][] arr = {null};

        int res = sum2d(arr);
        System.out.println(res);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
         }
        return sum;
    }
}