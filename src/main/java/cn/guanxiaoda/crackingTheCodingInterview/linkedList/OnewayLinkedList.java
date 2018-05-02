package cn.guanxiaoda.crackingTheCodingInterview.linkedList;

/**
 * Created by guanxiaoda on 6/13/16.
 */
public class OnewayLinkedList {
    public OnewayLinkedNode first;

    public void print() {
        OnewayLinkedNode node = this.first;
        System.out.print(node.data);
        node = node.next;
        while (node != null) {
            System.out.print("=>" + node.data);
            node = node.next;
        }
        System.out.println();
    }

    public void append(OnewayLinkedNode node) {
        OnewayLinkedNode last = this.first;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }

    public OnewayLinkedList(OnewayLinkedNode node){
        this.first = node;
    }


    public static void main(String[] args) {

        OnewayLinkedNode node0 = new OnewayLinkedNode(0);
        OnewayLinkedList list = new OnewayLinkedList(node0);
        for(int i=1;i<6;i++){
            OnewayLinkedNode node = new OnewayLinkedNode(i);
            list.append(node);
        }

        list.print();


    }
}
