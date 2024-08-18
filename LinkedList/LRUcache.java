import java.util.HashMap;

class LRUCache {
    private class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
        private final int capacity;
        private final HashMap<Integer, Node> map;
        private final Node head, tail;

        public LRUCache(int capacity){
            this.capacity = capacity;
            this.map = new HashMap<>(capacity);
            this.head = new Node(0,0);
            this.tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key){
            Node node = map.get(key);
            if(node == null){
                return -1;
            }
            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value){
            Node node = map.get(key);
            if(node != null){
                node.value = value;
                moveToHead(node);
            } else{
                Node newNode = new Node(key, value);
                map.put(key, newNode);
                addNode(newNode);
                if(map.size() > capacity){
                    Node tail = popTail();
                    map.remove(tail.key);
                }
            }
        }

        private void addNode(Node node){
            node.prev = head;
            node.next = head.next;

            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(Node node){
            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        private void moveToHead(Node node){
            removeNode(node);
            addNode(node);
        }

        private Node popTail(){
            Node res = tail.prev;
            removeNode(res);
            return res;
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


 // TC: O(1) for both get and put
 // SC: O(capacity)
