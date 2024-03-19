package adapter.classadapter;
/**
 * Adapter class
 */
public class ValtageAdapter extends Valtage220V implements Valtage5V{

    @Override
    public int output5V() {
        int src_v = output220V();
        int dst_v = src_v / 44;
        return dst_v;
    }
}
