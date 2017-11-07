public class Kiwi extends NonFlyingBird {
    public static void main (String [] args) {
        Kiwi k = new Kiwi();

        k.setFeathers(true);
        k.setLayEggs(true);
        System.out.println("is it can fly? " + k.canFly() + "\nis it has feathers? " + k.feathers + "\nis it lay eggs? " + k.layEggs);
    }
}
