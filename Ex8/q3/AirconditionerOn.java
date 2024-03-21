// concrete command
// นายวฤษณิ์ ทับทิม 64050661
public class AirconditionerOn implements Remote {
    private Airconditioner ac;

    public void setAirconditionerOn(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
    }

    public String toString() {
        return "AC " + ac.getRoomName();
    }
}
