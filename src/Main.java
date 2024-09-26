import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Data;
import models.StudentList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students' data you want to add:");
        int students_datacount = sc.nextInt();
        StudentList[] studentarr = new StudentList[students_datacount];

        System.out.println("Enter number of subjects you want to add:");
        int subjects_count = sc.nextInt();
        double marks_obtained;

        Data[] dataarr = new Data[subjects_count];

        for (int i = 0; i < students_datacount; i++) {
            List<Data> dat_list = new ArrayList<>();
            System.out.println("Enter student_roll:");
            int student_roll = sc.nextInt();
            System.out.println("Enter student_name:");
            String student_name = sc.next();
            for (int j = 0; j < subjects_count; j++) {
                System.out.println("Enter subject code, subject name, and marks obtained:");
                String sub_code = sc.next();
                String sub_name = sc.next();
                do {
                    marks_obtained = sc.nextDouble();
                    if (marks_obtained < 0 || marks_obtained > 100) {
                        System.out.println("Enter marks between 0 and 100");
                    }
                } while (marks_obtained < 0 || marks_obtained > 100);
                dataarr[i] = new Data(sub_code, sub_name, marks_obtained);
                dat_list.add(dataarr[i]);
            }
            studentarr[i] = new StudentList(student_roll, student_name, dat_list);
        }
        for(int i=0;i<subjects_count;i++)
        {
            studentarr[i].custom_func(subjects_count);
        }
    }
}