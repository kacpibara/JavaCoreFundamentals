package _7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prism> prisms = new ArrayList<>(); // list for all different prisms

        // different prisms
        Shape rectangle = new Rectangle(2, 5);
        Shape square = new Rectangle(3, 3);
        Shape triangle = new  Triangle(10, 5);

        prisms.add(new Prism(rectangle, 20));
        prisms.add(new Prism(square, 10));
        prisms.add(new Prism(triangle, 15));

        for(Prism prism : prisms){
            System.out.println(prism);
        }
    }
}
