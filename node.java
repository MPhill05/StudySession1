
public class node {
		
		node next;
		int data;
		
		node(int data){
			this.data = data;
		}
		
		public node revList(node head) {
			node previous = null;
			node current = head;
			while(current != null) {
				node tmp = current.next;
				current.next = previous;
				previous = current;
				if(tmp != null) {
					current = tmp;
				} else {
					break;
				}
			}
			
			displayNodes(current);
			return current;
		}
		
		public void displayNodes(node head) {
			while(head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
		
	}
	