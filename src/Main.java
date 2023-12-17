package src;

public class Main {
    public static void main(String[] args) {
//        Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//                Если длина массива меньше некоторого заданного минимума,
//        метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

//        System.out.println(arr(new int[]{1, 2, 3}, 3));
        printArr(subArrays(new int[]{5, 6, 7}, new int[]{1, 1, 1,}));
    }

    public static int arr(int[] arr, int lenArr) {
        if (arr.length < lenArr) {
            return -1;
        }
        return arr.length;
    }

    public static int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length != b.length) return new int[]{0};
        else for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i];

        }
        return c;
    }

        public static void printArr ( int[] a){
            for (int i : a) {
                System.out.println(i + " ");
            }
        }


    }

