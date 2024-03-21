import java.util.Scanner;

// นายวฤษณิ์ ทับทิม 64050661
public class App {
    public static void main(String[] args) {
        Headquaters obj = new Headquaters();
        Score obj1 = new Score();
        Score obj2 = new Score();
        obj.add(obj1);
        obj.add(obj2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score ");
        String line = null;
        while (!(line = sc.nextLine()).isEmpty()) {
            obj.setScoreDetail(line);
            System.out.print("Enter Score ");
        }
        sc.close();
    }
}