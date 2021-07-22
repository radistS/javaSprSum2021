package WorkQueues;

public class ExecuteJob {
    public static void runJob(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            Thread.sleep(1000);
            System.out.print("#");
        }
        System.out.println();
    }
}
