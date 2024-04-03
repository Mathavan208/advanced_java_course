import java.util.*;
class Student{
	String name;
	int rollno;
	public Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
}
class Main{
public static void main(String[] args){
		List<Student> l1=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
               Student s=new Student(sc.next(),sc.nextInt());
               l1.add(s);
		}
		Comparator<Student> compares=(obj1,obj2)->{return Integer.valueOf(obj1.rollno).compareTo(Integer.valueOf(obj2.rollno));};
		Collections.sort(l1,compares);
		for(Student i:l1){
			System.out.println(i.name+" "+i.rollno);
		}
		
		
	}
}