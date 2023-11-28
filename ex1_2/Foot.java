public class Foot {
    private FootShape footShape;

    public Foot(FootShape footShape) {
        this.footShape = footShape;
    }

    public String draw(String type) {
        String result = null;
        switch (type) {
            case "Elipse":
                result = footShape.drawAsElipse();
                break;
            case "Rectangle":
                result = footShape.drawAsRectangle();
                break;
        }
        return result;
    }
}
