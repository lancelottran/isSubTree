/**
We have to watch out for two tree having same traversial but have different structure
For example:
    1
   /
  2
  
 and
 
    1
     \
      2
      
But we can counter it by placing a null value for example (2,x,1) and (x,2,1)
**/

boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
    if(t2 == null)
        return true;
    
    if(t1 == null)
        return false;
    
    StringBuilder st1 = new StringBuilder();
    StringBuilder st2 = new StringBuilder();
    
    makeString(t1, st1);
    makeString(t2, st2);
    
    System.out.println(st1 + " " + st2);
    
    return st1.indexOf(st2.toString()) != -1;
    
}

void makeString(Tree<Integer> t, StringBuilder sb){
    if(t == null)
    {
        sb.append(" x ");
        return;
    }
    
    sb.append(t.value + " ");
    makeString(t.left, sb);
    makeString(t.right, sb);
}
