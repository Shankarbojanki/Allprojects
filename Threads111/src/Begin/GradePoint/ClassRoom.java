package Begin.GradePoint;


public class ClassRoom {
  public static void main(String[] args) {
    Student shankar=new Student("Shankar");

    shankar.add("Maths",'D');
    shankar.add("Science",'A');
    shankar.add("Biology",'B');
    shankar.add("Social",'D');

    System.out.println(shankar.getName() + "has a GPA of " +shankar.getGPA()+" "+shankar.getSubjects());

    for (String str:shankar.getSubjects()){
      System.out.println(str);
    }
  }
}
