package nfs.school.interpreter;

import lombok.Getter;
import lombok.Setter;
import nfs.school.ingredient.Ingredient;

@Getter
public class CookingRecipeOrder {

    @Setter
    private Ingredient ingredient;

    public CookingRecipeOrder(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
