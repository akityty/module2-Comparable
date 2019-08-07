import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       CircleCompable[] circles =  new CircleCompable[3];
        circles[0] =  new CircleCompable(4);
        circles[1] = new CircleCompable(2);
        circles[2] =  new CircleCompable(4);
        Arrays.sort(circles);
        for(int i = 0; i< circles.length; i++){
                        System.out.println(circles[i].getRadius());
        }

    }
}
