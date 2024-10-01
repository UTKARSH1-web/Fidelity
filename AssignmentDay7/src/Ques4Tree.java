
 class nodel {
    int data;
    nodel left;
    nodel right;
    public nodel(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

 public class Ques4Tree {

         nodel root;

         Ques4Tree() {
             root = null;
         }

         void preOrder(nodel nodel) {
             //Implement the logic
             if (nodel == null) {
                 return;
             }
             System.out.print(nodel.data + " ");
             preOrder(nodel.left);
             preOrder(nodel.right);
         }

         public static void main(String[] args) {
             Ques4Tree tree = new Ques4Tree();
              tree.root = new nodel(1);
             tree.root.right = new nodel(2);
             tree.root.right.right = new nodel(5);
             tree.root.right.right.left = new nodel(3);
             tree.root.right.right.right = new nodel(6);
             tree.root.right.right.left.right = new nodel(4);
             System.out.println("Pre-Order traversal:");
             tree.preOrder(tree.root);
         }
     }
 