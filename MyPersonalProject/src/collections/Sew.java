package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Sew {

	public ArrayList<String> letterCombinations(int[] arr)
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        
    
        ArrayList<String> result = new ArrayList<String>();
        
        StringBuilder str = new StringBuilder();
        
        return letterHelper(result, arr, map, 0, str);
    }
    
    public ArrayList<String> letterHelper(ArrayList<String> result, int[] arr, HashMap<Integer, String> map, int index, StringBuilder str)
    {
        if(index >= arr.length)
        {
            result.add(new String(str));
            return result;
        }
        
        
        
        if(arr[index] == 1)
        {
            result = letterHelper(result, arr, map, index+1, str);
        }
        else
        {
            String s = map.get(arr[index]);
            for(int i = 0; i < s.length(); i++)
            {
                str.append(s.charAt(i));
                result = letterHelper(result, arr, map, index+1, str);
                str.deleteCharAt(str.length() - 1);
            }
        }
        
        
        
        return result;
    }
    
    
    public static void main(String[] args) 
    {
        Sew meghz = new Sew();
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        int[] arr = {2,1,3,4};
       
        System.out.println(meghz.letterCombinations(arr));
    }

}
