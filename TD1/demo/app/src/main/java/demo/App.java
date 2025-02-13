/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Define the Document interface
interface Document {
    String titre();
    int taille();
}

// Define the Chapitre class that implements Document
class Chapitre implements Document {
    private String titre;
    private List<String> pages;

    public Chapitre(String titre, List<String> pages) {
        this.titre = titre;
        this.pages = pages;
    }

    @Override
    public String titre() {
        return this.titre;
    }

    @Override
    public int taille() {
        return pages.size(); // Assuming taille is the number of pages
    }
}

// Define the Mémoire class that implements Document
class Mémoire implements Document {
    private String titre;
    private List<Chapitre> chapitres;

    public Mémoire(String titre, List<Chapitre> chapitres) {
        this.titre = titre;
        this.chapitres = chapitres;
    }

    @Override
    public String titre() {
        return this.titre;
    }

    @Override
    public int taille() {
        int t = 0;
        for (Chapitre chapitre : chapitres) {
            t += chapitre.taille();
        }
        return t;
    }
}

// Main application class
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Create some chapters
        Chapitre chapitre1 = new Chapitre("Chapitre 1", Arrays.asList("Page 1", "Page 2"));
        Chapitre chapitre2 = new Chapitre("Chapitre 2", Arrays.asList("Page 1", "Page 2", "Page 3"));

        // Create a memory instance with chapters
        Mémoire memoire = new Mémoire("Ma Mémoire", Arrays.asList(chapitre1, chapitre2));

        // Output greetings and memory details
        System.out.println(new App().getGreeting());
        System.out.println("Titre: " + memoire.titre());
        System.out.println("Taille: " + memoire.taille() + " pages");
    }
}
