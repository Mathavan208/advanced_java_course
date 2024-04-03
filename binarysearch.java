import java.util.*;
class binarysearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] spells=new int[n];
        for(int i=0;i<n;i++){
               spells[i]=sc.nextInt();
        }
        int[] potions=new int[m];
         for(int i=0;i<m;i++){
               potions[i]=sc.nextInt();
        }
        long success=sc.nextLong();
        int[] res=new int[spells.length];
       
        Arrays.sort(potions);
        ArrayList<Integer> l1=new ArrayList<Integer>();
        for(int i:potions){
            l1.add(i);
        }
       for(int i=0;i<spells.length;i++){
           int count=0;
          int left=0;
          int right=potions.length-1;
          long c=(success+spells[i]-1)/spells[i];
          while(left<right){
            int mid=left+right/2;
            if(potions[mid]<c){
                left=mid+1;
            }
            else{
                right=mid;
            }

          }
           if(potions[left]<c)left++;
           count=potions.length-left;
           res[i]=count;
           }
       
System.out.println(Arrays.toString(potions));
      for(int i:res){
        System.out.print(i+" ");
      }
    }
}