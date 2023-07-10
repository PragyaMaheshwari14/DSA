public class lecture12 {
    public static void removDuplicates(String str , int idx , StringBuilder  newstr , boolean map[]){
      if(idx == str.length()){
            System.out.println(newstr);
            return;
       }

        // kaam
        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a'] == true){
            // duplicate
            removDuplicates(str, idx +1, newstr, map);
         }
         else{
            map[currentChar-'a'] = true;
             removDuplicates(str, idx, newstr.append(currentChar), map);
         }
    }    
    public static void main(String argfs[]){
      String str = "appnacollege";
      removDuplicates(str, 0,new StringBuilder(""), new boolean[26]);       
    }
    
}
