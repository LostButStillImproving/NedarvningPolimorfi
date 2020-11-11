import FreezeBehavior.Freezebehavior;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Peas extends Grønsag  {

    public Peas(Freezebehavior fb) {
        super(fb);
    }

    public void freeze(){ fb.freeze(); }

}
