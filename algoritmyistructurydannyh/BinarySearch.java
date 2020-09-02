package edu.trenirovkadoma.algoritmyistructurydannyh;
/*
алгоритм бинарного поиска
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a ={-5, -2, 1, 5, 6, 8, 10, 20};
        System.out.println("index = " + binarySearch(a, 1));

        // пример вызова метода c рекурсией
        int[] b = {-5, -2, 1, 5, 6, 8, 10, 20};
        System.out.println("index = " + binarySearch(b, 1, 0, b.length - 1)); // начальные low и high надо передавать в аргументы
    }
    public static int binarySearch(int [] a, int key){
        int low = 0;
        int high = a.length -1;

        while(low <= high){
            int middle = low + (high - low) / 2;

            if(key < a[middle]) {
                high = middle -1;
            } else if (key > a[middle]){
                low = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
    // с помощью рекурсии
    public static int binarySearch(int[] sortedArray, int key, int low, int high) {
        // считаем индекс центрального элемента
        int middle = low + (high - low) / 2;

        // base case (условие выхода) - регион поиска пустой
        if (low > high) {
            // не нашли элемента, который равен ключу
            return -1;
        }

        if (key == sortedArray[middle]) {
            // в случае, если элемент в центре равняется ключу (нашли элемент)
            return middle;
        } else if (key < sortedArray[middle]) {
            // рекурсивный вызов для левого подмассива
            // не забывайте здесь ключевое слово return (подумайте, зачем оно нужно)
            return binarySearch(sortedArray, key, low, middle - 1);
        } else {
            // рекурсивный вызов для правого помассива
            return binarySearch(sortedArray, key, middle + 1, high);
        }
    }
}
