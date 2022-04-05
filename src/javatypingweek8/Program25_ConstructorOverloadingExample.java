package javatypingweek8;
//Java program to overload constructors
public class Program25_ConstructorOverloadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Program25_ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Program25_ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Program25_ConstructorOverloadingExample s1 = new Program25_ConstructorOverloadingExample(111, "Karan");
        Program25_ConstructorOverloadingExample s2 = new Program25_ConstructorOverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
