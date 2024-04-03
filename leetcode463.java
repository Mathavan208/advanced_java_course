	import java.util.*;
class leetcode463{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[][] grid=new Integer[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				grid[i][j]=sc.nextInt();
			}
		}
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
		// for(int i=0;i<n;i++){
			
		// 	h1.put(i,Collections.frequency(l1,1));

		// }
		for(int i=0;i<n;i++){
			ArrayList<Integer> l1=new ArrayList<Integer>();
			//System.out.println()
			Collections.addAll(l1,grid[i]);
			int count=0;
			for(int j=0;j<n;j++){
				
		if(grid[i][j]==1){
				if(i==0||j==0){
					if(i==0&&j!=0){
						if(grid[i+1][j]==1){
					count++;
				}
				else if(grid[i][j-1]==1){
					count++;
				}
				else if(grid[i][j+1]==1){
					count++;
				}
					}
					else if(j==0&&i!=0){
						if(grid[i-1][j]==1){
					count++;
				}
				else if(grid[i+1][j]==1){
					count++;
				}
				else if(grid[i][j+1]==1){
					count++;
				}
					}
					else{
						if(grid[i+1][j]==1){
					count++;
				}
				else if(grid[i][j+1]==1){
					count++;
				}
					}
		}
				else{
					System.out.println("hello");
				if(grid[i-1][j]==1){
					System.out.println("hello");
					count++;
				}
				else if(grid[i+1][j]==1){
					System.out.println("hello");
					count++;
				}
				else if(grid[i][j-1]==1){
					System.out.println("hello");
					count++;
				}
				else if(grid[i][j+1]==1){
					System.out.println("hello");
					count++;
				}
			}

		}
		
		}
		System.out.print(count+" ");
		h1.put(i,count);
		}
		System.out.println(h1);
	}
}