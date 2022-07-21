package collections.Queue;

public class Main {
     public static void main (String [] args) {
       Queue queue= new Queue();
          queue.add(17);
          queue.add(56);
          queue.add(37);
          queue.add(78);
          queue.add(67);




          queue.show();
          //remove
          queue.remove();
          queue.show1();
          //poll
          queue.poll();
          queue.show2();
         System.out.print("\n");
         System.out.println("size of the queue is  " +queue.getSize());
         System.out.println("is the queue empty: "+queue.isEmpty());

     }
}
