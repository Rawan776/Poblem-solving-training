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

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
      //write code here
        ArrayList<Integer> nodesArrayList = new ArrayList<Integer>();
        while (true) {
            if(head1 != null){
            nodesArrayList.add(head1.data);
            head1 = head1.next;
            }
            else if (head2 != null) {
                nodesArrayList.add(head2.data);
                head2 = head2.next;
            }
            else
                break;
        }
        Collections.sort(nodesArrayList);
        
        SinglyLinkedList currentMergedlist = new SinglyLinkedList();
        for(int i = 0; i < nodesArrayList.size(); i++) {
            currentMergedlist.insertNode(nodesArrayList.get(i));
        }
        return currentMergedlist.head;
    }

    private static final Scanner scanner = new Scanner(System.in);
