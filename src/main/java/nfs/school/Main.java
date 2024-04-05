package nfs.school;

import nfs.school.ingredient.basic.BasicIngredient;
import nfs.school.interpreter.ICookingOrder;
import nfs.school.interpreter.IngredientCookingOrder;
import nfs.school.interpreter.SimpleOperationCookingOrder;
import nfs.school.operation.simple.SimpleOperation;

public class Main {

    public static void main(String[] args) {
        ICookingOrder TakeYellow = new SimpleOperationCookingOrder(new SimpleOperation("Prendre jaune"), new IngredientCookingOrder(new BasicIngredient("Oeuf")));
    }

}
