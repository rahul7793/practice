// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false

class Solution {
    Map<Character, Character> map = Map.of('(',')','{','}','[',']');
    
    public boolean isValid(String s) {
        
//         List<Character> chars = s.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
//         List<Character> stack = new ArrayList<Character>();
//         if(chars.size() < 2 || chars.size()%2 != 0)
//             return false;
//         stack.add(chars.get(0));
//         for(int i = 1; i < chars.size(); i++){
                      
//             if(chars.get(i) == '(' || chars.get(i) == '{' || chars.get(i) == '[' || stack.isEmpty()){
//                 stack.add(chars.get(i));
//                 continue;
//             }
//             int pos = 0;
//             if(chars.get(i) == ')' && stack.get(stack.size()-1) == '('){
//                 pos = stack.lastIndexOf('(');
//             }
//             else if(chars.get(i) == '}' && stack.get(stack.size()-1) == '{'){
//                 pos = stack.lastIndexOf('{');
//             }
//             else if(chars.get(i) == ']' && stack.get(stack.size()-1) == '['){
//                 pos = stack.lastIndexOf('[');
//             }
//             else
//                 return false;
//             stack.remove(pos);
            
//         }
        
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                if(map.get(c) != ch)
                    return false;
            }
        }
   
        return stack.isEmpty();
    }
}
