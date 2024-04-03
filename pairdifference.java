import java.util.*;
class pairdifference{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		
		
		for(int i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		int k=sc.nextInt();
int i=0,j=1;
while(i<n1&&j<n1-1){
	if(Math.abs(arr1[i]-arr1[j])==k){
		System.out.println("1");
		break;
	}
	else if(Math.abs(arr1[i]-arr1[j])>k){
		i++;
	}
	else if(Math.abs(arr1[i]-arr1[j])<k){
		j++;
	}
	}
}
}