
public class TestStudent {

	public static void main(String[] args)throws CloneNotSupportedException {
		Student obj1 = new Student();
		obj1.rollNo = 1;
		Student obj2 = (Student)obj1.clone();
		obj2.rollNo = 3;
		System.out.println(obj1.rollNo);
		System.out.println(obj2.rollNo); 
		// TODO Auto-generated method stub

	}

}
