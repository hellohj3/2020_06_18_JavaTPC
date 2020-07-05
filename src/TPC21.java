import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

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
