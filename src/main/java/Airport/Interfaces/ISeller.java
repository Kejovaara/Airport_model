package Airport.Interfaces;

import Airport.Consumables.Consumable;
import Airport.Person.Person;

public interface ISeller {

    boolean canSell(Person person, Consumable consumable);

}
