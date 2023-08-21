// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
public class converteBSTtoSortedDoublyLinkedList {
    Node first = null;
    Node last = null;

    public void inorderHelper(Node node){
        if(node == null) return;

        inorderHelper(node.left);

        if(last != null){
            last.right = node;
            node.left = last;
        }else{
            //is the leftmost left/ min value in the tree
            first = node;
        }
        last = node;

        inorderHelper(node.right);
    }

    public Node treeToDoublyList(Node root){
        if(root == null) return null;

        inorderHelper(root);
        first.left = last;
        last.right = first;
    }    
}
