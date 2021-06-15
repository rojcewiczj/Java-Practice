package AlgoExpert;

public class AlgoExpert6_14_2 {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;
    
        public BST(int value) {
          this.value = value;
        }
      }
    
      public int findKthLargestValueInBst(BST tree, int k) {
        ArrayList<Integer> sortedNodeValues = new ArrayList<Integer>();
            inOrderTraverse(tree, sortedNodeValues);
            return sortedNodeValues.get(sortedNodeValues.size() - k);
      }
       
        public void inOrderTraverse(BST node, ArrayList<Integer> sortedNodeValues){
          if(node == null) return;
            
            inOrderTraverse(node.left, sortedNodeValues);
            sortedNodevalues.add(node.value);
            inOrderTraverse(node.right, sortedNodeValues);
        }
}
