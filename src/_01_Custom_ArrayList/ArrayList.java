package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] gen;
	
	
	public ArrayList() {
		gen = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return gen[loc];
	}
	
	public void add(T val) {
		T[] gen1 = (T[]) new Object[gen.length+1];
		
		gen1[gen1.length-1] = val;
		
		for (int i = 0; i < gen.length; i++) {
			gen1[i] = gen[i];
		}
		gen = gen1;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[]  gen2 = (T[]) new Object[gen.length+1];
		
		for(int i = 0; i<gen2.length; i++) {
			if(i<loc) {
				gen2[i] = gen[i];
			}
			else if(i>loc) {
				gen2[i] = gen[i-1];
			}
			else {
				gen2[i] = val;
			}
		}
		gen = gen2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
		
		gen[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] gen3 = (T[]) new Object[gen.length-1];
		
		for(int i = 0; i<gen.length; i++) {
			if(i<loc) {
				gen3[i] = gen[i];
				
			}
			else if(i>loc) {
				gen3[i-1] = gen[i];
			}
			else {
				continue;
			}
			
		}
		gen = gen3;
	}
	
	public boolean contains(T val) {
		
		for (int i = 0; i < gen.length; i++) {
			if(gen[i].equals(val)) {
				return true;
			}
			
		}
		return false;
		
	}

	public int size() {
	System.out.println(gen.length);
		return gen.length;
	}


}