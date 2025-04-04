public class SegmentAggre {
    private Point pt1;
    private Point pt2;

    public SegmentAggre(Point pt1, Point pt2){
        this.pt1 = pt1;
        this.pt2 = pt2;
    }

    @Override
    public String toString() {
        return "[" + this.pt1.toString() + "->" + this.pt2.toString() + "]";
    }
}
