// นายวฤษณิ์ ทับทิม 64050661
public class Main {
    public static void main(String[] args) {
        Game football = new Game();
        Game basketball = new Game();
        football.setStrategy(new Football());
        basketball.setStrategy(new Basketball());
        football.startGame();
        basketball.startGame();
    }
}
