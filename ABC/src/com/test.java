package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list =new ArrayList();
ListIterator a = list.listIterator();
if(a.previousIndex()!= -1)
	while(a.hasNext())
		System.out.println(a.next() + " ");
else
	System.out.println("EMPTY");
	}

}
