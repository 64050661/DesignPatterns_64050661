// concrete command
// นายวฤษณิ์ ทับทิม 64050661
public class LightOn implements Remote {
    private Light light;

    public void setLightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    public String toString() {
        return "light " + light.getRoomName();
    }
}
