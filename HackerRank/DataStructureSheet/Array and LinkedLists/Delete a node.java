

class Result {

    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
    SinglyLinkedListNode loopnode=llist;
    SinglyLinkedListNode head=llist;
    if(llist.next==null){
        llist=null;
        return llist;
    }
    for(int i=0;i<=position;i++){
        SinglyLinkedListNode deletenode;
        //if deletednode is head
        if(position==0){
            deletenode=llist;
            llist=null;
            head=deletenode.next;
        }
        //get node before deleted node
        else if(i==position-1){
            //current node.next reference for target deleted node
            deletenode=loopnode.next;
            //change reference of current node to reference of deleted node(next)-->node after deleted node 
            loopnode.next=deletenode.next;
            deletenode=null;
            break;
        }
        loopnode=loopnode.next;

    }
    
    return head;
    }
}

