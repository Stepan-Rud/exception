package src.seminar2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Task1 {
//    """
//    Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
//    студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
//    значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
//    числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
//    """

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader((new FileReader("src/seminar2/Names.txt")));


            HashMap<String, Integer> names = new HashMap<>();
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Invalid line: " + line);
                }
                if (parts[1].equals("?")) {
                    parts[1] = parts[0].length() + "";
                }
                System.out.println(parts[0] + "=" + parts[1] + "\n");

                names.put(parts[0], Integer.parseInt(parts[1]));

            }

            BufferedWriter writer = new BufferedWriter((new FileWriter("src/seminar2/Names.txt")));

            for(String name : names.keySet()) {
                writer.write(name + "=" + names.get(name) + "\n");
                System.out.println(name + "=" + names.get(name) + "\n");
            }
            reader.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
