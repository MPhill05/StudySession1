
public class reverseList {

	public static void main(String[] args) {
		node head = new node(2);
		node tmp = head;
		tmp.next = new node(5);
		tmp = tmp.next;
		tmp.next = new node(7);
		tmp = tmp.next;
		tmp.next = new node(6);
		tmp = tmp.next;
		tmp.next = new node(4);
		tmp = tmp.next;
		head.revList(head);
	}
	

}
