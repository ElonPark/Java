package mapTest;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.*;

public class mainClass
{
    
    public static void main(String[] args)
    {
        // list<MyClass> -> index number 관리 [0,1,2,]
        // [0].get-> int, String, myclass
        
        // map< Key , value > -> (Key, value) : tree 구조
        // Key는 변경이 불가능 == 중복 X
        // HashMap, TreeMap(sort)
        
        // map<Integer, Integer>
        // map<String, String>
        // map<String, String>
        // map<String, MyClass>
        
        Map<String, String> map = new HashMap<String, String>();
        // TreeMap<String, String> tmap = new TreeMap<String,String>();
        
        // add == put
        map.put("사과", "apple");
        map.put("배", "pear");
        map.put("포도", "grape");
        
        String str = map.get("사과");
        System.out.println(str);
        
        // 수정
        map.put("사과", "AppleApple");
        String str1 = map.get("사과");
        System.out.println(str1);
        
        // 삭제
        map.remove("배");
        // map.remove("배", "pear");
        
        // 검색 -> key(검색)-> value
        boolean b = map.containsKey("배");
        System.out.println(b);
        
        for (String key : map.keySet())
        {
            
            System.out.println("키:" + key + ", 값: " + map.get(key));
        }
        
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext())
        {
            String key = keys.next();
            System.out.println("키:" + key + ", 값: " + map.get(key));
        }
        System.out.println(" ");
        // sort
        TreeMap<String, String> tm = new TreeMap<String, String>(map);
        
        Iterator<String> itKey = tm.keySet().iterator();// sort
        
        while (itKey.hasNext())
        {
            String key = itKey.next();
            System.out.println("키:" + key + ", 값: " + tm.get(key));
        }
        
        
        Map<String, String> map1;
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        
        //정보통신과
        map1 = new HashMap<String, String>();
        map1.put("국어", "90");
        map1.put("수학", "80");
        
        list.add(map1);
        
        
        
        //컴공과
        map1 = new HashMap<String, String>();
        map1.put("국어", "55");
        map1.put("수학", "40");
        
        list.add(map1);
        
        System.out.println(list);
    }
    
}
