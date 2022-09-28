public class Node 
{
    // 1. key/data
    String data;

    // 2. pointer to the left child
    Node left;

    // 3. pointer to the right child
    Node right;

    // constructor
    public Node(String data) 
    {
        // set node data
        this.data = data;
        // iitialize left and right pointers to NULL.
        left = null;
        right = null;
    }
}
