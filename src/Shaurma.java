public class Shaurma extends FastFood implements Printable {
    private int price;

    public Shaurma(String taste, int price) {
        super(taste);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public void print(){
        System.out.println(" Вкус " + getTaste() + " цена шаурму " + getPrice());
    }
}
