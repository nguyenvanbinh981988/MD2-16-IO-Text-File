package CodeGymManage;

import java.util.Date;

public class Classes {

    private String stt;
    private String startDay;
    private String course;
    private String numberOfStudent;

    public Classes() {
    }

    public Classes(String stt,String startDay, String course, String numberOfStudent) {
        this.stt = stt;
        this.startDay = startDay;
        this.course = course;
        this.numberOfStudent = numberOfStudent;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(String numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return stt +
                "," + startDay +
                "," + course +
                "," + numberOfStudent ;
    }

    public String toStringlong(){
        return "Classes{" +
                "stt=" + stt +
                ", startDay='" + startDay + '\'' +
                ", course='" + course + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }



}
