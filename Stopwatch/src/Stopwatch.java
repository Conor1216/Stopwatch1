public class Stopwatch {
    public static void main(String[] args) {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        while (seconds > -1) {
            try {
                Thread.sleep(1000);
                seconds++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(hours + " hrs. " + minutes + " min. " + seconds + " sec.");
            while (seconds >= 60) {
                minutes = (minutes + 1);
                seconds = 0;
                System.out.println(hours + " hrs. " + minutes + " min. " + seconds + " sec.");
            }
            while (minutes >= 60) {
                hours = (hours + 1);
                minutes = 0;
                System.out.println(hours + " hrs. " + minutes + " min. " + seconds + " sec.");
            }
        }
    }
}