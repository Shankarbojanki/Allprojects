package Practceall;

public class Referencevarobject {
    int id;
    String name;

}
class Studentreference {
    public static void main(String[] args) {
        Referencevarobject s1= new Referencevarobject();
        Referencevarobject s2= new Referencevarobject();

        s1.id=32;
        s1.name="shankar";
        s2.id=45;
        s2.name="appalanaidu";

        System.out.println(s1.id+" " +s1.name);
        System.out.println(s2.id+" " +s2.name);

    }
}
