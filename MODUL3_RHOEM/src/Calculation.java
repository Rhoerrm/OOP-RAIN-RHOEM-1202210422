public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;

    @Override
    public void run() {
        while (true) {
            setSquare();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setTrapezoid(boolean setTrapezoid) {
        this.setTrapezoid = setTrapezoid;
    }

    public static int getSquare() {
        return getSquare();
    }
}