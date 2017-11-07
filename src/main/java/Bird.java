public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;
    protected abstract boolean canFly();

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }
}



