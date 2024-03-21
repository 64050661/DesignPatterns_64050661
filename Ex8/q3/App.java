// นายวฤษณิ์ ทับทิม 64050661
public class App {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Airconditioner acBedroom = new Airconditioner("Bedroom");
        Light lightBedroom = new Light("Bedroom");
        Light lightKitchen = new Light("Kitchen");
        LightOn lightOn = new LightOn();
        LightOff lightOff = new LightOff();
        AirconditionerOn acOn = new AirconditionerOn();
        AirconditionerOff acOff = new AirconditionerOff();
        lightOn.setLightOn(lightBedroom);
        lightOff.setLightOff(lightBedroom);
        remoteControl.addSlot(0, lightOn, lightOff);
        remoteControl.getSlot(0);
        remoteControl.remoteOn(0);
        remoteControl.remoteOff(0);
        System.out.println("----------------------------");
        lightOn.setLightOn(lightKitchen);
        lightOff.setLightOff(lightKitchen);
        remoteControl.addSlot(1, lightOn, lightOff);
        remoteControl.getSlot(1);
        remoteControl.remoteOn(1);
        remoteControl.remoteOff(1);
        System.out.println("----------------------------");
        acOn.setAirconditionerOn(acBedroom);
        acOff.setAirconditionerOff(acBedroom);
        remoteControl.addSlot(2, acOn, acOff);
        remoteControl.getSlot(2);
        remoteControl.remoteOn(2);
        remoteControl.remoteOff(2);
        System.out.println("----------------------------");
        System.out.println("test one unvaliable slot, slot 3");
        remoteControl.getSlot(3);
    }
}
