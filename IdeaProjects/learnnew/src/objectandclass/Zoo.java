
package objectandclass;


import java.util.ArrayList;

public class Zoo {
    public static void main(String args[]) {
        ArrayList<Lion> Lions = new ArrayList<Lion>();
        Lions.add(new Lion("simba", 47,1989));
        Lions.add(new Lion("simba2", 49,1996));
        ArrayList<Elephant> Elephants = new ArrayList<Elephant>();
        Elephants.add(new Elephant("rocky", 62,1989));
        ArrayList<Worker> Workers = new ArrayList<Worker>();
        Workers.add(new Worker("Rangayya", 54,2003));
        ArrayList<Guardian> Guardians = new ArrayList<Guardian>();
        Guardians.add(new Guardian("Ramana", 43,2007));

        for (Lion lion : Lions) {
            System.out.println(lion);
        }
        for (Elephant elephant : Elephants) {
            System.out.println(elephant);
        }
        for (Worker worker : Workers) {
            System.out.println(worker);
        }
        for (Guardian guardian :Guardians) {
            System.out.println(guardian);
        }
    }
}


