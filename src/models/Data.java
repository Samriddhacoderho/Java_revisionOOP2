package models;

public class Data {
    String subject_code;
    String subject_name;
    double marks;

    public Data(String subject_code, String subject_name, double marks) {
        this.subject_code = subject_code;
        this.subject_name = subject_name;
        this.marks = marks;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


}
