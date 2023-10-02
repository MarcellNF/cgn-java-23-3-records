package de.neuefische;

/*
Alle Eigenschaften sind immer "private" und "final",
also unveränderbar.
 */
public record Car(
        String id,
        String brand,
        String color
) {
    public Car withId(String id){
        return new Car(
                id,
                this.brand,
                this.color
        );
    }

    public Car withBrand(String brand){
        return new Car(
                this.id,
                brand,
                this.color
        );
    }

    public Car withColor(String color){
        return new Car(
                this.id,
                this.brand,
                color
        );
    }
}
