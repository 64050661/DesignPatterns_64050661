// นายวฤษณิ์ ทับทิม 64050661
public class App {
    public static void main(String[] args) {
        LogHandler console = new ConsoleLog("Console Log Handler", "INFO");
        LogHandler file = new FileLog("File Log Handler", "DEBUG");
        LogHandler error = new ErrorLog("Error Log Handler", "ERROR");

        // เนื่องจาก LogHandler เป็น abstract class ไม่สามารถสร้าง root ได้
        // (abstract ไม่สามารถสร้าง object root ได้)
        // ทำให้ใช้ error เป็นตัวแรกในการ set Handler
        error.setLogHandler(file);
        file.setLogHandler(console);

        System.out.println("------------------------- INFO -------------------------");
        error.logMessage("This is an information.", "INFO");
        System.out.println("------------------------- DEBUG -------------------------");
        error.logMessage("This is a debug information.", "DEBUG");
        System.out.println("------------------------- ERROR -------------------------");
        error.logMessage("This is an error information.", "ERROR");
        System.out.println("---------------------------------------------------------");

    }
}