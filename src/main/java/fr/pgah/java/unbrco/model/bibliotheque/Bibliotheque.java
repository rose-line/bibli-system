package fr.pgah.java.unbrco.model.bibliotheque;

import java.util.List;
import fr.pgah.java.unbrco.model.livre.Livre;

public class Bibliotheque {

  private Bibliothecaire gerant;
  private String nom;
  private List<Bibliotheque> branches;
  private List<Livre> livresReference;
  private List<Livre> livresRomans;
  private List<Livre> livresBiographie;
  private List<Livre> livresManuels;
  private List<Livre> livreCuisine;

  public Bibliotheque(String nom, Bibliothecaire gerant) {
  }

  public String getNom() {
    return null;
  }

  public Bibliothecaire getGerant() {
    return null;
  }

  // PREREQUIS : livre != null
  // MODIFIE : this
  // EFFETS : stocke livre dans la collection appropriée de cet objet
  public void enregistrerLivre(Livre livre) {
  }

  // PREREQUIS : livre != null
  // RENVOIE : vrai si livre est dans le catalogue de cette bibliothèque
  // (qu'il soit actuellement emprunté ou non)
  public boolean estDansCatalogue(Livre livre) {
    return false;
  }

  // PREREQUIS: livre != null
  // RENVOIE : vrai si livre est disponible à l'emprunt
  public boolean peutEtreEmprunte(Livre livre) {
    return true;
  }

  // PREREQUIS : livre != null
  // RENVOIE : vrai si livre est dans le catalogue de cette bibliotheque
  // ou dans celui de l'un de ses branches
  public boolean estDansCatalogueEtendu(Livre livre) {
    return false;
  }

  // PREREQUIS : livre != null
  // MODIFIE : this
  // EFFETS : enregistre le fait que livre est maintenant emprunté (si possible)
  // RENVOIE : vrai si l'opération est un succès
  public boolean enregistrerSortie(Livre livre) {
    return false;
  }

  // PREREQUIS : livre != null
  // MODIFIE : this
  // EFFETS : enregistre le fait que livre est revenu (si possible)
  // RENVOIE : vrai si l'opération est un succès
  public boolean enregistrerRetour(Livre livre) {
    return false;
  }

  // PREREQUIS : gerant != null
  // MODIFIE : this
  // EFFETS : set le nouveau gérant
  // RENVOIE : vrai si l'opération est un succès
  public boolean engagerGerant(Bibliothecaire bibliothecaire) {
    return false;
  }


  // EFFETS : affiche le catalogue de cette bibliothèque
  // (toutes les informations de chaque livre)
  public void afficherCatalogue() {
  }
}
