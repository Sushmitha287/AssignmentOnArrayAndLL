import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> hs = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int c=0;
            int num[]=new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = in.nextInt();
               
            }
            for(int i = 0 ; i < n ; i++){
                deque.add(num[i]);
                if(deque.size()>m){
                    int removed = deque.removeFirst();
                    if(!deque.contains(removed)){
                        hs.remove(removed);
                    }
                }
                hs.add(num[i]);
                if(hs.size()>c){
                    c = hs.size();
                }
            }
            System.out.println(c);
            
        }
    }
