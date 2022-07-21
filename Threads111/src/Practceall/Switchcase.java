package Practceall;

public class Switchcase {
    public static void main(String[] args) {

        //The Java switch statement executes one statement from multiple conditions.
        // It is like if-else-if ladder statement. The switch statement works with byte,
        // short, int, long, enum types, String and some wrapper types like Byte, Short,
        // Int, and Long. Since Java 7, you can use strings in the switch statement.

        int choice=40;
        switch (choice) {
            case 10:
                System.out.println("number 10");
                break;
            case 20:
                System.out.println("number 20");
                break;
            case 30:
                System.out.println("number 30");
                break;
            case 40: case 50: case 60:
                System.out.println("number 40 or 50 or 60");
                break;
            default:
                System.out.println("number not found");
                break;
        }

          int month =11;
          String monthstring ="";

          switch (month) {
              case 1: monthstring="1-jan";
                    break;
              case 2:monthstring= "2-feb";
                    break;
              case 3:monthstring= "3-mar";
                    break;
              case 4: monthstring ="4-feb";
                    break;
              case 5: monthstring="5- may ";
                    break;
              case 6: monthstring="6-june";
                    break;
              case 7: case 8: case 9: case 10: case 11: case 12:
                  monthstring="7 or 8 or 9 or 10 or 11 or 12";
                  break;
              default:monthstring="invalid month";
          }
             System.out.println(monthstring);


          //switch string
          int level=0;
          String levelstring="expert";

          switch (levelstring) {
              case "beginner" : level=1;
              break;
              case "intermediate" : level=2;
              break;
              case "expert" :level=3;
              break;
              default:
                  System.out.println("try again");
             }
                 System.out.println("level: "+level);


             int collegeyear =4;
             char branch='c';

             switch (collegeyear){
                 case 1:
                     System.out.println(" maths,physics,chemistry");
                     break;
                 case 2:
                     switch (branch) {
                         case 'c' :
                             System.out.println("2 nd cse subjects");
                             break;
                         case 'e':
                             System.out.println("2 nd eee subjects");
                             break;
                         case 'm':
                             System.out.println("2 nd year mech subjects");
                             break;
                         default:
                             System.out.println("invalid branch");
                     }
                     break;
                 case 3:
                     switch (branch) {
                         case 'c':
                             System.out.println(" 3 rd yr cse subjects");
                             break;
                         case'e':
                             System.out.println("3 rd yr eee subjects");
                             break;
                         case 'm':
                             System.out.println("3 rd yr mech subjects");
                             break;
                     }
                     break;
                 case 4:
                     switch (branch) {
                         case 'c':
                             System.out.println(" 4 th yr cse subjects");
                             break;
                         case'e':
                             System.out.println("4 th yr eee subjects");
                             break;
                         case 'm':
                             System.out.println("4 th yr mech subjects");
                             break;
                     }
                 default:
                     System.out.println("invalid yr");
             }
    }
}
