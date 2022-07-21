import Zooani.Animals;
import Zooani.Elephant;
import Zooani.Gatekeeper;
import Zooani.Lion;
import objectandclass.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> elephants = new ArrayList<>();
        ArrayList<Lion> lion = new ArrayList<>();
        ArrayList<Worker> worker = new ArrayList<>();
        ArrayList<Gatekeeper> gatekeeper = new ArrayList<>();
        elephants.add(new Elephant("dami", 58, 1952));
        elephants.add(new Elephant("kira",23,2000));
        elephants.add( new Elephant("bau", 19, 1999));
        elephants.add( new Elephant("ravi", 18, 1999));
        elephants.add(new Elephant("kiali",23,2000));
        lion.add( new Lion("ravi", 23, 1999));
        worker.add( new Worker("Ramana", 19,2006));
        worker.add( new Worker("nagesh", 29,89));
        gatekeeper.add( new Gatekeeper("mallayya", 29));
        gatekeeper.add( new Gatekeeper("suribabu", 34));
        gatekeeper.add( new Gatekeeper("venkatarao", 27));


        for (Gatekeeper staf1:gatekeeper
        ) {

            System.out.println(staf1);
        }
        for (Worker staf2:worker
        ) {

            System.out.println(staf2);
        }
        for (Animals Animal1:lion
        ) {


            System.out.println(Animal1);
        }
        for (Animals Animal2:elephants
        ) {
            System.out.println(Animal2);
        }

    }

}