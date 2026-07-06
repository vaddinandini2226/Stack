/*
 * Program: Stack Implementation using Linked List
 * Description:
 * This program implements a Stack using a singly linked list. It supports
 * push(), pop(), peek(), size(), and print() operations, following the
 * LIFO (Last In, First Out) principle.
 */
package datastructures;
public class Stack1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
        Node newNode= new Node(data);
        if(head==null)
            head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    public int peak(){
        if(head==null)
            System.out.println("List is empty");
        return head.data;
    }

    public int pop(){
        if(head==null)
            System.out.println("List is empty");
        int data=head.data;
        head=head.next;
        return data;
    }
    public void print(){
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+"--->");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

    public int size(){
        Node curr=head;
        int size=1;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }

    public static void main(String[] args){
        Stack1 stack=new Stack1();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.print();

        System.out.println(stack.peak());

        int size=stack.size();
        for(int i=0;i<size-1;i++){
            System.out.print(stack.pop()+"-->");
        }
        System.out.println(stack.pop());



    }
}
