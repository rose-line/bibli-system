package fr.pgah.java.unbrco.model.livre;

import fr.pgah.java.unbrco.model.bibliotheque.Bibliotheque;

public class Livre {

  private String titre;
  private String auteur;
  private GenreLivre genre;
  private int annee;
  private int edition;
  private Bibliotheque bibliothequeMere;
  private boolean estPrete;

  public Livre(String titre, String auteur, GenreLivre genre, int annee, int ed) {
  }

  public String getTitre() {
    return null;
  }

  public String getAuteur() {
    return null;
  }

  public GenreLivre getGenre() {
    return null;
  }

  public int getAnnee() {
    return 0;
  }

  public int getEdition() {
    return 0;
  }

  public Bibliotheque getBibliothequeMere() {
    return null;
  }

  public void setBibliothequeMere(Bibliotheque home) {
  }

  // MODIFIE : this
  // EFFETS : enregistre le fait que le livre est revenu
  public void enregistrerRetour() {
    this.estPrete = false;
  }

  // RENVOIE : vrai si le livre est sorti
  public boolean estSorti() {
    return false;
  }

  // MODIFIE : this
  // EFFETS : enregistre le fait que le livre est sorti
  public void enregistrerSortie() {
  }
}
