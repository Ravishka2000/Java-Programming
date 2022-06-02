package question1c;

public class Thread1 implements Runnable{

    Calculation calculation;
    int start,end;

    public Thread1(Calculation calculation, int start, int end) {
        this.calculation = calculation;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        calculation.sum(start,end);
    }
}
