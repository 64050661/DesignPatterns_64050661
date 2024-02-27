// นายวฤษณิ์ ทับทิม 64050661
public class Basketball implements GameStrategy {

    @Override
    public void initializeGame() {
        System.out.println("Initializing basketball game...");
    }

    @Override
    public void playingGame() {
        System.out.println("Playing basketball game...");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the basketball game...");
    }

}
