package demo.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item {
    private double price;
    private double sepalLength;
    private FlowerColor color;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return "this is a flower";
    }

}

// import lombok.AllArgsConstructor;

// import lombok.Getter;
// import lombok.Setter;

// @Getter @Setter @AllArgsConstructor
// public class Flower extends Item{

//     private double price;
//     private double sepalLength;
//     private FlowerColor color;

//     public String getColor() {
//         return color.toString();
//     }

//     public double getPrice() {
//         return price;
//     }

// }