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
	
}
