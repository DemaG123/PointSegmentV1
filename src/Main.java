import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //composition

        SegmentCompo sc = new SegmentCompo(0,0,5,5);

        //Aggregation

        Point pt1 = new Point(1,1);
        Point pt2 = new Point(6,6);

        SegmentAggre sa = new SegmentAggre(pt1,pt2);



        System.out.println(sa.toString());


    }
}