package ar.edu.unnoba.ipoo.practica4.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector<T> {
	
	private List<T> elements = new ArrayList<T>();
	private Random rnd = new Random();
	
    public void add(T element){
        getElements().add(element);
    }
    
    public T selectNext() throws IndexOutOfBoundsException {
    	if(getElements().size() == 0)
    		throw new IndexOutOfBoundsException();
    		
        int randomInt = rnd.nextInt(getElements().size());
        return getElements().get(randomInt);
    }

    private List<T> getElements() {
        return elements;
    }
    
    public static void main(String[] args){
        RandomSelector<String> rs= new RandomSelector<String>();
        
        rs.add("Fede");
        rs.add("Hola");
        rs.add("Mundo");
        rs.add("Sol");
        
        for (int x=1; x<10; x++) {
			try {
				System.out.println(rs.selectNext());
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
        }
    }

}
