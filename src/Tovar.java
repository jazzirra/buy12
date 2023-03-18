public class Tovar {
    private String name ;
    
    private int sena;
    
    private String reyting;

    private String category;

    public Tovar(String name, int sena, String reyting, String category) {
        this.name = name;
        this.sena = sena;
        this.reyting = reyting;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    public String getReyting() {
        return reyting;
    }

    public void setReyting(String reyting) {
        this.reyting = reyting;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Tovar() {
    }

    @Override
    public String toString() {
        return
                name  +
                " , PRICE:" + sena +
                " , Reyting:" + reyting +
                " , Category: " + category ;
    }
}
