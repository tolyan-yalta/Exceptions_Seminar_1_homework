// 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, 
//необходимо как-то оповестить пользователя.

public class Task_3 {

    public static int[] differenceElements(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            throw new RuntimeException("Массивы разной длины");
        }
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 8, 7, 6};
        //int[] arr2 = {5, 4, 3, 6};
        int[] arr2 = {5, 4, 3};
        int[] res = differenceElements(arr1, arr2);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
