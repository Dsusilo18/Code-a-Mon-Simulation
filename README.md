# Code-a-Mon-Simulation

## Design Patterns:
- Decorator Design Pattern: Use Decorator design pattern for evolutions by using a Monster interface, a BasicMonster class that implements Monster, a MonsterDecorator class that implements Monster,
then multiple classes that extends MonsterDecorator. Allows for basic monsters of specific types to be created out of a basic monster with a neutral type and alter its stats.
It also allows evolved types of the basic monster of specific types to be created from the basic monster with neutral type with buffed stats that are different for each 
type of monsters.

  1. This pattern fulfills the requirements of allowing Code-a-mons to gain experience points from winning battles and level up every 5 levels earned by allowing code-a-mon to 
have levels.
  2. It also allows Weather events to benefit or unbenefit certain types of code-a-mon by having modifiable weatherbuff variables that are tied to code-a-mons.
  3. Code-a-mons can also gain advantages or disadvatanges based on the type of apponents because of the typebudd variable that each code-a-mon have that can be modified.
- Factory Pattern: Use a factory pattern for all the MonsterDecorator subclass so that it is easier to create new code-a-mon. By having one class that has a method that will return a certain type
of monster accordingly to the paramter inserted in the method call. This class is used to create any code-a-mons for trainers or when a trainer is about to battle a wild code-a-mon.
  1. This pattern fulfills the requirements of allowing an evolution of code-a-mons to occur at night because the MonsterFactory class can be called when time is day or night.
  2. Two trainers can also be created and each one can call this class to make a random code-a-mon.
  3. Since an object of this class can be created to make wild code-a-mons that will battle the trainer, it fultills the requirement of a code-a-mon being able to compete 1v1 with another trainers code-a-mon.
- Mediator Pattern: Use a mediator pattern by creating a mediator class that would control actions in a timely manner. Meaning that if a battle haven't ended, the trainer can't suddenly fight 
another monster or trainer. This is achieved through a class called BattleArenaMed that mediates the battle arena by taking care of who can access the arena or not. A fight and 
arena would be registered into the class and once it happens, no other fight can be registered untill that fight ends, allowing the simulation of a battle to happen during that
period. 

  1. This pattern mediates wether the simulation of a battle can occur or not, so this pattern fulfills the requirement of the trainer having the ability to acquire more code-a-mons after each battle with only wild code-a-mons.
  2. This mediator class also fulfills the requirement of the simulations running on cycles of day and nights because 
the cycle changes after each battle, the battle that is mediated by the mediator class.
  3. Lastly, since the day cycles after each battle simulation, this pattern fulfills 
the requirement of each cycles having its own weather event as eveytimg the day cycels, a new weather is chosen for that day.

## Build *To run this project, use Gradle. 
gradle build

## Usage   
gradle run

## Run test   
gradle test

## Technology Used: 
- TravisCI
- Java
- Spotsbug
- Gradle
- Checkstyle
