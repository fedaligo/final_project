class Super {
    Super() {
        System.out.println("Super");
    }
}
public class Main extends Super {
    Main(){
        this(1);
        System.out.println("()");
    }
    Main(int i) {
        System.out.println("(int)");
    }

    public static void main(String[] args) {

        new Main();
        //System.out.println("111");
    }
}
