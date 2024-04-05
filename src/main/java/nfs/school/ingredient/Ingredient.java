package nfs.school.ingredient;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Ingredient {

    @Setter private String name;

    public Ingredient(String name) {
        this.name = name;
    }
}
