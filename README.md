# Ray's Music Exchange

The task is to model a music shop that will contain items that can be sold. These items might be instruments, which someone may play e.g. guitar, saxophone, piano, etc, or, they might be other items, e.g. guitar strings, drum sticks, sheet music  etc. Each item which can be sold will have both a price at which the shop bought the item, and a price at which the item will be sold.

## MVP

1. IPlay interface should be applied to instruments, and should have a play method that returns the sound of the instrument being played as a String.

2. Classes for different types of instruments e.g. guitars, pianos, etc. Each class will have its own instance variables for attributes particular to that instrument e.g. a guitar may have a number of strings, a trumpet may have a number of valves etc.

3. Instrument superclass: contains attributes that are common to all instruments e.g. material it is made from, colour, type (Brass, String, Woodwind, Keyboard etc). The classes created in step 2 above can then inherit from this Instruments class.

4. ISell interface has a calculateMarkup method that returns an int/double, based on the buying price and the selling price.

5. Classes for items the shop may sell, i.e. which implement the ISell interface. Such items should have the following:
  - a type/description e.g. guitar, drum sticks, guitar strings, sheet music etc.
  - a price at which the shop bought the item.
  - a price at which the shop plans to sell the item.

Some ISell items will be musical instruments i.e. instruments can be both IPlay and ISell.

6. Create a Shop class, which has a collection of ISell items, called stock. In your shop you should be able to:
  -  add items to stock.
  -  remove items from stock.

# Extensions

1. A method to give total potential profit for the shop.
2. Use enums for the instrument types e.g. keyboard, wind, brass etc

## TDD
Use TDD, with separate test files for each class.
