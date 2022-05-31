package CodeGymManage;

import java.io.IOException;
import java.text.ParseException;

public class Running {
    public static void main(String[] args) throws ParseException, IOException {
        StudentManage studentManage = new StudentManage();
        while (true){
            studentManage.menu();
        }
    }
}
