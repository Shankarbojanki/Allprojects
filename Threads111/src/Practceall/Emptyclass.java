package Practceall;

public class Emptyclass {
//    public static void main(String[] args) {
//        int number=2;
//        findevenodd(number);
//    }
//
//    private static void findevenodd(int number) {
//        if (number%2==0) {
//            System.out.println("even");
//        } else
//            System.out.println("odd");
//    }
    //////////////////////////////
//    public static void main(String[] args) {
//        int a=3;
//        int b=4;
//        int c=add(a,b);
//
//        System.out.println(c);
//    }
//    private static int add(int a,int b) {
//         return a+b;
//    }
    ///////////////////////////////////
//public static void main(String[] args) {
//    display();
//}
//
//    private static void display() {
//        System.out.println("this is static method");
//    }
    //////////////////////////////


//    public static void main(String[] args) {
//
//        Emptyclass obj = new Emptyclass();
//
//        System.out.println(obj.add(4,5));
//    }
//    int s;
//    public int add(int a, int b){
//
//
//        s= a+b;
//        return s;
//    }

    /////////////////////////////////////////
//
//    Emptyclass(){
//            System.out.println("default ");
//        }
//        public static void main (String [] args) {
//            Emptyclass b1 = new Emptyclass();
//        }

    /////////////////////////////////////////////////////////////

//    int id;
//    String name;
//    Emptyclass(int id, String name) {
//       this.id=id;
//       this.name=name;
//    }
//    void display(){
//        System.out.println(id+ "  " + name);
//    }
//    public static void main (String [] args) {
//        Emptyclass s1 = new Emptyclass(1,"shankar");
//        Emptyclass s2 = new Emptyclass(1,"shankar");
//        s1.display();
//        s2.display();
//    }

    int id;
    String name;
    int attendence;
    Emptyclass(int id, String name) {
        this.id=id;
        this.name=name;
    }
    Emptyclass(int id, String name,int attendence)  {
        this.id=id;
        this.name=name;
        this.attendence=attendence;
    }
    void display(){
        System.out.println(id+ "  " + name +" "+attendence);
    }
    public static void main (String [] args) {
        Emptyclass s1 = new Emptyclass(1,"shankar");
        Emptyclass s2 = new Emptyclass(34,"shabo",345);
        s1.display();
        s2.display();
    }
}