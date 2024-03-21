// นายวฤษณิ์ ทับทิม 64050661
public class Headquaters extends Source {
    private String scoreDetail;

    public String getScoreDetail() {
        return scoreDetail;
    }

    public void setScoreDetail(String scoreDetail) {
        this.scoreDetail = scoreDetail;
        notifyObservers();
    }
}