package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import entities.Usuario;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Usuario> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<= n;  i++) {
			int codigo1 = sc.nextInt();
			
			set.add(new Usuario(codigo1));
		}
		
		System.out.print("How many students for course B? ");
		int n2 = sc.nextInt();
		
		for(int i = 1; i<= n2;  i++) {
			int codigo2 = sc.nextInt();
			
			set.add(new Usuario(codigo2));
		}
		
		System.out.print("How many students for course C? ");
		int n3 = sc.nextInt();
		
		for(int i = 1; i<= n3;  i++) {
			int codigo3 = sc.nextInt();
			
			set.add(new Usuario(codigo3));
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();

	}

}
