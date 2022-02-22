import java.util.*;
public class ReverseElaborate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>();
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),result="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if(st.isEmpty()) {
				st.push(s.charAt(i));
				count=1;
			}
			else if(st.peek()==s.charAt(i)) {
				count++;
			}
			else {
				result=result.concat(Character.toString(st.pop()));
				result=result.concat(Integer.toString(count));
				st.push(s.charAt(i));
				count=1;
			}
			//System.out.println(st+" "+s.charAt(i)+" "+count+" "+result);
		}
		result=result.concat(Character.toString(st.pop()));
		result=result.concat(Integer.toString(count));
		System.out.println(result);

	}

}
