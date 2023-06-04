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

    public static int countOfNodes(Node root){

        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        
        return leftNodes+rightNodes+1;
    }

    public static int sumOfNodes(Node root){

        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        
        return leftSum + rightSum + root.data;
    }

    public static int height(Node root){

        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam= diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+right.ht+1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myHeight,mydiam);

        return myInfo;
    }


    public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
   
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
 

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.right.data);//(O(n) time complexity)
        //preOrder(root);//(O(n) time complexity)
        //inOrder(root);//(O(n) time complexity)
        //postOrder(root);//(O(n) time complexity)
        //levelOrder(root);//(O(n) time complexity)
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root)); // O(n^2 time complexity)
        System.out.println(diameter2(root).diam);//(O(n) time complexity)
    }
    
}
