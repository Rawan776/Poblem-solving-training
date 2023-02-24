

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode nextNode=head;
       while(nextNode!=null){
          System.out.println(nextNode.data);
          nextNode=nextNode.next; 
       }
           

    }

