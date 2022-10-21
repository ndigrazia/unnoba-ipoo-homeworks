package practica3.ejer6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector<T> {
	
	private List<T> elements = new ArrayList<T>();
	private Random rnd = new Random();
	
    public void add(T element){
    	elements.add(element);
    }
    
    public T selectNext(){
        int randomInt = rnd.nextInt(elements.size());
        return elements.get(randomInt);
    }

    public static void main(String[] args){
        RandomSelector<String> rs= new RandomSelector<String>();
        
        rs.add("Fede");
        rs.add("Hola");
        rs.add("Mundo");
        rs.add("Sol");
        
        for (int x=1; x<10; x++)
            System.out.println(rs.selectNext());
    }

}
