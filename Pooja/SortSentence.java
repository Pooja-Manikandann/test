import java.util.*;
public class SortSentence {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] st=sc.nextLine().split(" ");
		String temp="";
		int index=0;
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				//System.out.println(st[i]+" "+st[j]);
				if(st[i].charAt(index) > st[j].charAt(index)) {
					temp = st[i];
					st[i]=st[j];
					st[j]=temp;
				}
				else if(st[i].charAt(index) == st[j].charAt(index)){
					//System.out.println("Same");
					while(st[i].charAt(index) != st[j].charAt(index)) {
						index++;
					}
					index++;
					//System.out.println("Index"+index);
					if(st[i].charAt(index)>st[j].charAt(index)) {
						temp = st[i];
						st[i]=st[j];
						st[j]=temp;
					}
					index=0;
				}
			}
		}
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}
		
	}

}
