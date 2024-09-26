package models;

import java.util.List;

public class StudentList {
    int student_roll;
    String student_name;
    List<Data> dataList;

    public StudentList(int student_roll, String student_name, List<Data> dataList) {
        this.student_roll = student_roll;
        this.student_name = student_name;
        this.dataList = dataList;
    }

    public int getStudent_roll() {
        return student_roll;
    }

    public void setStudent_roll(int student_roll) {
        this.student_roll = student_roll;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    public void custom_func(int subject_count)
    {
        double total=0;
        int hereroll=this.student_roll;
        String herename=this.student_name;
        List<Data> heredata=this.dataList;
        System.out.println("******Student Result****");
        System.out.println("Student Roll No:"+hereroll);
        System.out.println("Student Name:"+herename);
        System.out.println("Subject Code**********Subject Name********Marks Obtained*******Total Marks");
        for(Data x:heredata)
        {
            System.out.println(x.getSubject_code()+"*****************"+x.getSubject_name()+"*****************"+x.getMarks()+"********************100");
            total=total+x.getMarks();
        }
        System.out.println("\n\nTotal Marks Obtained:"+total);
        double per=total/subject_count;
        System.out.println("Percentage Obtained:"+per);
        if(per>=90)
        {
            System.out.println("Grade:A+");
        }
        else if(per>=80 && per<90)
        {
            System.out.println("Grade:A");
        }
        else if(per>=70 && per<80)
        {
            System.out.println("Grade:B+");
        }
        else if(per>=60 && per<70)
        {
            System.out.println("Grade:B");
        }
        else if(per>=50 && per<60)
        {
            System.out.println("Grade: C+");
        }
        else
        {
            System.out.println("Grade:NG");
        }
        System.out.println("\n\n");
    }
}
