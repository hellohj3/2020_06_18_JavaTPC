import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
    public static void main(String[] args) {
        // 2. 다형성 배열
        Animal[] ani = new Animal[2];
        ani[0] = new Dog();
        ani[1] = new Cat();

        dispaly(ani);
    }

    private static void dispaly(Animal[] ani) {
        for(int i=0; i<ani.length; i++) {
            ani[i].eat();

            if(ani[i] instanceof Cat) {
                ((Cat)ani[i]).night();
            }
        }
    }
}
