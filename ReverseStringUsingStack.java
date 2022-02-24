

import java.util.Stack;

public class ReverseString {
    public String reverse(String input){
        Stack<Character> stacks =new Stack<>();
      
//        for (int i = 0; i < input.length(); i++) {
//            stacks.push(input.charAt(i));
//        }
      
        for (char ch:input.toCharArray()) stacks.push(ch);
   
//        String reverse="";
//        while(!stacks.empty())
//            reverse+=stacks.pop();
      
        StringBuffer reverse=new StringBuffer();
      
        while(!stacks.empty()) reverse.append(stacks.pop());
      
        return  reverse.toString();
    }
}
