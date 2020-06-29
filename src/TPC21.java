import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        /* Upcasting */
        Animal ani = new Dog();
        ani.eat();

        /* Downcasting */
        ani = new Cat();
        ((Cat)ani).night();
    }
}
