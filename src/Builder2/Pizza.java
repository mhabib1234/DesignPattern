package Builder2;

public class Pizza {
    private String dough = "";
    private String Sauce = "";

    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        Sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", Sauce='" + Sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}