public class Namee{
    int age;
  String name;
public String getname(){
    return name;
}
public int getage(){
    return age;
}

public void setname(String nname){
    this.name=nname;
}
public void setage(int nage){
    this.age=nage;
}
    public static void main(String args[]){
        Namee obj = new Namee();
        obj.setname("shreya");
        obj.setage(11);
        System.out.println(obj.getname());
        System.out.println(obj.getage());
    }
}

