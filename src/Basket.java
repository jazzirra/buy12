public class Basket {
    public Tovar[]tovarsOfBuy;

    public Basket(Tovar[] tovarsOfBuy) {
        this.tovarsOfBuy = tovarsOfBuy;
    }

    public Tovar[] getTovarsOfBuy() {
        return tovarsOfBuy;
    }

    public void setTovarsOfBuy(Tovar[] tovarsOfBuy) {
        this.tovarsOfBuy = tovarsOfBuy;
    }
}
