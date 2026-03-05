package _23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- The Mage's Library Search ---");

        String directoryToSearch = "src/_21";
        String searchKeyword = "secret";

        Path dirPath = Paths.get(directoryToSearch);

        if (!Files.exists(dirPath) || !Files.isDirectory(dirPath)) {
            System.out.println("The shelf '" + directoryToSearch + "' does not exist or is not a directory!");
            return;
        }

        System.out.println("Looking into shelf: " + directoryToSearch);

        try (Stream<Path> paths = Files.list(dirPath)) {

            List<Path> allFiles = paths.collect(Collectors.toList());
            boolean foundMatch = false;

            System.out.println("Scrolls found on the shelf:");

            for (Path path : allFiles) {
                String fileName = path.getFileName().toString();
                System.out.println("- " + fileName);

                if (fileName.contains(searchKeyword)) {
                    foundMatch = true;
                }
            }

            System.out.println("\n--- Search Results ---");
            if (foundMatch) {
                System.out.println("Success! Found a scroll containing the word '" + searchKeyword + "'!");
            } else {
                System.out.println("No scrolls found with the word '" + searchKeyword + "'.");
            }

        } catch (IOException e) {
            System.out.println("The library is locked! Critical Error: " + e.getMessage());
        }
    }
}
