package _22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {
    static void main(String[] args) {
        System.out.println("--- The King's Secret Archive ----");

        String spyData = "Name: Arthur Pendragon\nAge: 35\nProfession: Royal Spy\nSkills: Stealth, Daggers, Deception";
        String zipFilePath = "src/_22/spyArchive.zip";
        String internalFileName = "spyInfo.txt";

        System.out.println("Compressing spy data into ZIP archive...");

        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            ZipEntry entry = new ZipEntry(internalFileName);
            zos.putNextEntry(entry);

            zos.write(spyData.getBytes());

            zos.closeEntry();
            System.out.println("Success! Data compressed to minimum size.\n");

        } catch (IOException e) {
            System.out.println("Compression failed: " + e.getMessage());
        }

        System.out.println("--- Reading from the secret archive ---");

        try (FileInputStream fis = new FileInputStream(zipFilePath);
             ZipInputStream zis = new ZipInputStream(fis)) {

            ZipEntry entry = zis.getNextEntry();

            if (entry != null) {
                System.out.println("Found hidden file: " + entry.getName());

                byte[] buffer = zis.readAllBytes();

                String extractedData = new String(buffer);

                System.out.println("Extracted Data:\n" + extractedData);
            }

        } catch (IOException e) {
            System.out.println("Extraction failed: " + e.getMessage());
        }
    }
}
