public abstract class NonFlyingBird extends Bird {
    @Override
    protected boolean canFly() {
        return false;
    }
}