// นายวฤษณิ์ ทับทิม 64050661
public class Sprinkler implements IColleague {
    public Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doSprinkler() {
        mediator.doSprinkler();
    }
}
