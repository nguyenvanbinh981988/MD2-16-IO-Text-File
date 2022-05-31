package CodeGymManage;

import java.util.Date;

public class Student {

    private String stt;
    private String name;
    private String age;
    private String birth;
    private String phone;
    private String address;
    private Classes lop;

    public Student() {
    }

    public Student(String stt,String name, String age,String birth, String phone, String address, Classes lop) {
        this.stt=stt;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.phone = phone;
        this.address = address;
        this.lop = lop;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classes getLop() {
        return lop;
    }

    public void setLop(Classes lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return stt  +
                "," + name  +
                "," + age +
                "," + birth +
                "," + phone +
                "," + address  +
                "," + lop.getCourse() ;
    }
}
