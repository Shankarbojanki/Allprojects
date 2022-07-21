import java.util.*;

public class zoo {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        Scanner input1 =new Scanner (System.in);
        Scanner input2 =new Scanner (System.in);
        int st;
        Collection<zoo> zoo = new ArrayList<zoo>();
        Collection<Lion> lions = new ArrayList<Lion>();
        Collection<Elephant>  elephants = new ArrayList<Elephant>();

         do{
             System.out.println("enter ur input");
             System.out.println("1.add");
             System.out.println("2.Display");
             System.out.println("3.Search");



             st =input.nextInt();
             switch(st) {
                 case 1:
                     int s;
                     do {
                         System.out.println("choose animal");
                         System.out.println("1.lion");
                         System.out.println("2.Elephant");
                         System.out.println("3.main menu");
                         s = input.nextInt();
                         switch (s) {
                             case 1:
                                 System.out.println("enter name :  ");
                                 String lionname = input.next();
                                 System.out.println("enter age  :  ");
                                 int lionage = input1.nextInt();
                                 System.out.println("enter year of join  :  ");
                                 int lionjoinyr = input2.nextInt();
                                 lions.add(new Lion(lionname, lionage, lionjoinyr));
                                 break;
                             case 2:
                                 System.out.println("enter name :  ");
                                 String elephantname = input.next();
                                 System.out.println("enter age  :  ");
                                 int elephantage = input1.nextInt();
                                 System.out.println("enter year of join  :  ");
                                 int elephantjoinyr = input2.nextInt();
                                 lions.add(new Elephant(elephantname, elephantage, elephantjoinyr));
                                 break;
                         }
                     }
                     while (s!=3);
                     break;
                 case 2:
                     System.out.println("---------");
                     Iterator<Lion> i = lions.iterator();
                     Iterator<Elephant> k = elephants.iterator();
                     while (i.hasNext()) {
                         Lion e = i.next();
                         Elephant j;
                         j = k.next();
                         System.out.println("list of lions ");
                         System.out.println(e);
                         System.out.println("list of elephants ");
                         System.out.println(j);
                         System.out.println("----------");
                     }
                     break;
                 default:
                     throw new IllegalStateException("Unexpected value: " + st);
             }
             }
             while (st != 0);
    }
}

