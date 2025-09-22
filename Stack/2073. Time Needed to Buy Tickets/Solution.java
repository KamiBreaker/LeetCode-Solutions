class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }
        int t = 0;
        while (!queue.isEmpty()) {
            t++;
            int customer = queue.poll();
            if (tickets[customer] >= 1) {
                tickets[customer]--;
            }
            if (customer == k && tickets[customer] == 0) {
                break;
            }
            if (customer != k && tickets[customer] == 0) {
                continue;
            }
            queue.add(customer);
        }
        return t;
    }
}