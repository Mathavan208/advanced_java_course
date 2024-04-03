import java.util.*;
class comparator{

	interface student{
		public void assign(String name,int rollno);
	}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
     String n=sc.next();
	int r=sc.nextInt();
	student s=(name,rollno)->{name=n;

	rollno=r;
System.out.println(name+" "+rollno);};
s.assign(n,r);

}
}