import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String r=sc.next();
            System.out.println(valid(r));

        }

    }

    public static boolean valid(String r){
        Stack <Character> st = new Stack<>();
        int i=0;
        while(i<r.length()){
            if(r.charAt(i)=='{'|| r.charAt(i)=='('|| r.charAt(i)=='['){
                st.push(r.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    if((st.peek()=='{'&& r.charAt(i)=='}')||(st.peek()=='['&& r.charAt(i)==']')|| (st.peek()=='('&& r.charAt(i)==')')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            i++;
        }
        return st.isEmpty();
		
	}
}
