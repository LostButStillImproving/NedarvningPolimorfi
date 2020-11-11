package FreezeBehavior;

public class FreezesBad implements Freezebehavior {
    @Override
    public void freeze(Object type) {
        System.out.println("The " + type.getClass().getSimpleName() + " was frozen down, but it is spoiled");
    }

    @Override
    public void freeze() {
        System.out.println("Fryses ned, men badly");
    }
}
