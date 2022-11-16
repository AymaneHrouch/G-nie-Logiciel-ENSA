package solidPrinciples.openClosed;

public class Adress {
    String city;
    int zipCode;

    public Adress(String city, int zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "City=" + city + " zipCode=" + zipCode;
    }
}
