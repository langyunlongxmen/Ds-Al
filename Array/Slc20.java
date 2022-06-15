
// public class Slc20 {
//     private static final HashMap<Character, Character> mapping;

//     public Solution() {
//         this.mapping = new HashMap<Charater, Character>();
//         this.mapping.put(')','(');
//         this.mapping.put(']','[');
//         this.mapping.put('}','{');
//     }

//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<Character>();
        
//         for(int i = 0; i<s.length(); i++) {
//             char c = s.charAt(i);

//             if (this.mapping.containsKey(c)) {
//                 char topElement = stack.empty() ? '#' : stack.pop();

//                 if (topElement != this.mapping.get(c)) {
//                     return false;
//                 }
//             } else {
//                 stack.push();
//             }


//         }
//         return stack.isEmpty();
//     }

// }
import java.util.Map;
import java.util.Stack;

class Slc20 {
    private static final Map<Character, Character> map = Map.of('(', ')',
                                                                '[', ']',
                                                                '{', '}');
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}