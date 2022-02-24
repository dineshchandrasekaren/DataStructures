//USING LINKEDLIST
class Node {
  constructor(value){
    this.value = value;
    this.next = null;
  }
}

class Queues{
  constructor(){
    this.first=null;
    this.last=null;
    this.length=0;
  }
  peek(){
    return this.last;
  }
beforeLast(){
  let currentQueue=this.first;
  while(currentQueue.next!==null){
    if(currentQueue.next.next===null) return currentQueue;
    currentQueue=currentQueue.next;
  }
}
enqueue(value){
  let newNode=new Node(value);
  if(this.isEmpty()){
    this.first=this.last=newNode;
  }else{
    newNode.next=this.first;
    this.first=newNode;
  }
  this.length++;
}
dequeue(){
  if(this.isEmpty()) 
    return console.log("Queue was empty");

    if(this.first===this.last)this.first=this.last=null;
  
    let Prev=this.beforeLast();
    Prev.next=null;
    this.last=Prev;
    this.length--;
  }
  
  isEmpty(){
    return this.first==null;
  }
}
let myQueues=new Queues();
myQueues.enqueue(12);
myQueues.enqueue(13);
myQueues.enqueue(14);
myQueues.dequeue();
// myQueues.dequeue();
console.log(myQueues);
console.log(myQueues.peek());


//USING ARRAY
class Queue{
  constructor(){
    this.array=[];
  }

  peek(){
    return this.array[0];
  }
  enqueue(value){
    this.array.push(value);
    return this;
  }
  dequeue(){
    if(this.array[0]===undefined) return console.log("Queue was empty"); 
    this.array.shift();
    return this;
  }
}

let myQueue=new Queue();
myQueue.enqueue(12);
myQueue.enqueue(13);
myQueue.enqueue(14);
myQueue.dequeue();

console.log(myQueue);
console.log(myQueue.peek());
