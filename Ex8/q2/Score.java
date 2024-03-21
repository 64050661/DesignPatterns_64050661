// นายวฤษณิ์ ทับทิม 64050661
public class Score implements Observer {
    private String scoreDetail;

    @Override
    public void update(Source o) {
        this.scoreDetail = ((Headquaters) o).getScoreDetail();
        showData();
    }

    public void showData() {
        System.out.println("live result:" + this.scoreDetail);
    }

}
