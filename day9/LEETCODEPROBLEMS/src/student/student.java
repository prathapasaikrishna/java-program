package student;

import java.util.Objects;

public class student {
	public static void main(String[]args) {
		
	}
	private int regNo;
	private String name;
	private int mark;

	public student(int regNo,String name,int mark) {
		this.regNo=regNo;
		this.name=name;
		this.mark=mark;

	}

	@Override
	public int hashCode() {
		return Objects.hash(mark, name, regNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return mark == other.mark && Objects.equals(name, other.name) && regNo == other.regNo;
	}

	@Override
	public String toString() {
		return "student [regNo=" + regNo + ", name=" + name + ", mark=" + mark + "]";
	}

}
