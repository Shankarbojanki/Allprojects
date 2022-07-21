public class Elephant extends Lion {
    String name;
    int age;
    int Yearofjoin;

    public Elephant (String name,int age,int Yearofjoin) {
        super();
        this.name =name;
        this.age = age;
        this.Yearofjoin = Yearofjoin;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getYearofjoin() {
        return Yearofjoin;
    }

    public void setYearofjoin (int yearofjoin) {
        this.Yearofjoin = yearofjoin;
    }
    public String toString(){
        return ("Elephant name is: " +name+  ",Age is :" +age+ ",year of join is  "+Yearofjoin);
    }
}
