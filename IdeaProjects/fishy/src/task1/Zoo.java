

package task1;


public class Zoo {
    String name;
    int doj;
    String color;


    //constructer
    public Zoo(String name, int doj, String color){
        //setters set
        this.name = name;
        this.doj = doj;
        this.color = color;

    }
    public void setName (String name){
        this.name = name;
    }
    public void setAge ( int age){
        this.doj = doj;
    }
    public void setColor (String color){
        this.color = color;
    }
    //getters get
    public String getName(){
        return name;
    }
    public int getDoj(){
        return doj;
    }
    public String getColor(){
        return color;
    }
    public String toString() {
        return ("animal name is" +this.getName()+",date of joining is:  " + this.getDoj() +" and color is : "+this.getColor());
    }
    public static void main(String[] args) {
        Zoo loin1 = new Zoo ("Lion1", 2020, "red");
        Zoo loin2 = new Zoo ("rocky", 2012, "cyan");


        System.out.println("animal name is   " + loin1.getName());
        System.out.println(loin1.getDoj());
        System.out.println(loin1.getColor());

        System.out.println("animal name is  "+loin2.getName());
        System.out.println(loin2.getDoj());
        System.out.println(loin2.getColor());
    }
 }
