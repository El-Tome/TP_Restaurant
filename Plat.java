package restaurant;

import java.util.ArrayList;

public class Plat implements java.io.Serializable {
    private String nom;
    private ArrayList<Ingredient> ingredients;
    private float prix;
    private boolean realisable;

    public Plat(String nom, float prix, ArrayList<Ingredient> ingres, Boolean realisable) {
        this.nom = nom;
        this.prix = prix;
        this.ingredients = new ArrayList<Ingredient>(ingres);
        this.realisable = realisable;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public boolean getRealisable() {
        return realisable;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setRealisable(boolean realisable) {
        this.realisable = realisable;
    }

    @Override
    public String toString() {
        return nom + " : " + prix + "€";
    }



}
