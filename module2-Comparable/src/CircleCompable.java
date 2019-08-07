import java.util.Comparator;

public class CircleCompable extends  Circle implements Comparable<CircleCompable> {
    public CircleCompable() {
    }

    public CircleCompable(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(CircleCompable o) {
        if(this.getRadius()>o.getRadius()) return 1;
        else if(this.getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
