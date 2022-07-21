package collections.ArrayDeque;

import java.util.Deque;

public class ArrayDeque {
     public static void main(String[] args) {
         Deque<Integer> arrdq = new java.util.ArrayDeque<>(15);


         arrdq.add(12);
         arrdq.add(16);
         arrdq.add(18);
         arrdq.add(15);
         arrdq.add(19);
         arrdq.add(10);
         arrdq.add(11);
         arrdq.add(15);
         arrdq.add(13);



         System.out.println("Added elements ");
         for (Integer array: arrdq){
             System.out.println( array);
         }
         arrdq.clear();
         System.out.println("Remove all ");
         for (Integer array: arrdq){
             System.out.println( array);
         }
         arrdq.addFirst(3);
         arrdq.addFirst(2);
         arrdq.addFirst(1);
         System.out.println("again added");
         for (Integer array: arrdq){
             System.out.println( array);
         }
         arrdq.addLast(13);
         arrdq.addLast(14);
         arrdq.addLast(15);
         System.out.println("again added last ");
         for (Integer array: arrdq){
             System.out.println( array);
         }
         System.out.println("First  "+arrdq.getFirst());
         System.out.println("Last  "+arrdq.getLast());

         System.out.println("poll---->"+arrdq.poll());

         System.out.println("after poll");
         for (Integer array: arrdq){
             System.out.println( array);
         }
         System.out.println("after pollfirst "+arrdq.pollFirst());
         for (Integer array: arrdq){
             System.out.println( array);
         }
         System.out.println("after polllast "+arrdq.pollLast());
         for (Integer array: arrdq){
             System.out.println( array);
         }
         Object[] array1 = arrdq.toArray();
         System.out.println("\nArray size :" +array1.length);
         System.out.print("Array elements: ");
         for (int i =0;i<array1.length;i++){
             System.out.print(" " + array1[i]);
         }
         arrdq.push(56);
         arrdq.push(57);
         arrdq.push(58);
         System.out.println("\n");
         System.out.println("added by push " +arrdq);

         System.out.println("Remove Head " +arrdq.remove());
         System.out.println("After Remove Head " + arrdq);
     }
}
