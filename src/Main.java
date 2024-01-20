
public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Kislay","cse",001,790);
        Student[] studentArray = new Student[20];

        // Populate the array with Student objects
       /* for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("Student" + (i + 1),  "Dept" + (i % 5),1000 + i, 700 + i);
            System.out.println(studentArray[i].name);
            System.out.println(studentArray[i].regNo);
            System.out.println(studentArray[i].dept);
            System.out.println(studentArray[i].phNo + "\n");
        }*/

        System.out.println(s1);

    }
    }
