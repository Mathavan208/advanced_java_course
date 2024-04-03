import java.util.*;
class intersectionarrays{
	public static void main(String[] args){
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];

		for(int i=0;i<n1;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++){
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0;int p2=0;
		ArrayList<Integer> l1=new ArrayList<Integer>();

		while(p1<n1-1&&p2<n2-1){
			if(a[p1]==b[p2]){
				l1.add(a[p1]);
				p1++;
				p2++;
// 				System.out.println(a[p1]);
// System.out.println(b[p2]);

				
			}
			else if(a[p1]>b[p2]){
				p2++;
			}
			else if(a[p1]<b[p2]){
                   p1++;
			}
		}
		System.out.println(l1);
	}
}