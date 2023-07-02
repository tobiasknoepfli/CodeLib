package main;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FileHandling {
    public static void main(String[] args) {
        Random random = new Random();

//        GET THE PATH OF THE CURRENT DIRECTORY
        File currentDir = new File(".");
        System.out.println(currentDir.getAbsolutePath());

//        MODIFY THE PATH OF THE CURRENT DIRECTORY
        File src = new File(currentDir + "/src/");
        System.out.println(src.getAbsolutePath());

//        FINDING THE CURRENT USER'S DIRECTORY
        File user = new File(System.getProperty("user.dir"));
        System.out.println(user.getAbsolutePath());

//        SYSTEM.GETPROPERTY COMMANDS
        /*  java.version        Java Runtime Environment version
            java.class.path     location of Java class files and libraries
            java.library.path   location of native libraries
            os.name             Operating system name
            os.arch             Operating system architecture
            os.version          Operating system version
            file.separator      File separator character
            path.separator      Path separator character
            line.separator      Line separator character
            user.name           User account name
            user.home           User's home directory
            user.dir            Current working directory
            user.language       User's preferred language
            user.timezone       User's preferred time zone
            sun.desktop         User's desktop environment */

//        CREATING A FOLDER
        File folder = new File(src + "/files/");
        if (!folder.exists()) {
            boolean created = folder.mkdir();
            if (created) {
                System.out.println("Folder created: " + folder.getAbsolutePath());
            } else {
                System.out.println("Folder not created");
            }
        } else {
            System.out.println("Folder already exists");
        }

//        CREATING A FILE
        File file = new File(src + "/text.txt/");
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        WRITING INTO THE FILE
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 100; i++) {
                int rnd = random.nextInt(64, 129);
                char chr = (char) rnd;
                writer.write(chr);
            }
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        READING FROM THE FILE
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        MOVING A FILE
        try {
            Path source = file.toPath();
            Path targetFolder = folder.toPath().resolve(file.getName());
            Files.move(source, targetFolder, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved to: " + targetFolder.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        COPYING A FILE
        try {
            Path source = new File("." + "/src/files/text.txt").toPath();
            Path target = new File("." + "/src/files/text_copy.txt").toPath();
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Files copied to: " + target.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        DELETING A FILE
        try {
            Path target = new File("." + "/src/files/text.txt").toPath();
            Files.deleteIfExists(target);
            System.out.println("File deleted: " + target.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        LISTING CONTENTS OF A FOLDER
        Path filesFolder = new File("." + "/src/files").toPath();
        File fileA = new File("." + "/src/files/fileA.txt");
        File fileB = new File("." + "/src/files/fileB.txt");
        try {
            fileB.createNewFile();
            fileA.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File[] files = folder.listFiles();

        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }

//        DELETING CONTENTS OF A FOLDER
        Path deleteContents = new File("." + "/src/files").toPath();
        if (files != null) {
            for (File f : files) {
                if (!(f.getName().contains("text"))) {
                    f.delete();
                }
            }
        }
    }
}
