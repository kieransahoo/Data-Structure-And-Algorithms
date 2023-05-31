package Tree;
import java.util.*;
public class BuildPreOrderTree {
    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1; 
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]== -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Pre-Order Traversal => root->left->right
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

     // In-Order Traversal => left->root->right
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    // Post-Order Traversal => left->right->root
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       queue.add(null);
       while(!queue.isEmpty()){
        Node current = queue.remove();
        if(current == null){
            System.out.println();
            if(queue.isEmpty()){
                break;
            }else{
                queue.add(null);
            }
        }else{
            System.out.print(current.data+" ");
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
       }

    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.right.data);
        //preOrder(root);
        //inOrder(root);
        //postOrder(root);
        levelOrder(root);
    }
}
