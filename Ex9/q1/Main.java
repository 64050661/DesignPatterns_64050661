// นายวฤษณิ์ ทับทิม 64050661
public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        Game basketball = new Basketball();
        football.initializeGame();
        football.playingGame();
        football.showResult();
        basketball.initializeGame();
        basketball.playingGame();
        basketball.showResult();
    }
}
