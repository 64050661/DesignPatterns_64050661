// นายวฤษณิ์ ทับทิม 64050661
public class Alarm implements IColleague {
    public Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doAlarm() {
        mediator.doAlarm();
    }

    public void endAlarm(String from) {
        mediator.endAlarm(from);
    }
}