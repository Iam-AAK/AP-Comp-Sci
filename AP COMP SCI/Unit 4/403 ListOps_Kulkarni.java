/**
 *Arya Kulkarni
 *List Ops
 */
 
import java.util.*;

class ListOps<E> {

    public void shrink(List data){
    	
    	for(int i = 0; i < data.size(); i++){
    		
    		for (int j = 0; j < data.size(); j++){
    			
    			int x = j - 1;
    			
    			if (data.get(x) == data.get(i)){
    			
    			
    				data.remove(j);
    			
    			    			
    			}
    	
       			
    		}
    		
    	}
    	
    }
    
    public Object[] toArray(List[] data){
    	
    	Object[] array = new Object[data.length];
    	
    	for (int j = 0; j < data.length; j++){
    			
    		array[j] = data[j];
       			
    	}
    	
    	
    	return array;
    	
    }
    
    public E[] toArray(List<E> data){
    	
		E[] array = (E[])new Object[data.size()];
    	
    	for (int j = 0; j < data.size(); j++){
    			
    		array[j] = data.get(j);
    		    	
     	}
    	
    	
    	return array;
    	
    }
    
    public String toString(List data){
    	
    	
    	return "This is the data: " + data;
    	
    	
    }
    
    public List clone(List data){
    	
    	List<E> e = new ArrayList<E>();
    	
    	for (int j = 0; j < data.size(); j++){
    			
    		Collections.copy(e, data);
       			
    	}
    	
    	return e;
    	
    }
    
    public List skip(List data, int n){
    	
    	List e = new ArrayList(data.size());
    	
    	for (int j = 0; j < data.size(); j++){
    			
    		if ((j % n) == 0){
    			
    			
    			e.add(data.get(j));
    			
    		}
       			
    	}
    	
    	return e;
    	
    }
    
    public boolean contains(List data, Object target){
    	
    	boolean isIt = false;
    	
    	for (int j = 0; j < data.size(); j++){
    			
			if(data.get(j) == target){
				
				
				isIt = true;
				
			}
       			
    	}
    	
    	return isIt;
    	
    }
    
    public List intersect(List data, List other){
    	
   		List e = new ArrayList();
    	
    	for (int j = 0; j < data.size(); j++){
    			
    		if (data.get(j) == other.get(j)){
    			
				e.add(data.get(j));
    			
    		}
       			
    	}
    	
    	return e;
    }
    
    public List union(List data, List other){
    	
   		List e = new ArrayList();
   		
   		for (int j = 0; j < data.size(); j++){
    			
    		if (data.get(j) != other.get(j)){
    			
				e.add(data.get(j));
				e.add(other.get(j));
    			
    		}
       			
    	}
    	
    	return e;
    }
    
	public static void main (String[] args){
    	
	ListOps<Integer> yep = new ListOps<Integer>();
 
    	
    	List<Integer> data = new ArrayList<Integer>();
    	
    	data.add(1);
    	data.add(2);
    	data.add(1);
    	data.add(4);
    	data.add(5);
    	data.add(6);
    	data.add(7);
    	data.add(8);
    	data.add(9);
    	data.add(10);
    	
    	List<Integer> other = new ArrayList<Integer>();
    	
    	other.add(13);
    	other.add(14);
    	other.add(1);
    	other.add(5);
    	other.add(7);
    	other.add(9);
    	other.add(4);
    	other.add(88);
    	other.add(22);
    	other.add(16);
    
    	
    	
        for(Integer x : data) {
            System.out.println(x);
        }
        

        yep.shrink(data);
        
        
        for(Integer x : data) {
            System.out.println(x);
        }
        
        
    }
    
}