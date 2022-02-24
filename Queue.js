//QUEUES --- FIFO -> FIRST IN FIRST OUT

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
  //get the first item in the queue
  peek(){
    return this.first.value;
  }
//add a value to queue
enqueue(value){
  let newNode=new Node(value);
  if(this.isEmpty()){
    this.first=this.last=newNode;
  }else{
    this.last.next=newNode;
    this.last=newNode;
  }
  this.length++;
}
  
//remove the first item  
dequeue(){
  if(this.isEmpty()) 
    return console.log("Queue was empty");

    if(this.first===this.last){this.first=this.last=null; return;}
  let temp=this.first.next;
  this.first.next=null;
  this.first=temp;
  this.length--;
  }
  //check if the queue is empty or not
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
