import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        String st = null;
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int T  = Integer.parseInt(br.readLine());

        for (int i = 0; i< T; i++) {
            s.push(i);
        }
        for (int i = T; i >=0; i--) {
            q.add(i);
        }

        for(int i = 0; i<2; i++) {
            sb.append(br.readLine()+" ");
        }

        for (int i = 0; i < T; i++) {
            arr1.add(q.poll());
            arr2.add(s.push(i));
        }
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(sb.toString());
    }
}