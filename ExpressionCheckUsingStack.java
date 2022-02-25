import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
        List<Character> leftBracket= Arrays.asList( '(',  '[',  '{', '<');
        List<Character> rightBracket= Arrays.asList( ')',  ']',  '}', '>');
    public Boolean isBalanced(String input){
        Stack<Character> stacks =new Stack<>();
        for (char ch :
                input.toCharArray()) {
            if (isLeftBracket(ch))
                stacks.push(ch);

            if(isRightBracket(ch)) {
              var top=  stacks.pop();
                if(isBracketMatch(ch,top)) return  false;
            }

        }
        return  stacks.empty();
    }
    private boolean isLeftBracket(char ch){
        return this.leftBracket.contains(ch);
    }
    private boolean isRightBracket(char ch){
        return this.leftBracket.contains(ch);
    }
    private boolean isBracketMatch(char left,char right){
        return leftBracket.indexOf(left)==rightBracket.indexOf(right);
    }
}
