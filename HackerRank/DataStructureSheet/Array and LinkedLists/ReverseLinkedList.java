import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

// class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
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

    public  static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
         ArrayList<Integer> arr=new ArrayList<>();
         ArrayList<Integer> rev_arr=new ArrayList<>();
         while(llist!=null){
             arr.add(llist.data);
             llist=llist.next;
         }
         System.out.println("before"+arr);
         int m=arr.size()-1;
         while(m>=0){
             System.out.println(arr.get(m));
             rev_arr.add(arr.get(m));
             m--;
         }
         System.out.println("array after reverse"+rev_arr);
         SinglyLinkedList r_list=new SinglyLinkedList();
         for(int k=0;k<rev_arr.size();k++){
             r_list.insertNode(rev_arr.get(k));
         }

        return r_list.head; 
    }

// }

    private static final Scanner scanner = new Scanner(System.in);
