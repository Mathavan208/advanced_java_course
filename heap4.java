import java.util.*;
class Pair{
	int val;
	int diff;
	public Pair(int val,int diff){
this.val=val;
this.diff=diff;
	}
}
class heap4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int x=sc.nextInt();

List<Pair> l1=new ArrayList<Pair>();
for(int i:nums){
	Pair obj=new Pair(i,Math.abs(x-i));
	l1.add(obj);
	}
	Collections.sort(l1,new Comparator<Pair>(){
		public int compare(Pair obj1,Pair obj2){
			if(obj1.diff!=obj2.diff){
				return Integer.valueOf(obj1.diff).compareTo(Integer.valueOf(obj2.diff));
			}
			else{
				return Integer.valueOf(obj1.val).compareTo(Integer.valueOf(obj1.val));
			}
		}
	});
ArrayList<Integer> l2=new ArrayList<Integer>();
for(int i=0;i<k;i++){
l2.add(l1.get(i).val);
}
Collections.sort(l2);
System.out.println(l2);
}
}