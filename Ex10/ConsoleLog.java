// นายวฤษณิ์ ทับทิม 64050661
public class ConsoleLog extends LogHandler {
    public ConsoleLog(String logHandlerName, String level) {
        super(logHandlerName);
        this.level = level;
    }

    @Override
    public void process(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
