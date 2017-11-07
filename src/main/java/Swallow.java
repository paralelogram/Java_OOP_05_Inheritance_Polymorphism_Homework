public class Swallow extends FlyingBird{
    public static void main(String [] args) {
        Swallow s = new Swallow();
        s.setFeathers(true);
        s.setLayEggs(true);
        System.out.println("is it can fly? " + s.canFly() + "\nis it has feathers? " + s.feathers + "\nis it lay eggs? " + s.layEggs);
    }
}
