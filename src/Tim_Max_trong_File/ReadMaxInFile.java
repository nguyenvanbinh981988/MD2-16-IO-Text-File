package Tim_Max_trong_File;

import java.io.*;
import java.util.*;

public class ReadMaxInFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br =new BufferedReader(new FileReader(file));
            String line = "";
            while ((line= br.readLine())!=null){
              numbers.add(Integer.parseInt(line));
                }
            br.close();
        }
        catch (Exception e){
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filepath, int max){
        try{
            FileWriter writer = new FileWriter(filepath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("\n Gia tri max la: " + max);
            bufferedWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
