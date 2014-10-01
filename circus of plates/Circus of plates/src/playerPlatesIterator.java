import java.util.Iterator;
import java.util.Stack;

public class playerPlatesIterator implements iterator {

	private Stack<shape> stk = null;

	public playerPlatesIterator(Stack<shape> data) {
		stk = new Stack<shape>();
		stk = data;
	}

	@Override
	public Iterator<shape> createIterator() {
		// TODO Auto-generated method stub

		return stk.iterator();
	}

}
