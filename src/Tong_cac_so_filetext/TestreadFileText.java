package Tong_cac_so_filetext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;

public class TestreadFileText {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file:");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

         ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
    }

