package Bui;

public abstract class MealBuilder {
    public Meal meal;

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
		return meal;
    }

}
