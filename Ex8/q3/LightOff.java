// concrete command
// นายวฤษณิ์ ทับทิม 64050661
public class LightOff implements Remote {
    private Light light;

    public void setLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    public String toString() {
        return "light " + light.getRoomName();
    }
}
