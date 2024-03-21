// concrete visitor (raster)
// นายวฤษณิ์ ทับทิม 64050661
public class SaveRasterFormat implements Visitor {
    private String saveCircle;
    private String saveTriangle;
    private String saveRectangle;

    public void setSaveCircle(String saveCircle) {
        this.saveCircle = saveCircle;
    }

    public void setSaveTriangle(String saveTriangle) {
        this.saveTriangle = saveTriangle;
    }

    public void setSaveRectangle(String saveRectangle) {
        this.saveRectangle = saveRectangle;
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("Saving the circle... with radius = " + circle.getRadius() + " at position "
                + circle.getxPos() + ", " + circle.getyPos() + " as raster");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Saving the triangle... with base = " + triangle.getBase() + " height = "
                + triangle.getHeight() + " at position "
                + triangle.getxPos() + ", " + triangle.getyPos() + " as raster");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Saving the rectangle... with width = " + rectangle.getWidth() + " height = "
                + rectangle.getHeight() + " at position "
                + rectangle.getxPos() + ", " + rectangle.getyPos() + " as raster");
    }

}
