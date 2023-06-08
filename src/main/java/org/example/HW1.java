package org.example;

public class HW1 {
    public static void main(String[] args) {
        //indexException();
        //mathException();
        //formatException();
        //twoArrays();
       /*String[][] ints = new String[][]{
            { "a1", "a2", "a3" },
            { "b1", "b2", "b3" },
            { "a1", "c2", "a1" }
        };*/
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 3, 1, 1}
        };

        int x = sum2d(ints);

    }
    public static void indexException(){
        //исключение по индексу элемента массива
        int[] arr={1, 9, 10, 69, 5};
        int A = arr[6];
    }
    public static void mathException(){
        //исключение математическое
        int a = 10;
        int b = 0;
        int c = a/b;

    }
    public static void formatException(){
        //исключение по формату числа
        int num = Integer.parseInt ("abbr") ;
        System.out.println(num);
    }

    public static void twoArrays() {
        //задание 3 по созданию массива из двух других массивов
        int[] arr1 = {1, 8, -12, 9, 7};
        int[] arr2 = {0, 55, 84};
        if (arr1.length == arr2.length) {
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i <= arr1.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
        }
        else {
            System.out.println("Для создания нового массива длины имеющихся массивов должны совпадать");
        }
    }
    public static int sum2d(int[][] arr) {
        //задание 2
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = (arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    //обнаружено исключение - at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
}

