package ar.edu.unnoba.ipoo.practica4.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class DataBag<E> {

	private int size;
	
	private List<E> list;
	
	public DataBag(int size) {
		list = new ArrayList<E>(size);
	}

	public void add(E e) throws FullDataBagException {
		if(list.size() < size) 
			if(list.add(e));
		else 
			throw new FullDataBagException();
	}
	
	public void remove(E e) throws EmptyDataBagException {
		if(list.size() != 0) 
			list.remove(e);
		else 
			throw new EmptyDataBagException();
	}
	
	public boolean contains(E e) {
		return list.contains(e);
	}
	
	public int size() {
		return list.size();
	}
	
	public void anotherRemove(E e) throws EmptyDataBagException {
		remove(e);
	}
	
	public static void main(String[] args) {
		DataBag<Integer> databag = new DataBag<Integer>(10);
		
		try {
			databag.add(1);
		} catch (FullDataBagException e) {
			e.printStackTrace();
		}
		
		
		try {
			databag.remove(1);
		} catch (EmptyDataBagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
