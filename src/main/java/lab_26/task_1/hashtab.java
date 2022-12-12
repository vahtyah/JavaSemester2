package lab_26.task_1;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashtab<K,V> {
    Map<Integer, V> map;
    public int hashtabHash(K key){
       return key.hashCode();
    }
    public void hashtabInit(){
        map = new HashMap<>();
    }
    public void hashtabAdd(K key, V value){
        map.put(hashtabHash(key),value);
    }
    public V hashtabLookup(K key){
        if(map.containsKey(key)) return map.get(key);
        return null;
    }
    public boolean hashtabDelete(K key){
        if(map.containsKey(key)) map.remove(key.hashCode());
        else return false;
        return true;
    }
}
