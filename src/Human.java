import FreezeBehavior.Freezebehavior;

public class Human implements Freezebehavior {

    protected Freezebehavior fb;

    Human(Freezebehavior fb) { this.fb = fb; }


    public void freeze(Object type) { fb.freeze(type);
    }

    public void freeze() {
        fb.freeze();
    }
}
