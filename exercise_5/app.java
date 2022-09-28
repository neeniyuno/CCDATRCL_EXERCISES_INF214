public class App 
{
    public static void main(String[] args) 
    {
        // 7 nodes
        Node A = new Node("Leader:Jenina,");
        Node B = new Node("Assistant Leader:Chamber,");
        Node C = new Node("Secretary:Viper,");
        Node D = new Node("Editor:KJ,");
        Node E = new Node("Writer:Cypher,");
        Node F = new Node("Actor:Luciann,");
        Node G = new Node("Actress:Senna");

        //create edges between the nodes
        // set left and right child of root node A
        A.left = B;
        A.right = C;

        // set left and right child of node B
        B.left = D;
        B.right = E;

        // set left and right child of node C
        C.left = F;
        C.right = G;


        //perform pre-order traversal
        System.out.print("\nPre-order Traversal:\n");
        traversePreOrder(A);

        //perform post-order traversal
        System.out.print("\n\nPost-order Traversal:\n");
        traversePostOrder(A);

        //perform in-order traversal
        System.out.print("\n\nIn-order Traversal:\n");
        traverseInOrder(A);
    }
  
    // pre-order method
    static void traversePreOrder(Node node) 
    {
        if (node != null) 
        {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    // post-order method
    static void traversePostOrder(Node node) 
    {
        if (node != null) 
        {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    // in-order Method
    static void traverseInOrder(Node node) 
    {
        if (node != null) 
        {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

}
