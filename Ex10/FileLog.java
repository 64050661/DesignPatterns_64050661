// นายวฤษณิ์ ทับทิม 64050661
public class FileLog extends LogHandler {
    public FileLog(String logHandlerName, String level) {
        super(logHandlerName);
        this.level = level;
    }

    @Override
    public void process(String message) {
        System.out.println("File::Logger: " + message);
    }
}
