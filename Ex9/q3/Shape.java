// abstract class ของรูปทรง (เป็นแม่ของ concrete ทั้งหลายอีกที)
// นายวฤษณิ์ ทับทิม 64050661
public abstract class Shape implements Element {
	private int xPos, yPos;

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}
