package nfs.school.interpreter;

import lombok.Getter;
import nfs.school.operation.simple.SimpleOperation;

@Getter
public class SimpleOperationCookingOrder implements ICookingOrder{

    private final SimpleOperation operation;
    private final ICookingOrder cookingOrder;

    public SimpleOperationCookingOrder(SimpleOperation operation, ICookingOrder cookingOrder) {
        this.operation = operation;
        this.cookingOrder = cookingOrder;
    }

    @Override
    public void interpret(CookingRecipeOrder context) {

    }
}
