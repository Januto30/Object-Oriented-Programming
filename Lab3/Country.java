public class Country {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {

        if (o instanceof Country) {
            Country c = (Country)o;
            return name == c.name;

        } else  {
            return false;
        }
    }
}
