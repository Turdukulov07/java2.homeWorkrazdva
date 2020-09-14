public class Main {

    public static void main(String[] args) {
       creatObject("Shaurma").print();
       creatObject("Doner").print();
       creatObject("Burger").print();
    }
    public static FastFood creatObject(String className){
        FastFood fastFood = null;
        switch (className){
            case "Shaurma": fastFood = new Shaurma("- чесночный- ",  -120);
            break;
            case "Doner" : fastFood = new Doner("- шашлычный - ", "- Тантуни ");
            break;
            case "Burger" : fastFood = new Burger("- острый - ", " - двойной, хан бургер, нан бургер, чизбургер");
        }
     return fastFood;
    }
}
