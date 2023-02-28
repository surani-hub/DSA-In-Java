package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class TimeRequiredToBuyTickets {
    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    static public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            count++;
            int front = q.poll();
            if (tickets[front] >= 1) {
                tickets[front] -= 1;
            }
            if (k == front && tickets[front] == 0) {
                break;
            }
            if (k != front && tickets[front] == 0) {
                continue;
            }
            q.add(front);
        }
        return count;
    }
}
