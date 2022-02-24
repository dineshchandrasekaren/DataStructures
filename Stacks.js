//USING LINKEDLIST
class Node {
  constructor(value){
    this.value = value;
    this.next = null;
  }
}

class Stack {
  constructor(){
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }
  peek() {
    return this.top.value;
  }
  push(value){
    let newNode=new Node(value);
    if(this.isEmpty()){
      this.top=this.bottom=newNode;
    }
    else{
      newNode.next=this.top;
      this.top=newNode;
    }
    this.length++;
  }
  pop(){
    if(this.isEmpty()) return console.log("Stack is empty");
     if(this.top == this.bottom) this.top = this.bottom =null;
    let second=this.top.next;
    this.top.next=null;
   this.top=second;
    
  }
  printList(){
    let array=[];
    let currentStack=this.top;
    while(currentStack!=null){
      array.push(currentStack.value);
      currentStack=currentStack.next;
    }
    return array;
  }
  isEmpty(){
    return this.top==null;
  }
}


const myStack = new Stack();
myStack.push("google");
myStack.push("udemy");
myStack.push("youtube");
myStack.push("ztm");

console.log(myStack.peek())
console.log(myStack)
console.log(myStack.printList())


//USING ARRAY
class Stack {
  constructor(){
    this.array=[];
  }

peek(){
    return this.array[this.array.length-1];
}
  
pop(){
  this.array.pop();
  return this;
}
   
push(value){
   this.array.push(value);
   return this
}
   
}


let myStack=new Stack();
myStack.push("google");
myStack.push("udemy");
myStack.push("youtube");
myStack.push("ztm");

console.log(myStack.peek());
console.log(myStack);
