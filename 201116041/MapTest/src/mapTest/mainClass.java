package mapTest;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.*;

public class mainClass
{
    
    public static void main(String[] args)
    {
        // list<MyClass> -> index number ���� [0,1,2,]
        // [0].get-> int, String, myclass
        
        // map< Key , value > -> (Key, value) : tree ����
        // Key�� ������ �Ұ��� == �ߺ� X
        // HashMap, TreeMap(sort)
        
        // map<Integer, Integer>
        // map<String, String>
        // map<String, String>
        // map<String, MyClass>
        
        Map<String, String> map = new HashMap<String, String>();
        // TreeMap<String, String> tmap = new TreeMap<String,String>();
        
        // add == put
        map.put("���", "apple");
        map.put("��", "pear");
        map.put("����", "grape");
        
        String str = map.get("���");
        System.out.println(str);
        
        // ����
        map.put("���", "AppleApple");
        String str1 = map.get("���");
        System.out.println(str1);
        
        // ����
        map.remove("��");
        // map.remove("��", "pear");
        
        // �˻� -> key(�˻�)-> value
        boolean b = map.containsKey("��");
        System.out.println(b);
        
        for (String key : map.keySet())
        {
            
            System.out.println("Ű:" + key + ", ��: " + map.get(key));
        }
        
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext())
        {
            String key = keys.next();
            System.out.println("Ű:" + key + ", ��: " + map.get(key));
        }
        System.out.println(" ");
        // sort
        TreeMap<String, String> tm = new TreeMap<String, String>(map);
        
        Iterator<String> itKey = tm.keySet().iterator();// sort
        
        while (itKey.hasNext())
        {
            String key = itKey.next();
            System.out.println("Ű:" + key + ", ��: " + tm.get(key));
        }
        
        
        Map<String, String> map1;
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        
        //������Ű�
        map1 = new HashMap<String, String>();
        map1.put("����", "90");
        map1.put("����", "80");
        
        list.add(map1);
        
        
        
        //�İ���
        map1 = new HashMap<String, String>();
        map1.put("����", "55");
        map1.put("����", "40");
        
        list.add(map1);
        
        System.out.println(list);
    }
    
}
