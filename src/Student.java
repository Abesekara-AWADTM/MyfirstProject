public class Student{
    private String name="Madushani";
    private String school="MPC";

    public Student(){
        super();
    }
    
    public Student(String n, String s){
      this.name=n;
      this.school=s;
    }

    public String getName(){
        return name;
    }

    public String getSchool(){
        return school;
    }

    public void setName(String name){
       this.name=name;
    }

    public void setSchool(String school){
        this.school=school;
    }

    public static void main(String []args){
        Student student1=new Student();
        System.out.println("Student Name : " + student1.getName());
        System.out.println("Student School : " + student1.getSchool());

        Student student2=new Student("Thilini","Rbv");
        System.out.println("Student Name : " + student2.getName());
        System.out.println("Student School : " + student2.getSchool());

        
    }
}