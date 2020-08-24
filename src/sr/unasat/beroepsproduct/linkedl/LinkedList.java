//package sr.unasat.beroepsproduct.linkedl;
//
//public class LinkedList {
//
//
//        // Structure for a linked list node /
//        static class Node {
//            RegularVehicles data;
//            Node next;
//        }
//
//        // Function to insert whole linked list in
//        // to another linked list at position k
//        static Node insert(Node wegN, Node wegZ, int k){
//
//            // traverse the first linked list until k-th
//            // point is reached
//            int count = 1;
//            Node curr = wegN;
//            while (count < k) {
//                curr = curr.next;
//                count++;
//            }
//            // backup next node of the k-th point
//            Node temp = curr.next;
//            // join second linked list at the kth point
//            curr.next = wegZ;
//            // traverse the second linked list till end
//            while (wegZ.next != null)
//                wegZ = wegZ.next;
//            // join the second part of the linked list
//            // to the end
//            wegZ.next = temp;
//            return wegN;
//        }
//
//        // Function to print linked list recursively
//        static void printList(Node head)
//        {
//            if (head == null)
//                return;
//
//            // If head is not null, print current node
//            // and recur for remaining list
//            System.out.print(head.data + " ");
//            printList(head.next);
//        }
//
//        // Given a reference (pointer to pointer) to the head
//        // of a list and an int, insert a new node on the front
//        // of the list.
//        static Node push(Node head_ref, RegularVehicles new_data)
//        {
//            Node new_node = new Node();
//            new_node.data = new_data;
//            new_node.next = head_ref.next;
//            head_ref.next = new_node;
//            return head_ref.next;
//        }
//    public static void main(String[] args)
//    {
//        // The constructed linked lists are :
//        // a: 1.2.3.4.5;
//        // b: 7.8.9.10.11
//        Node a = null; //noord
//        Node b = null; //zuid
//        int k = 4;
//
//        // weg noord bevat 3 voertuigen en als er minder dan 5 auto's zijn kunnen alle auto's oprijden(4 auto's)
//        // de lege object stelt een open spot voor die ook mocht oprijden.
//        a = push(a, new RegularVehicles('N', "car 1" ,"pg 12-12"));
//        a = push(a, new RegularVehicles('N', "car 2" ,"pk 10-10"));
//        a = push(a, new RegularVehicles('N', "car 3" ,"pa 86-45"));
//        a = push(a, new RegularVehicles('N', " " ," "));
//
//
//
//        // second linked list
//        b = push(b, new RegularVehicles('Z',"car 1", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 2", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 3", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 4", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 6", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 7", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 8", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 9", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 10", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 11", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 12", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 13", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 14", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 15", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 16", "pp 64-65"));
//        b = push(b, new RegularVehicles('Z',"car 17", "pp 64-65"));
//
//
//        printList(a);
//        System.out.println();
//
//        printList(b);
//
//        a = insert(a, b, k);
//
//        System.out.print("\nResulting linked list\t");
//        printList(a);
//    }
//}
//
//
