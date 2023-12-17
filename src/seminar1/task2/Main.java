package src.seminar1.task2;

public class Main {
    public static void main(String[] args) {
//        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения: метод может работать только с
//        квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
        System.out.println(arrSum(new int[3][3]));
    }

    public static int arrSum(int[][] arr) {
        if (arr.length != arr[0].length) throw new RuntimeException("Массив не квадратный");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0 || arr[i][j] == 1) sum += arr[i][j];
                else throw new RuntimeException("Значение отлично от 0 или 1");
            }
        }
        return sum;
    }
}
