import java.util.*;
class leetcode438{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		ArrayList<Integer> l4=new ArrayList<Integer>();
		if(s.length()<s1.length()){
			l4.add(0);
		}
		else{
		Map<Character,Integer> m1=new HashMap<Character,Integer>();
        
         ArrayList<Character> l1=new ArrayList<Character>();
         ArrayList<Character> l2=new ArrayList<Character>();
         for(int i=0;i<s1.length();i++){
         	l1.add(s1.charAt(i));
         }
          for(int i=0;i<s.length();i++){
         	l2.add(s.charAt(i));
         }
for(int i=0;i<s1.length();i++){
m1.put(s1.charAt(i),Collections.frequency(l1,s1.charAt(i)));
}
// for(int i=0;i<s.length();i++){
// m2.put(s.charAt(i),Collections.frequency(l2,s.charAt(i)));
// }
// System.out.println(m1);
// System.out.println(m2);


int left=0,right=s1.length()-1;
while(left<s.length()&&right<s.length()){
	String res=s.substring(left,right+1);
	//System.out.println(res);
	ArrayList<Character> l3=new ArrayList<Character>();
	 Map<Character,Integer> m2=new HashMap<Character,Integer>();
	for(int i=0;i<res.length();i++){
         	l3.add(res.charAt(i));
         }
 for(int i=0;i<res.length();i++){
  m2.put(res.charAt(i),Collections.frequency(l3,res.charAt(i)));
 }
 //for()
 //System.out.println(m2);
 //System.out.println(m1);

 if(m1.equals(m2)){
l4.add(left);

 }

 left++;
right++;
	}
}
	System.out.println(l4);
}
}