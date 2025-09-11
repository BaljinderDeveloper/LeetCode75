package Queue.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Prog1_933_NumberofRecentCalls {
    public static void main(String[] args) {
        Prog1_933_NumberofRecentCalls obj = new Prog1_933_NumberofRecentCalls();
        obj.ping(1);
        obj.ping(100);
        obj.ping(3001);
        System.out.println(obj.ping(3002));
    }
    Queue<Integer> que;
    public Prog1_933_NumberofRecentCalls() {
        que = new LinkedList<>();
    }

    public int ping(int t) {
        que.add(t);
        while(que.peek() < t-3000){
            que.poll();
        }
        return que.size();
    }
}
