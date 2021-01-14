package fr.pgah.java.unbrco.model.bibliotheque;

import fr.pgah.java.unbrco.model.livre.Livre;

public class Bibliothecaire {
  private String nom;
  private int age;
  private Bibliotheque bibliotheque;
  private Livre livreFavori;

  public Bibliothecaire(String nom, int age, Bibliotheque bibli, Livre favori) {
  }

  public String getNom() {
    return null;
  }

  public int getAge() {
    return 0;
  }

  public Bibliotheque getBibliotheque() {
    return null;
  }

  public Livre getLivreFavori() {
    return null;
  }

  // PREREQUIS : bibli != null
  // MODIFIE : this
  // EFFETS : changement d'affectation du bibliothécaire comme gérant
  // de la bibliothèque bibli.
  // RENVOIE : vrai si une réaffectation a été effectuée
  public boolean changerDeBibliotheque(Bibliotheque bibli) {
    return false;
  }
}
