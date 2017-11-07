
public class Eagle extends FlyingBird{
    public static void main (String [] args) {
        Eagle e = new Eagle();
        e.setFeathers(true);
        e.setLayEggs(true);
        System.out.println("is it can fly? " + e.canFly() + "\nis it has feathers? " + e.feathers + "\nis it lay eggs? " + e.layEggs);
    }
}
