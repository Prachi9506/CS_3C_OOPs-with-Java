package exceptions;

class ExcThrows1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Countdown starting...");
        startCountdown();
        System.out.println("Countdown finished!");
    }
    public static void startCountdown() throws InterruptedException {
        for (int i = 5; i >= 1; i--) {
            printNumber(i);
        }
    }
    public static void printNumber(int num) throws InterruptedException {
        System.out.println(num);
        Thread.sleep(1000); // pause 1 second between numbers
    }
}