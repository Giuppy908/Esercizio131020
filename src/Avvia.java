import java.util.Scanner;
import java.util.Random;
public class Avvia {
	
//**************************************************************************************************************
	public static void carVisMat(int m1[][], int m2[][]) {
		System.out.println("Questa e' la prima matrice:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++ ) {
				
				System.out.print(m1[i][j]+ " ");
			}System.out.println();
		}
		

		System.out.println("Questa e' la seconda matrice:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++ ) {
				System.out.print(m2[i][j]+ " ");
			}System.out.println();
		}
	}
//**************************************************************************************************************

	
//**************************************************************************************************************
	public static void calcMinMax(int m1[][], int m2[][], int l1, int l2) {
		int min = 0;
		int max = 0;
		int min2 = 0;
		int max2 = 0;
		int r1 = 0;
		int r2 = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int p = 0;
		boolean controllo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Questa e' la prima matrice:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++ ) {
				
				System.out.print(m1[i][j]+ " ");
			}System.out.println();
		}
		

		System.out.println("Questa e' la seconda matrice:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++ ) {
				System.out.print(m2[i][j]+ " ");
			}System.out.println();
		}
		
		do {
			System.out.print("Dammi la riga della prima matrice: ");
			r1 = sc.nextInt();
			if (r1 >= 0 && r1 <= l1) {
				controllo = true;
			} else {
				controllo = false;
				System.err.println("Hai inserito una dimensione non valida!");
			}
			System.out.print("Dammi la riga dellas seconda matrice: ");
			r2 = sc.nextInt();
			if (r2 >= 0 && r2 <= l2) {
				controllo = true;
			} else {
				controllo = false;
				System.err.println("Hai inserito una dimensione non valida!");
			}
		} while (controllo != true);
		min = m1[r1][p];
		for (int i = 0; i < m1.length; i++) {
				if (min > m1[r1][i]) {
					min = m1[r1][i];
					a = i;
				}
				if (max < m1[r1][i]) {
					max = m1[r1][i];
					b = i;
				}
		}
		System.out.println("Questo e' il numero minimo: "+min+", questa e' la riga: "+r1+", questa e' la colonna: "+a+" della prima matrice");
		System.out.println("Questo e' il numero massimo: "+max+", questa e' la riga: "+r1+", questa e' la colonna: "+b+" della prima matrice");
		min2 = m2[r2][p];
		for (int i = 0; i < m2.length; i++) {
				if (min2 > m2[r2][i]) {
					min2 = m2[r2][i];
					c = i;
				}
				if (max2 < m2[r2][i] ) {
					max2 = m2[r2][i];
					d = i;
			}
		}
		System.out.println("Questo e' il numero minimo: "+min2+", questa e' la riga: "+r2+", questa e' la colonna: "+c+" della seconda mtrice");
		System.out.println("Questo e' il numero massimo: "+max2+", questa e' la riga: "+r2+", questa e' la colonna: "+d+" della seconda matrice");
	}
//**************************************************************************************************************
	public static void mediaRigCol (int m1[][], int m2[][], int l1, int l2) {
		int r1 = 0;
		int r2 = 0;
		float media1 = 0;
		float media2 = 0;
		boolean controllo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Questa e' la prima matrice:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++ ) {
				
				System.out.print(m1[i][j]+ " ");
			}System.out.println();
		}
		

		System.out.println("Questa e' la seconda matrice:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++ ) {
				System.out.print(m2[i][j]+ " ");
			}System.out.println();
		}
		
		do {
			System.out.print("Dammi la riga della prima matrice: ");
			r1 = sc.nextInt();
			if (r1 >= 0 && r1 <= l1) {
				controllo = true;
			} else {
				controllo = false;
				System.err.println("Hai inserito una dimensione non valida!");
			}
			System.out.print("Dammi la riga dellas seconda matrice: ");
			r2 = sc.nextInt();
			if (r2 >= 0 && r2 <= l2) {
				controllo = true;
			} else {
				controllo = false;
				System.err.println("Hai inserito una dimensione non valida!");
			}
		} while (controllo != true);
		
		for (int i = 0; i < l1; i++) {
			media1 += m1[r1][i];
		}
		media1 /= l1;
		for (int i = 0; i < l1; i++) {
			media2 += m2[r2][i];
		}
		media2 /= l2;
		System.out.println("Questa e' la media della prima matrice: "+media1);
		System.out.println("questa e' la media della seconda matrice: "+media2);
		
	}
	
//*************************************************************************************************************	
	public static void occDiag(int m1[][], int m2[][], int l1, int l2) {
		boolean numeriUguali = false;
		System.out.println("Questa e' la prima matrice:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++ ) {
				System.out.print(m1[i][j]+ " ");
			}System.out.println();
		}
		
		System.out.println("Questa e' la seconda matrice:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++ ) {
				System.out.print(m2[i][j]+ " ");
			}System.out.println();
		}
		if (l1 >= l2) {
			for (int i =0, j = 0; i < l1; i++, j++) {
				for (int y = 0, k = 0; y < l2; y++, k++) {
					if(m1[i][j] == m2[y][k]){
						numeriUguali = true;
						System.out.println("Due numeri uguali sono stati trovati nella prima diagoonale alle coordinate ("+i+","+j+") della prima matrice e a coordinate ("+y+","+k+") della seconda matrice: "+m1[i][j]);
					}
				}
			}
			if (numeriUguali == false) {
				System.out.println("Non sono stati trovati numeri uguali nella prima diagonale delle due matrici");
			}
			numeriUguali = false;
			for (int i =l1 - 1, j = l1 - 1; i >= 0; i--, j--) {
				for (int y = l2 - 1, k = l2 - 1; y >= 0; y--, k--) {
					if(m1[i][j] == m2[y][k]){
						numeriUguali = true;
						System.out.println("Due numeri uguali sono stati trovati della seconda diagonale alle coordinate ("+i+","+j+") della prima matrice e a coordinate ("+y+","+k+") della seconda matrice: "+m1[i][j]);
					}
				}
			}
			if (numeriUguali == false) {
				System.out.println("Non sono stati trovati numeri uguali nella seconda diagonale delle due matrici");
			}
		} else if (l2>l1){
			for (int i =0, j = 0; i < l2; i++, j++) {
				for (int y = 0, k = 0; y < l1; y++, k++) {
					if(m2[i][j] == m1[y][k]){
						numeriUguali = true;
						System.out.println("Due numeri uguali sono stati trovati nella prima diagoonale alle coordinate ("+i+","+j+") della prima matrice e a coordinate ("+y+","+k+") della seconda matrice: "+m1[i][j]);
					}
				}
			}
			if (numeriUguali == false) {
				System.out.println("Non sono stati trovati numeri uguali nella prima diagonale delle due matrici");
			}
			numeriUguali = false;
			for (int i =l2 - 1, j = l2 - 1; i >= 0; i--, j--) {
				for (int y = l1 - 1, k = l1 - 1; y >= 0; y--, k--) {
					if(m2[i][j] == m1[y][k]){
						numeriUguali = true;
						System.out.println("Due numeri uguali sono stati trovati della seconda diagonale alle coordinate ("+i+","+j+") della prima matrice e a coordinate ("+y+","+k+") della seconda matrice: "+m1[i][j]);
					}
				}
			}
			if (numeriUguali == false) {
				System.out.println("Non sono stati trovati numeri uguali nella seconda diagonale delle due matrici");
			}
		}
	}
//*************************************************************************************************************
	public static void parDispDiag(int m1[][], int m2 [][], int l1, int l2) {
		System.out.println("Questa e' la prima matrice:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++ ) {
				System.out.print(m1[i][j]+ " ");
			}System.out.println();
		}
		
		System.out.println("Questa e' la seconda matrice:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++ ) {
				System.out.print(m2[i][j]+ " ");
			}System.out.println();
		}
		
		for (int i =0, j = 0; i < l1; i++, j++) {
			if(m1[i][j]%2 == 0) {
				System.out.println("Nella prima matrice in posizione ("+i+","+j+") si trova un numero pari: "+m1[i][j]);
			}
		}
		for (int i =0, j = 0; i < l2; i++, j++) {
			if(m2[i][j]%2 != 0) {
				System.out.println("Nella seconda matrice in posizione ("+i+","+j+") si trova un numero dispari: "+m2[i][j]);
			}
		}
	}
	
//*************************************************************************************************************
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int [][] m1;
		int [][] m2;
		int l1 = 0;
		int l2 = 0;
		boolean controllo = true;
		int esercizio = 0;
		int min = 1;
		int max = 50;
		System.out.println("Adesso dovrai darmi le dimensioni di due matrici quadrate, il minimo e' un 4x4 e il massimo e' un 8x8 ");
		do {
			System.out.print("Dammi la dimensione della prima matrice: ");
			l1 = sc.nextInt();
			if ( l1 >= 4 && l1 <= 8) {
				controllo = true;
			} else {
				controllo = false;
				System.err.println("Hai inserito una dimensione non valida!");
			}
			System.out.print("Dammi la dimensione della seconda matrice: ");
			l2 = sc.nextInt();
			if ( l2 >= 4 && l2 <= 8) {
				controllo = true;
			} else {
				controllo = false;
				System.err.println("Hai inserito una dimensione non valida!");
			}
		} while (controllo != true);
		m1 = new int [l1][l1];
		m2 = new int [l2][l2];
		for (int i = 0; i < m1.length ; i++) {
			for (int j = 0; j < m1[i].length; j++ ) {
				m1[i][j] = random.nextInt((max - min) + 1) + min;
			}
		}
		
		for (int i = 0; i < m2.length ; i++) {
			for (int j = 0; j < m2[i].length; j++ ) {
				m2[i][j] = random.nextInt((max - min) + 1) + min;
			}
		}
		System.out.println("Scegli cosa deve fare: ");
		esercizio = sc.nextInt();
		switch (esercizio) {
		case 1: 
			carVisMat(m1,m2);
		break;
		
		case 2: 
			calcMinMax(m1,m2,l1,l2);
		break;
		
		case 3:	
			mediaRigCol(m1,m2,l1,l2);
		break;
		
		case 4:
			occDiag(m1,m2,l1,l2);
		break;
		
		case 5: 
			parDispDiag(m1,m2,l1,l2);
		break;
		}
	}

}
