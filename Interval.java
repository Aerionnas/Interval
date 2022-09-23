public class Interval {

    private int hi;
    private int lo;

    public Interval(int a, int b) {
        // a must be less than b
        if ((a < b) || (a == b)) {

            this.hi = b;
            this.lo = a;
        } else if (b < a) {

            this.hi = a;
            this.lo = b;
        }

    }

    public Interval(int a) {

        this.hi = a;
        this.lo = a;
    }

    public int getLo() {

        return this.lo;

    }

    public int getHi() {

        return this.hi;

    }

    // the intervals are simply added together
    public static Interval add(Interval z, Interval w) {

        int newHigh = z.hi + w.hi;
        int newLow = (z.lo + w.lo);

        // the newlow is greater than the newhigh, the values simply switch
        if (newLow > newHigh) {

            int v = newLow;
            int u = newHigh;
            Interval l = new Interval(u, v);
            return l;

        }

        Interval r = new Interval(newLow, newHigh);

        return r;

    }

    // the intervals are simply subtracted
    public static Interval subtract(Interval z, Interval w) {

        int newHigh = z.hi - w.hi;
        int newLow = (z.lo - w.lo);

        if (newLow > newHigh) {

            int v = newLow;
            int u = newHigh;
            Interval l = new Interval(u, v);
            return l;

        }

        Interval r = new Interval(newLow, newHigh);

        return r;
    }

    // the interval are multiplied
    public static Interval multiply(Interval z, Interval w) {

        int newHigh = z.hi * w.hi;
        int newLow = z.lo * w.lo;

        if (newLow > newHigh) {

            int v = newLow;
            int u = newHigh;
            Interval l = new Interval(u, v);
            return l;

        }

        Interval r = new Interval(newLow, newHigh);

        return r;
    }

    // the average is taken of the two interval's high and lows
    public static Interval average(Interval z, Interval w) {

        int newHigh = (z.hi + w.hi) / 2;
        int newLow = (z.lo + w.lo) / 2;

        if (newLow > newHigh) {

            int v = newLow;
            int u = newHigh;
            Interval l = new Interval(u, v);
            return l;

        }

        Interval r = new Interval(newLow, newHigh);

        return r;

    }
}