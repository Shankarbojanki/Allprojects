package collections.Ques;

import java.util.*;


public class Main {
    public static void main (String [] args){
        java.util.Queue<Queue> queue = new PriorityQueue<Queue>();

        Queue s1 = new Queue(1,"shankar","A","physics");
        Queue s2 = new Queue(2,"Harsha","B","Maths");
        Queue s3 = new Queue(3,"Yaswanth","C","chemistry");
        Queue s4 = new Queue(4,"Hari","D","organic-chemistry");


        queue.add(s1);
        queue.add(s2);
        queue.add(s3);
        queue.add(s4);


        System.out.println("class details");

        for (Queue s:queue){
            System.out.println("Roll number:"+s.rollnumber+",Student Name:"+s.name+",Section:"+s.section+",Favourite subject:"+s.favsubject);
        }
        queue.remove();

        System.out.println("remove students from queue");
        for (Queue s:queue){
            System.out.println("Roll number:"+s.rollnumber+",Student Name:"+s.name+",Section:"+s.section+",Favourite subject:"+s.favsubject);
        }
        queue.poll();
        System.out.println("POLL-->Retrieves and Removes");
        for (Queue s:queue){
            System.out.println("Roll number:"+s.rollnumber+",Student Name:"+s.name+",Section:"+s.section+",Favourite subject:"+s.favsubject);
        }
        queue.remove();
        queue.element();
        System.out.println("ELEMENT-->Retrieves and does not  Removes");
        for (Queue s:queue){
            System.out.println("Roll number:"+s.rollnumber+",Student Name:"+s.name+",Section:"+s.section+",Favourite subject:"+s.favsubject);
        }

        queue.peek();
        System.out.println("PEEK-->Retrieves and does not  Removes-----RETURN NULL");
        for (Queue s:queue){
            System.out.println("Roll number:"+s.rollnumber+",Student Name:"+s.name+",Section:"+s.section+",Favourite subject:"+s.favsubject);
        }

    }
}
