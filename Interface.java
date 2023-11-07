public class Interface {
    public static void main(String args[])
    {
        Remote r = new Television();
        r.powerOn();
        r.volumeUp();
        r.volumeDown();
        r.powerOff();

    }
}
interface  Remote{
    abstract public void volumeUp();
    abstract public void volumeDown();
    abstract public void powerOff();
    abstract public void powerOn();

}
class Television implements Remote {
    public void volumeUp()
    {
        System.out.println("Volume up");

    }

    @Override
    public void volumeDown() {
        System.out.println("volumeDown");


    }

    @Override
    public void powerOff() {
        System.out.println("PowerOff");

    }

    @Override
    public void powerOn() {
        System.out.println("powerOn");

    }

}
