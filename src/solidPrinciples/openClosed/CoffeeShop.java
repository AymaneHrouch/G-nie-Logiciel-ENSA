package solidPrinciples.openClosed;

public class CoffeeShop {
    String name;
    Adress adress;

    public CoffeeShop() {}

    public CoffeeShop(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
