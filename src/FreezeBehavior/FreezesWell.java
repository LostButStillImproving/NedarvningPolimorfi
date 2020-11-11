package FreezeBehavior;

public class FreezesWell implements Freezebehavior {
    @Override
    public void freeze(Object type) {
        System.out.println("The " + type.getClass().getSimpleName() + " is being frozen well and nicely");
    }

    @Override
    public void freeze() {
        System.out.println("Fryses så godt ned");
    }
}
