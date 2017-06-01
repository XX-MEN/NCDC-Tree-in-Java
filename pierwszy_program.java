package choinka;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList; 
import java.util.InputMismatchException;

class Choinka{
	public int wczytajWysoko��Choinki() {
		int wysoko�� = 0;
		Scanner scanner = new Scanner(System.in);
		boolean IsNotCorrect = true;
		do {
			try {
		    	System.out.println("Program narysuje choink�. \nPodaj jej wysoko�� jako liczb� ca�kowit� od 1 do 400 :\n");
				wysoko�� = scanner.nextInt();
		        if ((wysoko�� > 0) && (wysoko�� < 401))
		        	IsNotCorrect = false;
		        else System.err.println("Wysoko�� choinki mo�e by� liczb� z zakresu od 1 do 400.\n");
		    }
		    catch (InputMismatchException exception) {
		        System.err.println("Prosz� wprowadz liczby ca�kowite.\n");
		        scanner.nextLine();
		    }
		} while (IsNotCorrect);
		scanner.close(); 
		return wysoko��;
	}
	
	public Deque przygotujB�bki(int wysoko��) {
		int liczbybombki = 1;
		Deque bombki = new LinkedList<>();
		for (int i = 1;  i < (wysoko�� * 2); i++) {
			if (liczbybombki == 10)
				liczbybombki = 0;
			bombki.add(liczbybombki++);
			}
		return bombki;
	}

	public void rysujChoink�(int wysoko��, Deque bombki) {
		int poziom = 1;
		int wiersz = 1;
		int ig�y[] = new int[]{ 1, 1, 3, 5 };
		int ilo��poziom�w = (wysoko�� - 1) / 4 + 1;
		int czubekChoinki = ilo��poziom�w - poziom + 3;
		
		for (int i = 0; i < czubekChoinki; i++) 
			System.out.print(" ");
		System.out.println(bombki.pollFirst());
				
		wiersz = 2;

		while (bombki.size()>0) {

			for (int x = 1; (x < (czubekChoinki - (wiersz - 1 ) / 4)); x++) 
				System.out.print(" ");
			System.out.print(bombki.pollFirst());
			
			int resztamodulo = ig�y[(wiersz - 1) % 4];
			ig�y[(wiersz - 1) % 4] += 2;
			for (int x = 0; x < resztamodulo; x++)
					System.out.print("*");
			
			System.out.println(bombki.pollLast());
			czubekChoinki = 3 + ilo��poziom�w - wiersz % 4;
			wiersz++;
		}
		return;
	}
}

public class pierwszy_program {
	public static void main (String[] args) {
		
		Choinka tree = new Choinka();
		int wysoko�� = tree.wczytajWysoko��Choinki();
		tree.rysujChoink�(wysoko��, tree.przygotujB�bki(wysoko��));
	}
}