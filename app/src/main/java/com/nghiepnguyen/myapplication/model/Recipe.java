package com.nghiepnguyen.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recipe {
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("f2f_url")
    private String f2f_url;
    @SerializedName("ingredients")
    private List<String> ingredients;
    @SerializedName("source_url")
    private String source_url;
    @SerializedName("recipe_id")
    private String recipe_id;
    @SerializedName("image_url")
    private String image_url;
    @SerializedName("title")
    private String title;

    public Recipe(String publisher, String f2f_url, List<String> ingredients, String source_url, String recipe_id, String image_url, String title) {
        this.publisher = publisher;
        this.f2f_url = f2f_url;
        this.ingredients = ingredients;
        this.source_url = source_url;
        this.recipe_id = recipe_id;
        this.image_url = image_url;
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getF2f_url() {
        return f2f_url;
    }

    public void setF2f_url(String f2f_url) {
        this.f2f_url = f2f_url;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getIngredientsByString() {
        return ingredients.toString();
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(String recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
