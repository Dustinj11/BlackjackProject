BlackjackProject

This program is a basic game of Black Jack that allows the user to interact
with the system.

The technologies used in this program consist of Java, Enums, Interfaces,
Loops, Abstraction, Polymorphism, Inheritance, and Encapsulation.

When the program is ran the user will see their two randomly generated cards
and they will be given an option of "hit" or "stay" the goal is for the user
to get to 21 or as close to it without going over 21. The program runs once with
a "you win" or a "you lose" outcome. The user will be asked if they would like
play again after one hand of Black Jack.

This program has really opened my eyes to Object Oriented Programming and how
it is important to the Java language. When i first started it was difficult to
keep track of all my methods and classes. I ended up using the UML in the
project description and also drawing my own with new classes and methods I
created. It helped me keep track with being able to take a quick glance at the
organization i created. I ran into an issue with the program giving the same
cars every time the program was ran. 2 of hearts, and 8 of clubs was given
every single time the program was ran. I figured out that I had my
deck.shuffle(); in the wrong location. I ended up having to move it into my
Dealer class for it to work. The second issues I ran into was when you played the
game again it would just add to the original dealt hand and you would start the
second game with a hand of 4 cards. I ended up having to create a method that
cleared both the dealer and players hands after the first game was played.

When i first started this program talking through it sounded easy.. but I was wrong.
This program proved to be difficult and challenging. There are still a few minor
things that I will work on throughout this course when I have free time to enhance
the user experience. 
