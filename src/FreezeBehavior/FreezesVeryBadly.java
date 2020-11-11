package FreezeBehavior;

public class FreezesVeryBadly implements Freezebehavior{


    @Override
    public void freeze(Object type) {
        System.out.println("Oh no, the "+ type.getClass().getSimpleName() + " is dead. Sad. very sad. awful.");

    }

    @Override
    public void freeze() {
        System.out.println("OH no, its dead");
    }
}
