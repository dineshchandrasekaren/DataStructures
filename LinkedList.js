// add a method insert() to the linked list that adds a node to the specified index.

// class Node{
//   constructor(value){
//   this.value=value;
//   this.next=null;
//   }

// }
function Node(value) {
    this.value = value;
    this.next = null;
    this.prev = null;
}

class DoublyLinkedList {
    constructor(value) {
        this.head = {
            value: value,
            next: null,
            prev: null
        };
        this.tail = this.head;
        this.length = 1;
    }

    append(value) {
        let newNode = new Node(value);
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;

    }

    prepend(value) {
        let newNode = new Node(value);

        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;

        this.length++;
    }

    printList() {
        const array = [];
        let currentNode = this.head;
        while (currentNode !== null) {
            array.push(currentNode.value)
            currentNode = currentNode.next
        }
        return array;
    }

    insert(index, value) {
        if (index >= this.length) {
            this.append(value);
            return this.printList();
        } else if (index === 0) {
            this.prepend(value);
            return this.printList();
        }

        let newNode = new Node(value);
        let leader = this.traversalToNodes(index - 1);
        let follower = leader.next;
        follower= newNode;
        newNode.prev = leader
        newNode.next = follower;

        this.length++
        return this.printList();
    }

    traversalToNodes(index) {
        let currentNode = this.head;
        for (let i = 0; i<=this.length-1; i++) {
            if (i === index) return currentNode;
            else currentNode = currentNode.next;
        }
    }

    removeAt(index) {
        if (index < 0 || index > this.length) {
            return console.log("Invalid index");
        }
        let leader = this.traversalToNodes(index - 1);
        let follower = leader.next;
        leader.next = follower.next;
        follower.prev = leader;

        this.length--;
        return this.printList();
    }

    reverse() {
        let first=this.head;//9
        this.tail=this.head;
        let second=first.next;//10
        while(second){
            let temp=second.next;//11
            second.next=first;
            first=second;
            second=temp;
        }
        this.head.next=null;
        this.head=first;
        return this.printList();

    }
}

let doublyLinkedList = new DoublyLinkedList(10);
doublyLinkedList.append(11);
doublyLinkedList.append(12);
doublyLinkedList.append(13);
// console.log(doublyLinkedList.printList())
console.log(doublyLinkedList.insert(0, 9));
// doublyLinkedList.insert(2, 99)
// doublyLinkedList.insert(20, 88)


// console.log("removed 1 index "+doublyLinkedList.removeAt(1));
console.log(doublyLinkedList.reverse());
console.log(doublyLinkedList.length);




