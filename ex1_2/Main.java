import java.util.Scanner;

// 64050661 นายวฤษณิ์ ทับทิม
public class Main {
    public static void main(String[] args) {
        String shapeType = null;
        System.out.print("What do draw? 1. Elipse, 2. Rectangle ");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        switch (type) {
            case 1:
                shapeType = "Elipse";
                break;
            case 2:
                shapeType = "Rectangle";
                break;
        }
        FootShape footShape = new FootShape();
        Foot foot = new Foot(footShape);
        System.out.print(foot.draw(shapeType));
        sc.close();
    }
}
