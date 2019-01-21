public class Lesson2 {
    public static void main(String[] args) {
        //--------------------------------------------Задание 1---------------------------------------------------------
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1.\nЗадать целочисленный массив, состоящий из элементов 0 и 1. " +
                "Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].\n" +
                "С помощью цикла и условия заменить 0 на 1, 1 на 0.\n\nИсходный массив: ");
        printArray(arr1);
        System.out.println("\nИзмененный массив: ");
        Task1(arr1);
        System.out.println("\n----------------------------------------------------------------------------------------");

        //--------------------------------------------Задание 2---------------------------------------------------------
        int[] arr2 = new int[8];
        Task2(arr2);
        System.out.println("\nЗадание 2.\nЗадать пустой целочисленный массив размером 8. С помощью цикла заполнить его" +
                " значениями 0 3 6 9 12 15 18 21.\n\nРезультат: \t");
        printArray(arr2);
        System.out.println("\n----------------------------------------------------------------------------------------");

        //--------------------------------------------Задание 3---------------------------------------------------------
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nЗадание 3.\nЗадать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],\n" +
                "пройти по нему циклом, и числа, меньшие 6, умножить на 2.\n\nИсходный массив:");
        printArray(arr3);
        Task3(arr3);
        System.out.println("\nИзмененный масcив:");
        printArray(arr3);
        System.out.println("\n----------------------------------------------------------------------------------------");

        //--------------------------------------------Задание 4---------------------------------------------------------
        int[][] arr4 = {{4,4,4,4},{4,2,2,4},{4,2,2,4},{4,4,4,4}};
        System.out.println("\nЗадание 4.\nСоздать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),\n" +
                "и с помощью цикла(-ов) заполнить его диагональные элементы единицами.\n\nИсходный массив:\n");
        printArray(arr4);
        System.out.println("\nИзмененный массив:\n");
        Task4(arr4);
        printArray(arr4);
        System.out.println("\n----------------------------------------------------------------------------------------");

        //--------------------------------------------Задание 5---------------------------------------------------------
        int[] arr5 = {1, 5, 3, 2};
        System.out.println("\nЗадание 5.\nЗадать одномерный массив и найти в нем минимальный и максимальный элементы.\n\nМассив:");
        printArray(arr5);
        Task5(arr5);
        System.out.println("\n----------------------------------------------------------------------------------------");

        //--------------------------------------------Задание 6---------------------------------------------------------
        int[] arr6 = {1, 1, 1, 2, 1};
        int[] arr7 = {2, 1, 1, 2, 1};
        System.out.println("\nЗадание 6.\nНаписать метод, в который передается не пустой одномерный целочисленный массив, " +
                "метод \nдолжен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. " +
                "\nПримеры: \n checkBalance([1, 1, 1, || 2, 1]) → true, \n checkBalance ([2, 1, 1, 2, 1]) → false," +
                " \n checkBalance ([10, || 10]) → true, \nграница показана символами ||," +
                " эти символы в массив не входят.\n\nМассив 1:");
        printArray(arr6);
        System.out.println("\nРезультат: "+Task6(arr6));
        System.out.println("\nМассив 2:");
        printArray(arr7);
        System.out.println("\nРезультат: "+Task6(arr7));
        System.out.println("\n----------------------------------------------------------------------------------------");

        //--------------------------------------------Задание 7---------------------------------------------------------
        int[] arr8 = {2, 1, 1, 2, 1};
        int n = 6;
        System.out.println("\nЗадание 7*.\nНаписать метод, которому на вход подается одномерный массив и число n" +
                "(может быть положительным или отрицательным), \nпри этом метод должен сместить все элементы массива" +
                " на n позиций. Нельзя пользоваться вспомогательными массивами.\n\nИсходный массив:");
        printArray(arr8);
        System.out.println("\nШаг для смещения элементов массива: " + n);
        Task7(arr8, n);
        System.out.println("\nИзмененный массив: ");
        printArray(arr8);
        System.out.println("\n----------------------------------------------------------------------------------------");
        }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
    }
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void Task1(int[] arr){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
            System.out.print(arr[i] +"\t");
        }
    }
    static void Task2(int[] arr){
        int t = 0;
        for (int i=0; i<arr.length; i++){
            arr[i]=t;
            t+=3;
        }
    }
    static void Task3(int[] arr){
        for(int i=0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
    }
    static void Task4(int[][] arr){
        for (int i=0; i < arr.length; i++){
            for (int j=0; j < arr[i].length; j++){
                if(i == j){
                    arr[i][j] = 1;
                }
            }
        }
        int t = 0;
        for (int i = 0; i < arr.length; i++){
            int j = arr.length - 1;
                arr[i][j-t] = 1;
                t++;
        }
    }
    static void Task5(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("\nСамое большое число в исходном массиве: " + max + "\nСамое маленькое число в исходном массиве: "+min);
    }
    static boolean Task6(int[] arr){
        int arrHalf = arr.length / 2;
        if(arr.length % 2 !=0){
            arrHalf = arrHalf + 1;
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i <= arrHalf - 1; i++ ){
            a += arr[i];
        }
        for (int i = arr.length -1 ; i >= arrHalf; i-- ){
            b += arr[i];
        }
        if(a==b){
            return true;
        }
        else {return false;}
    }
    static void Task7(int[] arr, int n){
        if(n > 0){
            for(int i = 0; i < n; i++){
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }
        }
        else if(n < 0){
            for (int i = 0; i < Math.abs(n); i++){
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++ ){
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
    }
}
