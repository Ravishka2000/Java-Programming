package question2;

public class Thread1 extends Thread{

    Object ob;
    private char pattern;
    private int count;

    public Thread1(char pattern,int count,Object ob){
        this.count = count;
        this.pattern = pattern;
        this.ob = ob;
    }

    @Override
    public void run() {
        synchronized (ob){
            for (int x = 0; x < count; x++){
                try {
                    ob.wait();
                    for (int y = count; y >= x; y--) {
                        System.out.print(" ");
                    }
                    for (int y = 0; y <= x; y++) {
                        System.out.print(pattern + " ");
                    }
                    System.out.println();
                    ob.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
