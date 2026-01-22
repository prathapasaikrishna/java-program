  public class Student implements Comparable<Student> {

    String name;
    int regNo;

    public Student(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    @Override
    public int compareTo(Student s) {
        return this.regNo - s.regNo; // sort by regNo
    }

    @Override
    public String toString() {
        return name + " " + regNo;
    }

    public void SetName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SetName'");
    }

    public void SetRegno(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SetRegno'");
    }
}

