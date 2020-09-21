public class Vector2d {
    private double x = 0.0;
    private double y = 0.0;

    public Vector2d() {

    }
    public Vector2d(double inX, double inY) {
        x = inX;
        y = inY;
    }

    public double x() { return x; }
    public double y() { return y; }

		/** create a new vector by adding v to this (x+x,y+y).
		*/
    public Vector2d add(Vector2d v) {
        return new Vector2d (0,0);
    }

		/** create a new vector by subtracting v from this (x-x,y-y)
		*/
    public Vector2d subtract(Vector2d v) {
        return new Vector2d(0,0);
    }

		/** multiply v and this and produce a scaler (x*x+y*y)
		*/
    public double multiply(Vector2d v) {
        return 0.0;
    }

		/** Calculate the magnitude based on x,y : sqrt(abs(x-x)^2+abs(y-y)^2))
		*/
    public double magnitude() {
        return 0.0;
    }

		/** Calculate the direction in degrees based on x,y.  atan(y/x)
		*/
    public double direction() {
        return 0.0;
    }

		/** rotate the vector 180 deg, essentially changing signs of x,y
		*/
    public Vector2d rotate180() {
        return new Vector2d(0,0);
    }

    public String toString() {
        return new String("["+x+","+y+"]");
    }
}
