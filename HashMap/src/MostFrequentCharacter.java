import java.util.HashMap;

public class MostFrequentCharacter {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> hm1 = new HashMap();
        for(char ch : s.toCharArray()){
            if(hm1.containsKey(ch)){
                int idx = hm1.get(ch);
                hm1.put(ch,idx+1);
            }
            else hm1.put(ch,1);
        }
        int mFreq = 0;
        for(char ch : hm1.keySet()){
            int freq = hm1.get(ch);
            if(freq>mFreq) mFreq = freq;
        }
        char cha = 'z';
        for(char ch : hm1.keySet()){
            int freq = hm1.get(ch);
            if(freq==mFreq && ch<=cha) cha = ch;
        }
        return cha;
    }
}
