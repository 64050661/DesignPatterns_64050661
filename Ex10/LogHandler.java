import java.util.HashMap;

// นายวฤษณิ์ ทับทิม 64050661
public abstract class LogHandler {
    protected LogHandler next;
    protected String logHandlerName;
    protected String level;
    private HashMap<String, Integer> map = new HashMap<>();
    // ใช้ hashmap ดูค่า INFO DEBUG ERROR แล้วกำหนด level เป็น label
    // ตอนที่ไปเช็ค level ให้ใช้ค่า value ในการเช็ค

    public LogHandler(String logHandlerName) {
        this.logHandlerName = logHandlerName;
        map.put("INFO", 1);
        map.put("DEBUG", 2);
        map.put("ERROR", 3);
    }

    public String getLogHandlerName() {
        return logHandlerName;
    }

    public void setLogHandler(LogHandler logHandler) {
        if (next != null) {
            next.setLogHandler(logHandler);
        } else { // เป็น root
            next = logHandler;
        }
    }

    public void logMessage(String message, String level) {
        if (map.get(this.level) <= map.get(level)) {
            process(message);
        }
        if (next != null) {
            next.logMessage(message, level);
        }
    }

    public abstract void process(String message);

}
