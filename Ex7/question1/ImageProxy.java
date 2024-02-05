// นายวฤษณิ์ ทับทิม 64050661
public class ImageProxy implements IImage {
    private String fileName;
    private Image image = null;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new Image(fileName);
        }
        image.display();
    }
}
