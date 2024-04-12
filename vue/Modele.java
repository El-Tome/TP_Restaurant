package restaurant.vue;

import java.util.ArrayList;

import restaurant.Ingredient;
import restaurant.Plat;
import restaurant.Table;

public class Modele implements java.io.Serializable {
    private ArrayList<Plat> plats;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Table> tables;


    public Modele() {
        this.plats = new ArrayList<Plat>();
        this.ingredients = new ArrayList<Ingredient>();
        this.tables = new ArrayList<Table>();
    }

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public Plat getPlat(String nom) {
        for (Plat plat : plats) {
            if (plat.getNom().equals(nom)) {
                return plat;
            }
        }
        return null;
    }

    public Ingredient getIngredient(String nom) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getNom().equals(nom)) {
                return ingredient;
            }
        }
        return null;
    }

    public Table getTable(int numero) {
        for (Table table : tables) {
            if (table.getNumero() == numero) {
                return table;
            }
        }
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public void addPlat(Plat plat) {
        plats.add(plat);
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    // -----------------------------------------------------------------------------------------------------------------

    public void removePlat(Plat plat) {
        plats.remove(plat);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public void removeTable(Table table) {
        tables.remove(table);
    }
}
