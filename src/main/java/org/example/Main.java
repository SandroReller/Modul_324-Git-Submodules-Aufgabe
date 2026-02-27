package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        Path p = Path.of("submodul/value.txt");

        String s = Files.readString(p).trim();   // "67"
        int value = Integer.parseInt(s);// 67
        System.out.println("ich hole den Wert " +value + " vom Submodul und füge 2 hinzu");

        int result = value + 2;                  // 69
        System.out.println(result);
        }
    }
