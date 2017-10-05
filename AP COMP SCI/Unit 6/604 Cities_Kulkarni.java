/**
 *Arya Kulkarni
 *Cities
 */
 
 // names several cities
 // each city records its name, state, and population
 // mergesort to put cities in order by name
import java.util.*;
 
class Cities {

	private String name;
	private String state;
	private int population;
	
	Cities (String n, String s, int p) {
		name = n;
		state = s;
		population = p;
	}
	
	public String getName () {
		return name;
	}
	
	public String getState () {
		return state;
	}
	
	public double getPopulation () {
		return population;
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public void setState (String s) {
		state = s;
	}
	
	public void setPopulation (int p) {
		population = p;
	}
	
	public String toString () {
		return name + ", " + state + ", " + population;
	}
	
}

class Tester {
	
	public static void main (String[] args){
		
		ArrayList<Cities> cities1 = new ArrayList<Cities>();
		ArrayList<Cities> cities2 = new ArrayList<Cities>();
		
		cities2.add(new Cities("New York City", "New York", 158896481));
		cities1.add(new Cities("Springfield", "Illinois", 1231654891));
		cities2.add(new Cities("Springfield", "Missouri", 164122));
		cities1.add(new Cities("Los Angeles", "California", 3884000));
		
		ArrayList<Cities> cities = sort(cities1, cities2);
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i).getName() + ", " + cities.get(i).getState()  + ", " +  cities.get(i).getPopulation());
		}
		
	}
	
	public static ArrayList<Cities> sort (ArrayList<Cities> a, ArrayList<Cities> b){
		ArrayList<Cities> sorted = new ArrayList<Cities>();
		int size = a.size() + b.size();
		
		for (int i = 0; i < size; i++) {
			Cities tmp = null;
			Cities temp = null;
			
			if (a.size() > 0) {
				tmp = a.get(0);
			}
			
			if (b.size() > 0) {
				temp = b.get(0);
			}
			
			if (tmp != null && temp != null) {
				if (tmp.getName().compareTo(temp.getName()) < 0) {
					sorted.add(tmp);
					a.remove(0);
				} else if (tmp.getName().compareTo(temp.getName()) > 0) {
					sorted.add(temp);
					b.remove(0);
				} else if (tmp.getName().compareTo(temp.getName()) == 0) {
					if (tmp.getState().compareTo(temp.getState()) < 0) {
						sorted.add(tmp);
						a.remove(0);
					} else {
						sorted.add(temp);
						b.remove(0);
					}
				}
			} else {
				if (tmp == null) {
					if (b.size() > 1) {
						tmp = b.get(0);
						temp = b.get(1);
						
						if (tmp.getName().compareTo(temp.getName()) < 0) {
							sorted.add(tmp);
							b.remove(0);
						} else if (tmp.getName().compareTo(temp.getName()) > 0) {
							sorted.add(temp);
							b.remove(1);
						} else if (tmp.getName().compareTo(temp.getName()) == 0) {
							if (tmp.getState().compareTo(temp.getState()) < 0) {
								sorted.add(tmp);
								b.remove(0);
							} else {
								sorted.add(temp);
								b.remove(1);
							}
						}
						
					} else {
						sorted.add(b.get(0));
						b.remove(0);
					}
				} else if (temp == null) {
					if (a.size() > 1) {
						tmp = a.get(0);
						temp = a.get(1);
							
						if (tmp.getName().compareTo(temp.getName()) < 0) {
							sorted.add(tmp);
							a.remove(0);
						} else if (tmp.getName().compareTo(temp.getName()) > 0) {
							sorted.add(temp);
							a.remove(1);
						} else if (tmp.getName().compareTo(temp.getName()) == 0) {
							if (tmp.getState().compareTo(temp.getState()) < 0) {
								sorted.add(tmp);
								a.remove(0);
							}
						} else {
							sorted.add(temp);
							a.remove(1);
						}
					} else {
						sorted.add(a.get(0));
						a.remove(0);
					}
				}
			}
			
		}
		
		return sorted;	
	}
	
}