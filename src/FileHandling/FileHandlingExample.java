package FileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Create a new file
        createFile("example.txt");

        // Write data to a file
        writeFile("example.txt", "Hello, World!");

        // Read data from a file
        String content = readFile("example.txt");
        System.out.println("File Content: " + content);

        // Append data to an existing file
        appendFile("example.txt", "\nThis is an additional line.");

        // Check if a file exists
        boolean fileExists = exists("example.txt");
        System.out.println("File Exists: " + fileExists);

        // Create a directory
        createDirectory("myDir");

        // List files in a directory
        listFiles("myDir");

        // Delete a file
        deleteFile("example.txt");

        // Delete an empty directory
        deleteDirectory("myDir");
    }

    // Create a new file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    // Write data to a file
    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Data written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Read data from a file
    public static String readFile(String fileName) {
        try {
            byte[] encodedBytes = Files.readAllBytes(Paths.get(fileName));
            return new String(encodedBytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return null;
    }

    // Append data to an existing file
    public static void appendFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
            System.out.println("Data appended to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }

    //Create a file and write text into it
    private static void saveDecompressedText(String text, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Check if a file exists
    public static boolean exists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

    // Create a directory
    public static void createDirectory(String directoryName) {
        File directory = new File(directoryName);
        boolean created = directory.mkdirs();
        if (created) {
            System.out.println("Directory created: " + directoryName);
        } else {
            System.out.println("Directory already exists: " + directoryName);
        }
    }

    // List files in a directory
    public static void listFiles(String directoryName) {
        File directory = new File(directoryName);
        File[] files = directory.listFiles();
        if (files != null) {
            System.out.println("Files in directory " + directoryName + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Directory not found: " + directoryName);
        }
    }

    // Delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("File deleted: " + fileName);
        } else {
            System.out.println("File not found or could not be deleted: " + fileName);
        }
    }

    // Delete an empty directory
    public static void deleteDirectory(String directoryName) {
        File directory = new File(directoryName);
        boolean deleted = directory.delete();
        if (deleted) {
            System.out.println("Directory deleted: " + directoryName);
        } else {
            System.out.println("Directory not found or not empty: " + directoryName);
        }
    }
}
