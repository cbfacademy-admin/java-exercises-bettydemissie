package com.cbfacademy;

public class FileExtension {

    public int check(String fileName) throws Exception {
        if (fileName == null || fileName.isEmpty()) {
            throw new Exception("File name is null or empty");
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}
