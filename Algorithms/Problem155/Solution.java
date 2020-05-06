/*
Runtime: 46 ms, faster than 89.37% of Java online submissions for Min Stack.
Memory Usage: 40.2 MB, less than 29.71% of Java online submissions for Min Stack.
*/
class Node{
    int data, min;
    Node next;
    
    Node(int x){
        this.data = this.min = x;
        this.next = null;
    }
}

class MinStack {
    private Node head;
    public void push(int x) {
        if (head == null){
            head = new Node(x);
            return;
        }
        Node newNode = new Node(x);
        newNode.min = Math.min(newNode.min, head.min);
        newNode.next = head;
        head = newNode;
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}