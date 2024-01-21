class Student {
    String name;
    double regNo;
    String dept;
    int phNo;

    /*override the default print of the statement*/
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", dept='" + dept + '\'' +
                ", phNo=" + phNo +
                '}';
    }

  /*  Student(String n, String d,int r, int p){
       this. name=n;
        this.regNo=r;
        this.dept=d;
        this.phNo=p;
    }*/
}

