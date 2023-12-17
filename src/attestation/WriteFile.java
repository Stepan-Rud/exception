package src.attestation;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeData(String data, String patch){
        System.out.println(patch);
        System.out.println(patch.getClass().getSimpleName());
        try (FileWriter fileWriter = new FileWriter(patch, true)){
            fileWriter.append(data);
            fileWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
