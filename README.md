# -ser316-summer2021-C-dsusilo-DP
[Decorator Design Pattern]
- Use Decorator design pattern for evolutions by using a Monster interface, a BasicMonster class that implements Monster, a MonsterDecorator class that implements Monster,
then multiple classes that extends MonsterDecorator. Like for example FireBasic, WaterBasic, GrassBasic as well as their evolutions such as FireEvo, WaterEvo, GrassEvo.
[Factory Pattern]
- Use a factory pattern for all the MonsterDecorator subclass so that it is easier to create new code-a-mon. By having one class that has a method that will return a certain type
of monster accordingly to the paramter inserted in the method call.
[Mediator Pattern]
- Use a mediator pattern by creating a mediator class that would control actions in a timely manner. Meaning that if a battle haven't ended, the trainer can't suddenly fight 
another monster or trainer. 