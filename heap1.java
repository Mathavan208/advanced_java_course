import java.util.*;
class heap1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			q.add(sc.nextInt());
		}
		// System.out.println(q);
		
          while(q.size()>1){
          	int x=q.poll();
          	int y=q.poll();
          	int res;
          	if(x!=y){
          		 res=Math.abs(x-y);
          		q.add(res);
          	}
          	else{
          		q.add(0);
          	}
          }
          System.out.println(q);
	}
}