package choinka;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList; 
import java.util.InputMismatchException;

class Choinka{
	public int wczytajWysokoœæChoinki() {
		int wysokoœæ = 0;
		Scanner scanner = new Scanner(System.in);
		boolean IsNotCorrect = true;
		do {
			try {
		    	System.out.println("Program narysuje choinkê. \nPodaj jej wysokoœæ jako liczbê ca³kowit¹ od 1 do 400 :\n");
				wysokoœæ = scanner.nextInt();
		        if ((wysokoœæ > 0) && (wysokoœæ < 401))
		        	IsNotCorrect = false;
		        else System.err.println("Wysokoœæ choinki mo¿e byæ liczb¹ z zakresu od 1 do 400.\n");
		    }
		    catch (InputMismatchException exception) {
		        System.err.println("Proszê wprowadz liczby ca³kowite.\n");
		        scanner.nextLine();
		    }
		} while (IsNotCorrect);
		scanner.close(); 
		return wysokoœæ;
	}
	
	public Deque przygotujB¹bki(int wysokoœæ) {
		int liczbybombki = 1;
		Deque bombki = new LinkedList<>();
		for (int i = 1;  i < (wysokoœæ * 2); i++) {
			if (liczbybombki == 10)
				liczbybombki = 0;
			bombki.add(liczbybombki++);
			}
		return bombki;
	}

	public void rysujChoinkê(int wysokoœæ, Deque bombki) {
		int poziom = 1;
		int wiersz = 1;
		int ig³y[] = new int[]{ 1, 1, 3, 5 };
		int iloœæpoziomów = (wysokoœæ - 1) / 4 + 1;
		int czubekChoinki = iloœæpoziomów - poziom + 3;
		
		for (int i = 0; i < czubekChoinki; i++) 
			System.out.print(" ");
		System.out.println(bombki.pollFirst());
				
		wiersz = 2;

		while (bombki.size()>0) {

			for (int x = 1; (x < (czubekChoinki - (wiersz - 1 ) / 4)); x++) 
				System.out.print(" ");
			System.out.print(bombki.pollFirst());
			
			int resztamodulo = ig³y[(wiersz - 1) % 4];
			ig³y[(wiersz - 1) % 4] += 2;
			for (int x = 0; x < resztamodulo; x++)
					System.out.print("*");
			
			System.out.println(bombki.pollLast());
			czubekChoinki = 3 + iloœæpoziomów - wiersz % 4;
			wiersz++;
		}
		return;
	}
}

public class pierwszy_program {
	public static void main (String[] args) {
		
		Choinka tree = new Choinka();
		int wysokoœæ = tree.wczytajWysokoœæChoinki();
		tree.rysujChoinkê(wysokoœæ, tree.przygotujB¹bki(wysokoœæ));
	}
}