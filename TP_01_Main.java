
/* Carmen Sofia Lopez
 * TP01*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Exercice 4.1 - Affichage de messages en console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bonjour,\n" + "quel est votre prénom ?");
		String prenom = scanner.nextLine();
		System.out.println("Bonjour " + prenom);
		volume();
		// division();
		// somme();

		// Exercice 4-Interaction avec l’utilisateur
		// int unEntier = scanner.nextInt();
		// float unReel = scanner.nextFloat();
		// System.out.println("J’ai recupere un entier: " + unEntier);
		// System.out.println("J’ai aussi recupere un reel: " + unReel);
		scanner.close();
	}

	// Exercice 5.1 Somme de deux entiers
	public static void somme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier");
		int premierEntier = scanner.nextInt();
		System.out.println("Veuillez saisir le deuxieme entier");
		int deuxiemeEntier = scanner.nextInt();
		int somme = premierEntier + deuxiemeEntier;
		System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + "est egal a" + somme);

	}

	// Exercice 5.2 Division entre deux entiers
	public static void division() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier");
		int premierEntier = scanner.nextInt();
		System.out.println("Veuillez saisir le deuxieme entier");
		int deuxiemeEntier = scanner.nextInt();
		int division = premierEntier / deuxiemeEntier;
		System.out.println("La division de " + premierEntier + " entre " + deuxiemeEntier + " est egal a " + division);

	}

	// Exercice 5.3 Calcul du volume d’un pavé droit
	public static void volume() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir la longeur du pavé");
		int longeur = scanner.nextInt();
		System.out.println("Veuillez saisir la largeur du pavé");
		int largeur = scanner.nextInt();
		System.out.println("Veuillez saisir la hauteur du pavé");
		int hauteur = scanner.nextInt();
		int résultat = longeur * largeur * hauteur;
		System.out.println("Le volume du pavé droit est egal a " + résultat);

	}

}
