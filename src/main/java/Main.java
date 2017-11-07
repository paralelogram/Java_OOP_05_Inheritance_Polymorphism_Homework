public class Main {
    public static void main (String [] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Swallow();
        birds[1] = new Eagle();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();
        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i].toString());
            System.out.println("is it can fly? " + birds[i].canFly() + "\nis it has feathers? " + birds[i].feathers + "\nis it can lay eggs? " + birds[i].layEggs);
            System.out.println();
        }
    }
}
