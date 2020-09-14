public class Doner  extends FastFood implements Printable{
    private String kebab;

    public Doner(String taste, String kebab) {
        super(taste);
        this.kebab = kebab;
    }

    public String getKebab() {
        return kebab;
    }

    @Override
    public void print(){
        System.out.println(" Вкус" + getTaste() + " кебаб " + getKebab());
    }
}
