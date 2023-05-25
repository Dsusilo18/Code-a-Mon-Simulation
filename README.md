# Code-a-Mon-Simulation

A simulation of a monster trainer battling another trainer with randomly generated types of Code-a-mons as well as other wild Code-a-mons. The chances of a Code-a-mon winning depends on their types, stats, buffers and debuffers. If the main trainer wins against another trainer, more battles will proceed with wild Code-a-mon untill the trainer loses. Every battle will take place during the day or night as well as during a randomly generated weather. Every time the trainer wins, his Code-a-mon will also level up and eventually evolve to become stronger.

## Project Difficulties:    
While creating this project, it was challenging to figure out how many and what object classes were needed and how design patterns would be able to be implemented. Another thing that was a challenge was discovering how to integrate the type, buffer and debuffer of the Code-a-mon during battle scenerios. 

## My Solution:   
Create a UML diagram in order to understand what data and functions goes into what class. The diagram also helps in showing how each class object connects with one another as there are classes that has, uses or implemenmts other classes. In order to have the type of Code-a-mon, weather buffer and debuffer affect the outcome of the battles, I created a function to calculate the damage given to a defending Code-a-mon from an attacking Code-a-mon. In this function, the attacker and defender's type would be analysed to see if the weather would help them or not and set this as their weather bonus. Then depending on the type of the attacker and defender, set their type bonus to a certain value. For example, if the attacker is a fire type and the defender is a grass type, then the attacker's type bonus would be higher than the defender's type bonus. As fire > grass and water > fire. Now to actually integrate all of this data to find the total damage, I created a formula that involves multiplying the attacker's attack points with its weather bonus then multiplying by its type bonus. All of this would then be subtracted by the defender's defense point multiplied by its weather bonus multiplied by its type bonus. 

## Design Patterns Used:
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
