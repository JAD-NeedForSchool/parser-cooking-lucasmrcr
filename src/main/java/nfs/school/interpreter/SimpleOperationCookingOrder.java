package nfs.school.interpreter;

import lombok.Getter;
import lombok.Setter;
import nfs.school.operation.simple.SimpleOperation;

@Getter
public class SimpleOperationCookingOrder implements ICookingOrder{

    @Setter private SimpleOperation operation;

    public SimpleOperationCookingOrder(SimpleOperation operation) {
        this.operation = operation;
    }

    @Override
    public void interpret(CookingRecipeOrder context) {

    }
}
