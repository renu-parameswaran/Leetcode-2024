/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

 import java.util.*;

 public class NestedIterator implements Iterator<Integer> {
     private Stack<NestedInteger> stack;
 
     public NestedIterator(List<NestedInteger> nestedList) {
         stack = new Stack<>();
         for(int i = nestedList.size() - 1; i >= 0; i--){
             stack.push(nestedList.get(i));
         }
     }
 
     @Override
     public Integer next() {
         if(!hasNext()){
             throw new NoSuchElementException();
         }
         return stack.pop().getInteger();
     }
 
     @Override
     public boolean hasNext() {
         while(!stack.isEmpty()){
             NestedInteger top = stack.peek();
             if(top.isInteger()){
                 return true;
             }
             stack.pop();
             List<NestedInteger> list = top.getList();
             for(int i = list.size() - 1; i >= 0; i--){
                 stack.push(list.get(i));
             }
         }
         return false;
     }
 }
 
 /**
  * Your NestedIterator object will be instantiated and called as such:
  * NestedIterator i = new NestedIterator(nestedList);
  * while (i.hasNext()) v[f()] = i.next();
  */

  // TC: O(n) where n is the toatal number of integers in the nested list
  // SC: O(d) where d is the maximum depth of nested lists.