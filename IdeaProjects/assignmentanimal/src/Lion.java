public class Lion {
    String name;
    int age;
    int Yearofjoin;
    public Lion ( String name, int age, int Yearofjoin) {

        this.name =name;
        this.age =age;
        this.Yearofjoin=Yearofjoin;
    }
    public Lion(){
    }

    public String getName() {
        return name;
    }
    public String setName() {
        this.name = name;
        return null;
    }
    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;

    }
    public int getYearofjoin() {
        return Yearofjoin;
    }
    public void setYearofjoin() {
        this.Yearofjoin = Yearofjoin;
    }
    public String toString(){
        return ("Lion name is " +name+ ",age is " +age+ ",year of join is : "+Yearofjoin);
    }
}
