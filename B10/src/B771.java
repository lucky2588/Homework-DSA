import java.util.HashSet;

public class B771 {

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> s=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            s.add(jewels.charAt(i));
        }
        int isCheck=0;
        for(int i=0;i<stones.length();i++){
            if(s.contains(stones.charAt(i))){
                isCheck++;
            }
        }
        return isCheck;
    }
}
