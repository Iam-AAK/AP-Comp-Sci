/**
 *Arya Kulkarni
 *Waitng List
 */
import java.util.*;

class WaitingList {

    private int numNodes;
    private ListNode front;

    public WaitingList(Object data) {
        front = new ListNode(data, null);
        numNodes = 1;
    }

    public void add(Object data)
    // post: appends the specified element to the end of this list.
    {
        ListNode temp = new ListNode(data, null);
        ListNode current = front;
        // starting at the head node, crawl to the end of the list
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // the last node's "next" reference set to our new node
        current.setNext(temp);
        numNodes++;// increment the number of elements variable
    }

    public void insert(Object data, int index) {

        if (index == 0) {
            ListNode newNode = new ListNode(data, null);
            newNode.setNext(front);
            front = newNode;
            numNodes++;
        }
        
        else {
            ListNode temp = new ListNode(data, null);
            ListNode current = front;

            for (int i = 1; i < index && current.getNext() != null; i++) {
                current = current.getNext();
                // get to the node right before the index we want
                // System.out.println("Current to string: " + current.getValue().toString());
            }
            temp.setNext(current.getNext());
            // set the inserted nodes pointer to the "next" node
            current.setNext(temp);
            // set the node before our inserted node to point to our inserted node
            numNodes++;
        }

    }


    public int size() {
        return  numNodes;
    }

    private ListNode getKthNode(int k) {
        if (k > numNodes)
            return null;
        else {
            ListNode current = front;
            int count = 0;
            while (count < k && current != null) {
                count++;
                current = current.getNext();
            }
            return current;
        }
    }

    public void transferNodesFromEnd(WaitingList other, int numToTransfer) {
        int k = 0;
        int start = 0;
        while (k < numToTransfer) {
            start = other.size() - numToTransfer + k;
            ListNode moveMe = other.getKthNode(start);
            add(moveMe.getValue());
            numNodes++;
            k++;
        }
    }

    @Override
    public String toString() {
        ListNode current = front;
        String output = "";
        while (current != null) {
            output += "[" + current.getValue().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
}

class ListNode {

    private Object value;
    private ListNode next;

    public ListNode(Object v, ListNode n) {
        value = v;
        next = n;
    }

    public Object getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

class Tester {
    public static void main(String[] args) {
        WaitingList myWaitingList = new WaitingList("A");
        myWaitingList.add("B");
        myWaitingList.add("C");

        WaitingList otherWaitingList = new WaitingList("Z");
        otherWaitingList.add("D");
        otherWaitingList.add("E");
        otherWaitingList.add("F");
        otherWaitingList.add("G");



        System.out.println(myWaitingList.toString());
        System.out.println("Size: " + myWaitingList.size());
        System.out.println(otherWaitingList.toString());
        System.out.println("Size: " + otherWaitingList.size());
        myWaitingList.transferNodesFromEnd(otherWaitingList, 3);
        System.out.println(myWaitingList.toString());
        System.out.println("Size: " + myWaitingList.size());

        myWaitingList.insert(1, 2);
        System.out.println(myWaitingList.toString());

        myWaitingList.insert(0, 0);
        System.out.println(myWaitingList.toString());





    }

}