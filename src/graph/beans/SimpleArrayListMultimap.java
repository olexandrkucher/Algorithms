package graph.beans;

import java.util.*;

public class SimpleArrayListMultimap<T, E> {

    private Map<T, List<E>> map;

    public SimpleArrayListMultimap() {
        map = new HashMap<>();
    }

    public void put(final T key, final E value){
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    public List<E> get(final T key){
        return map.get(key);
    }

    public void remove(final T key){
        map.remove(key);
    }

    public void clear(){
        map.clear();
    }

    public Set<T> keySet(){
        return map.keySet();
    }
}
