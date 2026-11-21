// 146. LRU Cache [Medium]
// https://leetcode.com/problems/lru-cache/
// Language: java | Runtime: 17 ms | Memory: 58.4 MB
// Time:  O(1)
// Space: O(capacity)
// Pattern: Hash map + Recursion
// Synced: 2026-11-21

class LRUCache {

    class Node{
        int key,value;
        Node prev,next;
        Node(int k,int v){
            key=k;
            value=v;
        }
    }

    private int capacity;
    private HashMap<Integer,Node> map=new HashMap<>();
    private Node head=new Node(0,0);    
    private Node tail=new Node(0,0);

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }

    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void insertAtHead(Node node){
        head.next.prev=node;
        node.next=head.next;
        head.next=node;
        node.prev=head;
    }
    
    public int get(int key) {
        
        if(!map.containsKey(key)) return -1;

        Node node=map.get(key);
        remove(node);
        insertAtHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            remove(node);
            insertAtHead(node);
            return;
        }
        if(map.size()==capacity){
            Node lru=tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
        Node node=new Node(key,value);
        insertAtHead(node);
        map.put(key,node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */