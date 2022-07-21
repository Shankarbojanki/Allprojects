package Classes;

public class Main {
     public static void main (String[] args) {
         Car porsche=new Car();
         Car holden=new Car();
        System.out.println("Model is:  "+porsche.getModel());
         porsche.setModel("carrera  -919");
         System.out.println("model is:  "+porsche.getModel());
     }
}
