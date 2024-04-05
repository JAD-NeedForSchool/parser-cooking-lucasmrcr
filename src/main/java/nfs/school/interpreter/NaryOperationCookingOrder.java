package nfs.school.interpreter;

import lombok.Getter;
import lombok.Setter;
import nfs.school.operation.complex.NaryOperation;

@Getter
public class NaryOperationCookingOrder implements ICookingOrder{

    private final NaryOperation[] operations;
    private final ICookingOrder[] cookingOrders;

    public NaryOperationCookingOrder(NaryOperation[] operations, ICookingOrder[] cookingOrders) {
        this.operations = operations;
        this.cookingOrders = cookingOrders;
    }

    @Override
    public void interpret(CookingRecipeOrder context) {

    }
}
