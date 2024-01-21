import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Point p1=new Point(1,2);
        Point p2=new Point(2,2);
        Point p3=new Point(3,3);
        Point p4=new Point(4,4);

        Line l1=new Line(p1,p2);
        Line l2=new Line(p3,p4);

        int result= l1.lineComparison(l2);
        if(result<0){
            System.out.println("Line 1 is longer than line 2");
        } else if (result>0) {
            System.out.println("Line 1 is shorter than line 2");
        }
        else System.out.println("Both are of same length");

/*      Student s1=new Student("Nikhil","cse",001,790);
        Student s2=new Student("Raagul","cs",123,123);
        Student s3=new Student("Bharat","cs",123,123);
        ArrayList<Student> studentList=new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);*/

/*       Student[] studentArray = new Student[20];
         Populate the array with Student objects
         for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("Student" + (i + 1),  "Dept" + (i % 5),1000 + i, 700 + i);
            System.out.println(studentArray[i].name);
            System.out.println(studentArray[i].regNo);
            System.out.println(studentArray[i].dept);
            System.out.println(studentArray[i].phNo + "\n");
        }*/

    }
}
