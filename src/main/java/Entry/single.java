package Entry;

public class single {

    private single() {

    }

    private static single ss = null;

    public synchronized single getSingle() {
        if (ss == null) {
            ss = new single();
        }
        return ss;
    }

}
