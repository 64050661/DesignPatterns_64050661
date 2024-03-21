// นายวฤษณิ์ ทับทิม 64050661
public class Mediator {
    public Alarm alarm;
    public CoffeePot coffeePot;
    public Sprinkler sprinkler;

    public Alarm getAlarm() {
        return alarm;
    }

    public CoffeePot getCoffeePot() {
        return coffeePot;
    }

    public Sprinkler getSprinkler() {
        return sprinkler;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    // งาน Alarm
    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        sprinkler.doSprinkler();
        coffeePot.doCoffeePot();
    }

    // งาน Alarm
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }

    // งาน CoffeePot
    public void doCoffeePot() {
        System.out.println("I am coffee pot,... doing my task");
        alarm.endAlarm("Coffee Pot");
    }

    // งาน Sprinkler
    public void doSprinkler() {
        System.out.println("I am sprinkler,... doing my task");
        alarm.endAlarm("Sprinkler");
    }
}
