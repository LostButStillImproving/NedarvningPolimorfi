import FreezeBehavior.Freezebehavior;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Apple extends Frugt {


    public Apple(Freezebehavior fb) {
        super(fb);
    }
    String sort = "Golden Delicious";
    java.lang.String type = "spiseæble";
    public boolean moden = false;

    public java.lang.String getSort() {
        return sort;
    }

    public java.lang.String getType() {
        return type;
    }

    public boolean isModen() {
        return moden;
    }
    public void freeze(Object type) {fb.freeze(type);
    }

    public void freeze(){ fb.freeze(); }

}
