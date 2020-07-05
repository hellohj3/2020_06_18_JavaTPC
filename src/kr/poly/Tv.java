package kr.poly;

public class Tv implements RemoCon {
    int currCh = 70;

    @Override
    public void chUp() {
        if(currCh < RemoCon.MAXCH) {
            System.out.println("TV의 채널이 올라간다. : "+(++currCh));
        }
    }

    @Override
    public void chDown() {
        if(currCh > RemoCon.MINCH)
        System.out.println("TV의 채널이 내려간다. : "+(--currCh));
    }

    @Override
    public void internet() {
        System.out.println("TV 인터넷이 된다.");
    }
}
