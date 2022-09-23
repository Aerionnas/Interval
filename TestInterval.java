public class TestInterval {
    public static void main(String[] args) {
        System.out.println("\n\nTesting the Interval class\n\n");

        // instances of Interval Object
        Interval a = new Interval(1, 2);
        Interval b = new Interval(-5, -2);
        Interval c = new Interval(2, 4);
        Interval d = new Interval(2, 5);
        Interval e = new Interval(4);

        // print statements testing the getters
        System.out.println("Interval a has a low of " + a.getLo() + " and the high is " + a.getHi()
                + " and it should be (1,2)");
        System.out.println("Interval b has a low of " + b.getLo() + " and the high is " + b.getHi()
                + " and it should be (-5,-2)");
        System.out.println("Interval c has a low of " + c.getLo() + " and the high is " + c.getHi()
                + " and it should be (2,4)");
        System.out.println("Interval d has a low of " + d.getLo() + " and the high is " + d.getHi()
                + " and it should be (-2,2)");
        System.out.println("Interval e has a low of " + e.getLo() + " and the high is " + e.getHi()
                + " and it should be (4,4) \n");

        // testing fuctionality of the methods

        // addition method 
        System.out.println("Interval a + Interval b = ( " + Interval.add(a , b).getLo() + "," + Interval.add(a , b).getHi() + " ) and it should be [-4, 0].");
        System.out.println("Interval b + Interval c = ( " + Interval.add(b , c).getLo() + "," + Interval.add(b , c).getHi() + " ) and it should be [-3, 2].");
        System.out.println("Interval c + Interval d = ( " + Interval.add(c , d).getLo() + "," + Interval.add(c , d).getHi() + " ) and it should be [4, 9].");
        System.out.println("Interval d + Interval e = ( " + Interval.add(d , e).getLo() + "," + Interval.add(d , e).getHi() + " ) and it should be [6, 9].\n");

        // subtraction method
        System.out.println("Interval a - Interval b = ( " + Interval.subtract(a , b).getLo() + "," + Interval.subtract(a , b).getHi() + " ) and it should be [4, 6].");
        System.out.println("Interval b - Interval c = ( " + Interval.subtract(b , c).getLo() + "," + Interval.subtract(b , c).getHi() + " ) and it should be [-7, -6].");
        System.out.println("Interval c - Interval d = ( " + Interval.subtract(c , d).getLo() + "," + Interval.subtract(c , d).getHi() + " ) and it should be [-1, 0].");
        System.out.println("Interval d - Interval e = ( " + Interval.subtract(d , e).getLo() + "," + Interval.subtract(d , e).getHi() + " ) and it should be [-2, 1].\n");

        // multiplication method
        System.out.println("Interval a * Interval b = ( " + Interval.multiply(a , b).getLo() + "," + Interval.multiply(a , b).getHi() + " ) and it should be [-5, -4].");
        System.out.println("Interval b * Interval c = ( " + Interval.multiply(b , c).getLo() + "," + Interval.multiply(b , c).getHi() + " ) and it should be [-10, -8].");
        System.out.println("Interval c * Interval d = ( " + Interval.multiply(c , d).getLo() + "," + Interval.multiply(c , d).getHi() + " ) and it should be [4, 20].");
        System.out.println("Interval d * Interval e = ( " + Interval.multiply(d , e).getLo() + "," + Interval.multiply(d , e).getHi() + " ) and it should be [8, 20].");
        
        // average method
        System.out.println("The average of Interval a and Interval b is ( " + Interval.average(a , b).getLo() + "," + Interval.average(a , b).getHi() + " ) and it should be [-2, 0].");
        System.out.println("The average of Interval b and Interval c is ( " + Interval.average(b , c).getLo() + "," + Interval.average(b , c).getHi() + " ) and it should be [-1, 1].");
        System.out.println("The average of Interval c and Interval d is ( " + Interval.average(c , d).getLo() + "," + Interval.average(c , d).getHi() + " ) and it should be [2, 4].");
        System.out.println("The average of Interval d and Interval e is ( " + Interval.average(d , e).getLo() + "," + Interval.average(d , e).getHi() + " ) and it should be [3, 4].");
    }
}