import java.util.HashMap;

public class FoodRating {
    private String[] foods;
    private String[] cuisines;
    private int[] ratings;

    public FoodRating(String[] foods, String[] cuisines, int[] ratings) {
        this.foods = foods;
        this.cuisines = cuisines;
        this.ratings = ratings;
    }

    public void changeRating(String food, int newRating) {
        HashMap<Food> map = buildRelationMap();
        map[food] = newRating
    }


}
