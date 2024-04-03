public class Student {
   
    private String name;
    private String address;

   
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void printAddress() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
       
        Student student1 = new Student("Khushnood ", "Kanpur, India");

        
        student1.printAddress();
    }
}
