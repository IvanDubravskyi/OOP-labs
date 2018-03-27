

public class LinkedList {
    int size;
    private Node head;
    private Node tail;
    Node current;


    public LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
 
    public void add(Integer data) {
        Node nod = new Node();
        nod.setData(data);
       if(tail == null){
           head = nod;
           tail = nod;
       }else {
           tail.setNext(nod);
           tail = nod;
       }
       size++;
    }
 
    public Integer get(int index) {
        if(head == null || index > size){
            return null;
        }else if(size == 0){
            return head.getData();
        }else {
            current = head;
            while (index>0){
                if(current == null){
                    return null;
                }else {
                    current = current.getNext();
                    index--;
                }
            }return current.getData();
        }
    }

    public boolean delete(int index) {
        current = head;
        Node prev = head;
        if (head == null || index > size || index < 0){
            return  false;
        }else if(index == 0){
            head = head.getNext();
            size--;
            return true;
        }else{
            while(index > 0){
                prev = current;
                current = current.getNext();
                index--;
            }
            prev.setNext(null);
            prev.setNext(current.getNext());
            size--;
        }
        return true;
    }

    public int size() {
        return size;
    }
}