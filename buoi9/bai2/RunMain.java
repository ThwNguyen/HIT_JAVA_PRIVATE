import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Ishape> shape = new ArrayList<>();
        shape.add(new Rectangle(5, 7.5));
        shape.add(new Circle(4.5));
        for (int i = 0; i < shape.size(); i++)
            System.out.println(shape.get(i));
    }
}
