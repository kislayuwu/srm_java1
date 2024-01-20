import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Nikhil","cse",001,790);
        Student s2=new Student("Raagul","cs",123,123);
        Student s3=new Student("Bharat","cs",123,123);

        ArrayList studentList=new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

       // for(int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList);
       // }


        //        Student[] studentArray = new Student[20];

        // Populate the array with Student objects
       /* for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("Student" + (i + 1),  "Dept" + (i % 5),1000 + i, 700 + i);
            System.out.println(studentArray[i].name);
            System.out.println(studentArray[i].regNo);
            System.out.println(studentArray[i].dept);
            System.out.println(studentArray[i].phNo + "\n");
        }*/

    }
    }
