class Students1{
//variable declaration 
    int rollno;
    String name;
   void insertRecord(int r, String n){
    rollno=r;
    name=n;
   }
   void displayInformation(){
   System.out.println(rollno+" "+name);
   } }
   class TestStudent4{
    public static void main(String args[]){
        Students1 s1=new Students1();
        Students1 s2=new Students1();
    s1.insertRecord(200,"Juma");
    s2.insertRecord(300,"Neema");
    s1.displayInformation();
    s2.displayInformation();
    } }