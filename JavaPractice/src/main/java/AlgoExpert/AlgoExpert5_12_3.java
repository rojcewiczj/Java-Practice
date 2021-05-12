package AlgoExpert;

public class AlgoExpert5_12_3 {
    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList previousNode = null;
            LinkedList currentNode = head;
            while(currentNode != null){
                LinkedList nextNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                try{
                System.out.println(currentNode.next.value);
                }
                catch(Exception e){
          System.out.println(e);
                    
                }
                currentNode = nextNode;
            }
        return previousNode;
      }
    
      static class LinkedList {
        int value;
        LinkedList next = null;
    
        public LinkedList(int value) {
          this.value = value;
        }
      }
}
