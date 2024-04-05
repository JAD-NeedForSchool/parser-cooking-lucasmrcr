package nfs.school.interpreter;

import lombok.Getter;
import lombok.Setter;
import nfs.school.ingredient.Ingredient;

@Getter
public class IngredientCookingOrder implements ICookingOrder{

    @Setter
    private Ingredient ingredient;

    public IngredientCookingOrder(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public void interpret(CookingRecipeOrder context) {

    }
}
