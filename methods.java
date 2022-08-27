import java.util.jar.Attributes.Name;
/*print student details usimmg invoke method */
class student{
    String name;
    int roll_num;
    int marks[]=new int[5];
    int totalmark()
{
    return marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
}
}

public class methods{
    public static void main(String[] args)
    {
        /*student 1 */
        student student_1=new student();
        student_1.name="Rajganesh";
        student_1.roll_num=101;
        student_1.marks[0]=78;
        student_1.marks[1]=90;
        student_1.marks[2]=78;
        student_1.marks[3]=89;
        student_1.marks[4]=78;
        /*student 2 */
        student student_2=new student();
        student_2.name="Kalaiselvan";
        student_2.roll_num=102;
        student_2.marks[0]=99;
        student_2.marks[1]=90;
        student_2.marks[2]=79;
        student_2.marks[3]=89;
        student_2.marks[4]=70;
       /*student 3 */
        student student_3=new student();
        student_3.name="Prasanth";
        student_3.roll_num=103;
        student_3.marks[0]=99;
        student_3.marks[1]=99;
        student_3.marks[2]=99;
        student_3.marks[3]=99;
        student_3.marks[4]=99;
        System.out.println("-------------------Details-----------------");
        System.out.println("Student name:"+student_1.name);
        System.out.println("Student Rollnumber:"+student_1.roll_num);
        System.out.println("Totel mark:"+student_1.totalmark());

        System.out.println("Student name:"+student_2.name);
        System.out.println("Student Rollnumber:"+student_2.roll_num);
        System.out.println("Totel mark:"+student_2.totalmark());
        System.out.println("Student name:"+student_3.name);
        System.out.println("Student Rollnumber:"+student_3.roll_num);
        System.out.println("Totel mark:"+student_3.totalmark());

        
        }
}