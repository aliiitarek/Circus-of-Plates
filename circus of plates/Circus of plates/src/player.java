import java.awt.Image;
import java.util.Stack;

public class player {
	private String imageUrl = "";
	private Image playerImage;
	private int xPostion;
	private int yPostion;
	private Stack<shape> stk1;
	private Stack<shape> stk2;

	public void move() {

	}

	public Stack<shape> getPlatesOfstk1() {
		return stk1;
	}

	public Stack<shape> getPlatesOfstk2() {
		return stk2;
	}

}
