
class Student{
    private String name;
    private int marks;
    private int age;

    // in encapsulation we create getters to get data and setters to set values 

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setMarks(int marks){
        this.marks = marks;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getMarks(){
        return marks;
    }
    
}


public class getterSetter {
        public static void main(String[] args){
            Student s1 = new Student();
            s1.setAge(22);
            s1.setName("Sanjana");
            s1.setMarks(92);

            System.out.println("Student name: " + s1.getName());
            System.out.println("Student age: " + s1.getAge());
            System.out.println("Student Marks: " + s1.getMarks());
        }
}
