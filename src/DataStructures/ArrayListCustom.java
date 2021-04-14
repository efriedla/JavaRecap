package DataStructures;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListCustom<E> extends ArrayList<E> {
	public boolean allowDups;
	public ArrayListCustom(boolean allowDups){
		this.allowDups = allowDups;
	}

    HashSet<Object> mySet = new HashSet<>();
	public boolean add(E e){
		if(this.allowDups == false && mySet.add(e) == false){
			throw new IllegalArgumentException("that already exists");
		}else if(this.allowDups == true && mySet.add(e) == false){
			super.add(e);
		}
		return allowDups;
	}
}
