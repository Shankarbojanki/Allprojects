package Begin.GradePoint;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<String> subject;
    ArrayList<Character> grade;
     public  Student(String n) {
        name=n;
        subject=new ArrayList<String>();
        grade=new ArrayList<Character>();
    }

    public String getName() {
        return name;
    }
    public void add(String s,Character g) {
         subject.add(s);
         grade.add(g);
    }

    public ArrayList<String> getSubjects() {
        return subject;
    }
    public double getGPA() {
         double totalPoint=0.0;
         for(char g:grade) {
             switch (g) {
                 case'A' :
                   totalPoint+=4.0;
                   break;
                 case 'B':
                     totalPoint+=3.0;
                     break;
                 case 'C':
                     totalPoint+=2.0;
                     break;
                 case 'F':
                     totalPoint+=0.0;
             }
         }
         return totalPoint/ grade.size();
    }

}
