## Make Change Project - Week 1 Skill Distillery

### Overview

A simple Make Change application.  The program will initially greet the user, then ask for an input of the price of an item they are buying in dollars.  Following the accepted input, it will then ask for the amount tendered to the cashier from the user to pay for this item. If the user enters the exact amount the item costs as the tender, the program will tell them that is the exact amount.  If they do not input enough to cover the cost of the item, the program will give an error message while allowing the user to enter a larger tender if they wish.  If they say yes, it will ask for a new tender input.  If they say no, the program will quit.

Change will be produced after the expected inputs (when tender is greater than the price) by using larger denominations first, with $20 bills as the largest, all the way to pennies as the smallest. The program will give back the change with the number of bills and coins in order, highest to lowest.  Also, if multiple bills/coins were used, they will be given back in the plural form.  If a single denomination is used, it will be shown singular (i.e, 1 penny instead of 1 pennies).  The program will work for large numbers, but still only break down the change with no bill higher than a $20.

### Technologies Used

- Eclipse

- Java

- Terminal Commands

- GitHub/Git


### Lessons Learned

- Dividing doubles and integers can leave remainders that can tamper with the logic of the code and produce undesirable output. Casting doubles into ints also helped with the code.

- Math.round ( ) was a great way to take help with some of the remainder issue in my first project, and it cleared it up without extra addition being needed in my second make up.

- Complex if/else statements can get difficult to work with if there are any bugs.  I re-did this project using a method for each denomination and may upload that as a MakeChange2 repo.

- Defining a method using parameters and relaying back arguments into other functions is very useful and powerful.
