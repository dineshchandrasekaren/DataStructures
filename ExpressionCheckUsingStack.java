

import java.util.Stack;

public class Expression {
    public Boolean isBalanced(String input){
        Stack<Character> stacks =new Stack<>();
     
        for (char ch :
                input.toCharArray()) {
            if (ch == '(')
                stacks.push(ch);

            if(ch==')') {
                if(stacks.empty()) return  false;
                stacks.pop();

            }
        }
        return  stacks.empty();
    }
}
