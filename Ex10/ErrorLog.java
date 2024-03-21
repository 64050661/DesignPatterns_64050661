// นายวฤษณิ์ ทับทิม 64050661
public class ErrorLog extends LogHandler {
    public ErrorLog(String logHandlerName, String level) {
        super(logHandlerName);
        this.level = level;
    }

    @Override
    public void process(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
