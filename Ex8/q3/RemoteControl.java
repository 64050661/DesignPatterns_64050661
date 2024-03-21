import java.util.ArrayList;
import java.util.List;

// invoker
// นายวฤษณิ์ ทับทิม 64050661
public class RemoteControl {
    private List<Remote> remoteListOn = new ArrayList<>(6);
    private List<Remote> remoteListOff = new ArrayList<>(6);

    public RemoteControl() {
        for (int i = 0; i < 6; i++) {
            remoteListOn.add(null);
            remoteListOff.add(null);
        }
    }

    public void addSlot(int slot, Remote slotOn, Remote slotOff) {
        remoteListOn.add(slot, slotOn);
        remoteListOff.add(slot, slotOff);
    }

    public void getSlot(int slot) {
        if (remoteListOn.get(slot) != null) {
            System.out.println("slot " + slot + ", " + remoteListOn.get(slot).toString());
        } else {
            System.out.println("On button No command is assigned to this slot");
            System.out.println("Off button No command is assigned to this slot");
        }
    }

    public void removeSlot(int slot) {
        remoteListOn.remove(slot);
        remoteListOff.remove(slot);
    }

    public void remoteOn(int slot) {
        remoteListOn.get(slot).execute();
    }

    public void remoteOff(int slot) {
        remoteListOff.get(slot).execute();
    }

}
