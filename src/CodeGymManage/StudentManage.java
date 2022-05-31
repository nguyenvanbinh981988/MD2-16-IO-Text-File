package CodeGymManage;


import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class StudentManage {
    Scanner input = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    List<Classes> classes = new ArrayList<>();


    public void menu() throws ParseException, IOException {
        System.out.println("Menu:");
        System.out.println("1. add Class");
        System.out.println("2. show Class");
        System.out.println("3. add student");
        System.out.println("4. show studentList");
        System.out.println("5. show studentListFollowClass");
        System.out.println("6. Exit");


        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                addClasses();
                break;
            case 2:
                showClass();
                break;
            case 3:
                addStudent();
                break;
            case 4:
                showStudent();
                break;
            case 5:
                showFollowClass();
                break;
            case 6:
                System.exit(0);
        }

    }


    public void addClasses() {
        readFile();

        System.out.println("Add new class");
        System.out.println("Enter starday of Class");
        String startDay = input.nextLine();
        System.out.println("Enter course");
        String course = input.nextLine();
        System.out.println("Enter number of Student");
        String numberOfStudent = input.nextLine();


        Classes lop = new Classes(Integer.toString(classes.size() ), startDay, course, numberOfStudent);
        classes.add(lop);

        writeFile();
    }


    public void showClass() {
        readFile();
        System.out.println("this is classList:");
        for (Classes cl : classes) {
            System.out.println(cl.toStringlong());
        }
    }


    public void addStudent() {
        readFile();
        readFileStudent();

        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter age");
        String age = input.nextLine();
        System.out.println("Enter BirthDay");
        String birth = input.nextLine();
        System.out.println("Enter Phone");
        String phone = input.nextLine();
        System.out.println("Enter Address");
        String address = input.nextLine();


        showClass();
        System.out.println("Enter Stt of class");
        String sttOffClass = input.nextLine();
        Classes lop = null;

        for (int i = 0; i < classes.size(); i++) {
            if (sttOffClass.equals(classes.get(i).getStt())) {
                 lop = classes.get(i);
                break;
            }
        }


            Student student = new Student(Integer.toString(students.size()) , name, age, birth, phone, address, lop);
            students.add(student);


        writeFileStudents();
    }


    public void showStudent() {
        readFile();
        readFileStudent();
        System.out.println("this is studentList");
        for (Student st : students) {
            System.out.println(st);
        }
    }


    public void showFollowClass() {
        readFile();
        readFileStudent();

        System.out.println("Enter Course");
        String course = input.nextLine();


        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLop().getCourse().equals(course)) {
                System.out.println(students.get(i));
            }

        }

    }



    public List<Classes> readFile() {
        try {
            File file = new File("D:\\00. Codegym\\02. Module 2\\16. IO Text File\\IO_Text_File\\src\\CodeGymManage\\Classes.csv");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String str1 = bufferedReader.readLine();
            classes.clear();
            while (str1 != null) {
                String[] arr1 = str1.split(",");
                String stt = arr1[0];
                String startDay1 = arr1[1];
                String course1 = arr1[2];
                String numberOfStudent1 = arr1[3];
                Classes lop = new Classes(stt, startDay1, course1, numberOfStudent1);
                classes.add(lop);
                str1 = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }


    public void writeFile() {
        File file = new File("D:\\00. Codegym\\02. Module 2\\16. IO Text File\\IO_Text_File\\src\\CodeGymManage\\Classes.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Classes cl : classes) {
                bufferedWriter.write(cl.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public List<Student> readFileStudent(){
        try {
            File file = new File("D:\\00. Codegym\\02. Module 2\\16. IO Text File\\IO_Text_File\\src\\CodeGymManage\\Students.csv");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String str = bufferedReader.readLine();
            students.clear();
            while (str != null) {
                String[] arr = str.split(",");
                String stt = arr[0];
                String name = arr[1];
                String age = arr[2];
                String birth = arr[3];
                String phone = arr[4];
                String address = arr[5];

                String classCourse = arr[6];
                Classes lop1 = null;

                for (int i = 0; i < classes.size(); i++) {
                    if (classCourse.equals(classes.get(i).getCourse())){
                         lop1 = classes.get(i);
                         break;
                    }
                }

                Student stu = new Student(stt,name,age,birth,phone,address,lop1);
                students.add(stu);
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }




    public void writeFileStudents() {
        File file = new File("D:\\00. Codegym\\02. Module 2\\16. IO Text File\\IO_Text_File\\src\\CodeGymManage\\Students.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Student st : students) {
                bufferedWriter.write(st.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
