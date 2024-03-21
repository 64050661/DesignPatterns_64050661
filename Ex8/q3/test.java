import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.ensureCapacity(10);
        System.out.println(test.size());
    }
}
