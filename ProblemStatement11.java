//Your computer teacher has given you the task of recording the marks of every student in your class. The name, roll number,
// and marks of every student should be present in your list.
// Use your Java skills to achieve the same and print the complete list.
import java.util.List;
import java.util.ArrayList;
public class ProblemStatement11 {
    public static void main(String args[])
    {
        Student s1=new Student("Divya",1,100);
        Student s2=new Student("Shrika",2,99);
        Student s3=new Student("Manya",3,88);
        Student s4=new Student("Bhavya",4,70);
        Student s5=new Student("Yanvi",5,90);

        List<Student> st=new ArrayList();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        //apply for each syntax to display all the values
        System.out.println("name rollno marks");
        for(Student stu:st)
        {
            System.out.println(stu.name +" "+stu.rollno+"   "+stu.marks);
        }

    }
}
class Student
{
    String name;
    int rollno;
    int marks;
    public Student(String name,int rollno,int marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;

    }
}
