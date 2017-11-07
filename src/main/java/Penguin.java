public class Penguin extends NonFlyingBird {
    public static void main (String [] args) {
        Penguin p = new Penguin();

    p.setFeathers(true);
    p.setLayEggs(true);
    System.out.println("is it can fly? " + p.canFly() + "\nis it has feathers? " + p.feathers + "\nis it lay eggs? " + p.layEggs);
    }
}
