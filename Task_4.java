// 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному 
// элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, которое пользователь 
// может увидеть - RuntimeException, т.е. ваше.

public class Task_4 {

    public static int[] divisionElements(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            throw new RuntimeException("Массивы разной длины");
        }
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0){
                throw new RuntimeException("Элемент равен 0. Делить на 0 нельзя");
            }
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 8, 6, 6};
        int[] arr2 = {5, 4, 3, 6};
        //int[] arr2 = {5, 4, 3};
        //int[] arr2 = {5, 4, 0, 6};

        int[] res = divisionElements(arr1, arr2);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    
}
