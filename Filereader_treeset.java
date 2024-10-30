package se320;

import java.util.LinkedHashSet;

public class Filereader_treeset {
	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
	    set1.add("George");
	    set1.add("Jim");
	    set1.add("John");
	    set1.add("Blake");
	    set1.add("Kevin");
	    set1.add("Michael");
	    LinkedHashSet<String> set2 = new LinkedHashSet<>();
	    set2.add("George");
	    set2.add("Katie");
	    set2.add("Kevin");
	    set2.add("Michelle");
	    set2.add("Ryan");
	    LinkedHashSet<String> add = new LinkedHashSet<>(set1);
	    LinkedHashSet<String> subtract = new LinkedHashSet<>(set1);
	    LinkedHashSet<String> retain = new LinkedHashSet<>(set1);
	    add.addAll(set2);
	    System.out.println("Union of sets is " + add);
	    subtract.removeAll(set2);
	    System.out.println("Difference between set 1 and 2: " + subtract);
	    retain.retainAll(set2);
	    System.out.println("Intersection os sets is " + retain);
	    }
	}