import java.util.ArrayList;
import java.util.List;

// นายวฤษณิ์ ทับทิม 64050661
public class App {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(5.5, 200, 100));
		shapes.add(new Triangle(4, 5, 500, 1000));
		shapes.add(new Rectangle(6, 8, 400, 720));
		SaveRasterFormat rasterFormat = new SaveRasterFormat();
		acceptSaveFormat(shapes, rasterFormat);
		System.out.println("----------------------------------------------------------------------------------");
		SaveVectorFormat vectorFormat = new SaveVectorFormat();
		acceptSaveFormat(shapes, vectorFormat);
		// for (Shape shape : shapes) {
		// shape.accept(rasterFormat);
		// shape.accept(vectorFormat);
		// }
	}

	public static void acceptSaveFormat(List<Shape> shapes, Visitor visitorFormat) {
		for (Shape shape : shapes) {
			shape.accept(visitorFormat);
		}
	}
}
