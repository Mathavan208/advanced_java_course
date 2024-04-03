import java.util.*;
class heap2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PriorityQueue<Double> p=new PriorityQueue<Double>(Collections.reverseOrder());
		int sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		//System.out.println(sum);
		double value=sum/2;
		
		for(int i=0;i<n;i++){
			p.add((double)arr[i]);
			
		}
	 double res=sum;
		 
         int count=0;
while(res>value){
	double out=p.poll()/2;
	res=res-out;
	
	p.offer(out);
	count++;
}
System.out.println(count);
    }
		}
