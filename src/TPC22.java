import kr.tpc.Animal;
import kr.tpc.Cat;

public class TPC22 {
    public static void main(String[] args) {
        /* Upcasting */
        //Cat ani = new Cat();
        //Object ani = new Cat();
        Animal ani = new Cat();
        ani.eat();

        /* Downcasting */
        //Cat c = (Cat)ani;
        //c.night();
        ((Cat) ani).night();
    }
}
