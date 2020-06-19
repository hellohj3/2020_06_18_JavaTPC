package kr.bit;

/* 회원 사용자 정의 자료형 (User Define Data Type)
 * 이름 : name
 * 나이 : age
 * 몸무게 : weight
 * 키 : height */
public class PersonVO {
    private String name;
    private int age;
    private float weight;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
