import FreezeBehavior.Freezebehavior;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Frugt extends Varer implements Freezebehavior {

    protected Freezebehavior fb;

    Frugt(Freezebehavior fb) { this.fb = fb; }


    public void freeze(Object type) { fb.freeze();
    }

    public void freeze(){ fb.freeze();
    }

    void coolDown() {
        System.out.println("Æblerne køles ned.");
    }
}
