public class PointGrey extends Point {
	private int greyscale; // [0, 255] from black to white

	// TODO: add a constructor for PointGrey
	public PointGrey(int x,int y,int g) {
		super(x,y);
		this.greyscale = g;
		this.px = x;
		this.py = y;


	}

	@Override
	public double getDistance(Point p) {
		// TODO: fill this function up
		double distance;
		distance = Math.sqrt((this.px - p.px)*(this.px - p.px) + (this.py - p.py)*(this.px -p.py));
		return distance;
	}

	@Override
	public int grayscaleDiff(Point p) {
		// TODO: fill this function up
		int grey;
		grey = this.greyscale;
		return grey;
	}

}