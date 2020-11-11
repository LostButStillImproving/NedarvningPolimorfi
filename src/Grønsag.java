import FreezeBehavior.Freezebehavior;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class  Grønsag extends Varer implements Freezebehavior {

    protected Freezebehavior fb;

    public Grønsag(Freezebehavior fb) { this.fb = fb; }


    @Override
    public void freeze(Object type) {
        fb.freeze(type);
    }

    public void freeze(){ fb.freeze(); }

}
