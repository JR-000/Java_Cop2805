package cop2805;

import java.util.*;

public class homeWork2 {
	public static void main(String[] args) {
		Character[] intials = {'J', 'T', 'R'};
		List<Character> i = Arrays.asList(intials);
		System.out.println("IntialList");
		Output(i);
		
		Collections.reverse(i);
		System.out.println("Reverse list");
		Output(i);
		
		Character[] newIntials = new Character[3];
		List<Character> listCopy = Arrays.asList(newIntials);
		
		Collections.copy(listCopy, i);
		System.out.println("Copied List");
		Output(listCopy);
		
		Collections.fill(i,'R');
		System.out.println("R Filled list");
		Output(i);
		
	}
	private static void Output(List<Character> l) {
		for(Character thing : l)
			System.out.printf("%s",  thing);
		
		System.out.println();
	}
}

