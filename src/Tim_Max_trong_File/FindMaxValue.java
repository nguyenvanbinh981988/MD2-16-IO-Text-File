package Tim_Max_trong_File;

import Tim_Max_trong_File.ReadMaxInFile;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int maxInFile(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap link file: ");
        String number = scanner.nextLine();


        ReadMaxInFile readMaxInFile = new ReadMaxInFile();
        List<Integer> numbers = readMaxInFile.readFile(number);
        int maxValue = maxInFile(numbers);
        readMaxInFile.writeFile(number, maxValue);
    }
}