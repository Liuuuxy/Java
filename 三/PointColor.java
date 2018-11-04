public class PointColor extends Point {
    private int red;
    private int green;
    private int blue;
    private int greyscale;
    // TODO: add a constructor for PointGrey
    public PointColor(int x,int y,int r,int g,int b) {
        super(x,y);
        this.px = x;
        this.py = y;
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    @Override
    public double getDistance(Point p) {
        // TODO: fill this function up
        double distance;
        distance = Math.sqrt((this.px - p.px)*(this.px - p.px) + (this.py - p.py)*(this.py -p.py));
        return distance;
    }

    @Override
    public int grayscaleDiff(Point p) {
        // TODO: fill this function up
        greyscale = (this.red + this.green + this.blue)/3;
        int grey;
        grey = this.greyscale;
        return grey;
    }

}