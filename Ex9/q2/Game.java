// นายวฤษณิ์ ทับทิม 64050661
public class Game {
    private GameStrategy gameStrategy;

    public void setStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void startGame() {
        gameStrategy.initializeGame();
        gameStrategy.playingGame();
        gameStrategy.showResult();
    }
}
