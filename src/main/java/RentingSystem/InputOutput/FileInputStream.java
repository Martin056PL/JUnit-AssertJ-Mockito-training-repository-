package RentingSystem.InputOutput;

import java.io.*;

public class FileInputStream {

    public static void readWriteToFile() throws IOException {

        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/base.txt"))) {

            String participant;

            while ((participant = fileReader.readLine()) != null) {
                System.out.println(participant);
            }
        }catch (IOException e){
            System.out.println("Błąd wejścia wyjścia " + e);
        }
    }
}

