import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    MagicBox<Integer> box1 = new MagicBox<>(4);
    box1.add(1);
    box1.add(2);
    box1.add(3);
    box1.add(4);
    System.out.println(box1.add(5));
    Integer x = box1.pick();
    System.out.println(x);
    }
}
