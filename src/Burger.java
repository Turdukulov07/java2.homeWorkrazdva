public class Burger extends FastFood implements Printable{
private String type;

    public Burger(String taste, String type) {
        super(taste);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    @Override
    public void print(){
        System.out.println(" Вкус " + getTaste() + " виды бургера " + getType());
    }
}
