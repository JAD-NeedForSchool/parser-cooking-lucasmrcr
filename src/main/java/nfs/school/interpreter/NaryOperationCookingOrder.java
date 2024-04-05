package nfs.school.interpreter;

import lombok.Getter;
import lombok.Setter;
import nfs.school.operation.complex.NaryOperation;

@Getter
public class NaryOperationCookingOrder implements ICookingOrder{

    @Setter private NaryOperation[] operations;

    public NaryOperationCookingOrder(NaryOperation[] operations) {
        this.operations = operations;
    }

    @Override
    public void interpret(CookingRecipeOrder context) {

    }
}
