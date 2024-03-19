package adapter.classadapter;

public class Phone {
    public void charing(Valtage5V i) {
        if (i.output5V() == 5) {
            System.out.println("Charging Safely");
        }
    }
}
