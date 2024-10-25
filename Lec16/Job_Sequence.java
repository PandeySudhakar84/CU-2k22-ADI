package Lec16;
import java.util.Arrays;

public class Job_Sequence {
    public static void main(String[] args) {
        int profit[] = {100, 19, 27, 25, 15};
        int DeadLine[] = {2, 1, 2, 1, 3};
        int ans = jobScheduling(DeadLine, profit);
        System.out.println(ans);
    }

    public static int jobScheduling(int[] deadlines, int[] profits) {
        int n = deadlines.length;
        Job[] jobs = new Job[n];
        // Job objects ka array banana
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadlines[i], profits[i]);
        }

        // Jobs ko profit ke hisaab se sort kar do
        Arrays.sort(jobs, (a, b) -> Integer.compare(b.profit, a.profit));

        // Max deadline nikal lenge
        int maxDeadline = 0;
        for (int deadline : deadlines) {
            if (deadline > maxDeadline) {
                maxDeadline = deadline;
            }
        }
       // int maxDeadline = Arrays.stream(deadlines).max().orElse(0);
        boolean[] timeSlots = new boolean[maxDeadline + 1]; // Time slots track karne ke liye

        int totalProfit = 0;

        // Jobs schedule karege
        for (Job job : jobs) {
            for (int t = Math.min(job.deadline, maxDeadline); t > 0; t--) {
                if (!timeSlots[t]) { // Agar time slot free hai
                    timeSlots[t] = true; // Time slot ko filled mark karege
                    totalProfit += job.profit; // Job ka profit add karege
                    break;
                }
            }
        }

        return totalProfit; // Total profit return kar do
    }

    static class Job {
        int deadline;
        int profit;

        Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }
}
