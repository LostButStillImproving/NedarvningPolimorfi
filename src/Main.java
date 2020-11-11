import FreezeBehavior.Freezebehavior;
import FreezeBehavior.FreezesBad;
import FreezeBehavior.FreezesVeryBadly;
import FreezeBehavior.FreezesWell;

import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {
        Freezebehavior freezeBad = new FreezesBad();
        Freezebehavior freezeWell = new FreezesWell();
        Freezebehavior freezeVeryBadly = new FreezesVeryBadly();

        Frugt apple = new Apple(freezeBad);
        apple.stykpris = 2;
        apple.holdbarhed = new Date(1608768000);
        apple.smidUd();
        apple.coolDown();
        apple.freeze();

        Grønsag peas = new Peas(freezeWell);

        peas.stykpris = 0.1;
        peas.holdbarhed = new Date(1608768000);
        peas.freeze();

        Human human = new Human(freezeVeryBadly);
        human.freeze(human);
        apple.freeze(apple);
    }

}
