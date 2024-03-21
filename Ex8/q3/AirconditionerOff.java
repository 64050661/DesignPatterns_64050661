// concrete command
// นายวฤษณิ์ ทับทิม 64050661
public class AirconditionerOff implements Remote {
    private Airconditioner ac;

    public void setAirconditionerOff(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    public String toString() {
        return "AC " + ac.getRoomName();
    }
}
