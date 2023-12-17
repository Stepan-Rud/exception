//package src.seminar2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Task1Var2 {
//
//    public static void main(String[] args) {
//        String patch = "C:\\Users\\Кирилл\\Desktop\\rabota\\gb\\Ex\\sem2\\seminar03.12.2023\\src\\name.txt";
//        List<String[]> arrayNames = readFile(patch);
//        upArray(arrayNames);
//        writeFile(patch, arrayNames);
//
//    }
//
//    public static List<String[]> readFile(String patch){
//        List<String[]> arrayNames = new ArrayList<>();
//        try(BufferedReader reader = new BufferedReader(new FileReader(patch))) {
//
//            String line;
//            while ((line = reader.readLine()) != null){
//                arrayNames.add(line.split("="));
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        return arrayNames;
//    }
//
//    public static void upArray(List<String[]> arrrsyNames){
//        for (String[] i : arrrsyNames) {
//            if(!i[1].equals("?") && !checkString(i[1])){
//                throw new IllegalArgumentException("Эленет не ? и не число");
//            }
//            i[1] = String.valueOf(i[0].length());
//        }
//    }
//
//    public static boolean checkString(String value){
//        try {
//            Integer.parseInt(value);
//            Float.valueOf(value);
//            return true;
//        }catch (NumberFormatException e){
//            return false;
//        }
//    }
//
//    public static void writeFile(String patch, List<String[]> arrayNames){
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(patch));
//            for (String[] i : arrayNames ) {
//                writer.write(i[0] + "=" + i[1] + "\n");
//            }
//            writer.close();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        }
//    }
//
