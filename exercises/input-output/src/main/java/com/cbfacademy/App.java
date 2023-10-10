package com.cbfacademy;

import java.io.FileReader;
import java.nio.*;

public class App {
    public static void main(String[] args) {

        String inputFilePath = "/Users/bettydemissie/Desktop/Entry to Tech/java-exercises/java-exercises-bettydemissie/exercises/input-output/src/main/resources/exercise.txt";

        try (FileReader fileReader = new FileReader(inputFilePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String outputFilePath = "src/main/resources/output.txt";

        try (FileReader fileReader = new FileReader(inputFilePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(outputFilePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); 
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
