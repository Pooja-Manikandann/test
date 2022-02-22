import java.util.*;
public class Ellaborate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String temp="",result="";
	    for(int i=0;i<s.length();i++){
	        if(Character.isAlphabetic(s.charAt(i))){
	            temp=temp.concat(Character.toString(s.charAt(i)));
	        }
	        else if(Character.isDigit(s.charAt(i))){
	            int n=Character.getNumericValue(s.charAt(i));
	            for(int j=0;j<n;j++){
	                result=result.concat(temp);
	            }
	            temp="";
	        }
	    }
	    System.out.println(result);
	}

}
