public class student {
    int id;
    String name;
   student(int id, String name) {
       System.out.println(id + " " + name);
   }
   public static void main(String[] args) {
       student s = new student(200, "John");
   }
}
