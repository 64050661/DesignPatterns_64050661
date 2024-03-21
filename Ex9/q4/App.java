// นายวฤษณิ์ ทับทิม 64050661
public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        Alarm alarm = new Alarm();
        Mediator mediator = new Mediator();
        mediator.setAlarm(alarm);
        mediator.setCoffeePot(coffeePot);
        mediator.setSprinkler(sprinkler);
        alarm.setMediator(mediator);
        coffeePot.setMediator(mediator);
        sprinkler.setMediator(mediator);

        alarm.doAlarm();
    }
}
