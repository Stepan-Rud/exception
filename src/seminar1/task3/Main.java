package src.seminar1.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//                Метод должен пройтись по каждому элементу и проверить что он не равен null.
//                А теперь реализуйте следующую логику:
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
        checkArray(new Integer[]{1,2,null, null});
    }
    public static void checkArray(Integer[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null) list.add(i);
        }
        if (list.size() > 0) throw new RuntimeException("Индексы элементов массива содержащие null " + list);
    }
}
