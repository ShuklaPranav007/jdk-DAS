
import java.util.ArrayList;
import java.util.Collections;

public class Job {
    static class Jobs {
        int deadline;
        int profit;
        int id;

        public Jobs(int i, int d, int p) {
            this.id = i;
            this.deadline = d;
            this.profit = p;
        }

    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Jobs> jobses = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobses.add(new Jobs(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobses, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobses.size(); i++) {
            Jobs curr = jobses.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
