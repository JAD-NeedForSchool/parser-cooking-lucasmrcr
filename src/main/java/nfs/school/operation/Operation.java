package nfs.school.operation;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Operation {

    @Setter private String name;

    public Operation(String name) {
        this.name = name;
    }

}
