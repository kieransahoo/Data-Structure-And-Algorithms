### Link :
https://leetcode.com/problems/valid-parentheses/description/

### Solution :

<b>Java : <b>
- Without  Stack
```
class Solution {
    public boolean isValid(String s) {
        while(true){
            if(s.contains("()")){
                s = s.replace("()","");
            }else if(s.contains("[]")){
                s = s.replace("[]","");
            }else if(s.contains("{}")){
                s = s.replace("{}","");
            }else{
                return s.isEmpty();
            }
        }
    }
}
```
-  With Stack 
```

```


