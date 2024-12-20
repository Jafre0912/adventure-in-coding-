//4. Write program to Merging of two sorted lists


public class Merge2List {

    static class Node {
        int data;
        Node nextNode;

        Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    static Node mergeTwoLists(Node List1, Node List2) {
        Node t1 = List1;
        Node t2 = List2;

        Node h = new Node(0);
        Node t = h;

        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                t.nextNode = t1;
                t = t1;
                t1 = t1.nextNode;
            } else {
                t.nextNode = t2;
                t = t2;
                t2 = t2.nextNode;
            }
        }

        if (t1 == null) {
            t.nextNode = t2;
        } else {
            t.nextNode = t1;
        }

        return h.nextNode;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(11);
        Node e = new Node(16);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;

        Node j = new Node(5);
        Node k = new Node(8);
        Node l = new Node(12);
        Node m = new Node(15);

        j.nextNode = k;
        k.nextNode = l;
        l.nextNode = m;
        Node z = mergeTwoLists(a, j);
        Node temp = z;
        System.out.print(temp.data);
        while (temp.nextNode != null) {
            System.out.print(" -> " + temp.nextNode.data);
            temp = temp.nextNode;
        }
    }
}
