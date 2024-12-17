package DSANotesProblems;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExmpleDSA {

    static void queueLinkedListImple() {
    Queue<Integer> queue = new LinkedList();
        queue.add(20);
    queue.add(10);

    queue.add(30);

       // System.out.println("Remove element from queue: "+ queue.remove());
        System.out.println("Queue is: "+ queue);
        System.out.println("Queue size: "+ queue.size());
        System.out.println("Peek queue: "+ queue.peek());
        while(!queue.isEmpty()){
            System.out.println("Queue element: "+queue.poll());
            //System.out.println("Peek queue: "+ queue.peek());
        }
        System.out.println("Queue size after polling: "+ queue.size());
    }

    static void priorityQueueLLImple(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(10);

        queue.add(30);

        // System.out.println("Remove element from queue: "+ queue.remove());
        System.out.println("P Queue size: "+ queue.size());
        System.out.println("P Queue is: "+ queue);

        System.out.println("Peek queue: "+ queue.peek());
        while(!queue.isEmpty()){
            System.out.println("Queue element: "+queue.poll());
            //System.out.println("Peek queue: "+ queue.peek());
        }
        System.out.println("Queue size after polling: "+ queue.size());
    }
    public static void main(String[] args) {
        queueLinkedListImple();
        priorityQueueLLImple();
    }
    }
