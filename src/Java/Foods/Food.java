package Java.Foods;

public abstract class Food {
    private String name;
    private Money price;
    private int calories;

    public Food(String name, Money price, int calories){
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public void discount(float percent){
        this.price = this.price.multiply(percent);
    }

    @Override
    public String toString(){
        return String.format("%s\n%s\n%d calories", name, price, calories);
    }
}
