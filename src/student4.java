public class student4 {
    int id;
    String name;
    //creating a parameter
    student4(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        student4 s = new student4(7, "John");
        s.display();
    }
}
//kazi go study constructor overloading//
