## Mike's MakeChange(ChangeBurglar) Homework Project

This is my week 1 graded homework.

(**1)** Once my ChangeBurglar program is initiated it asks the presumed user (cashier)
to input the price of whatever merchandise a customer has brought to them.

The user (cashier) must enter an integer or a floating point number in order to represent
the price of the merchandise.)

(**2)** Once the price has been input, the user (cashier) is asked to input the tender received from the customer
which must be input as an integer or floating point number.)

(**3)** The program then analyzes which type of output needs to occur.

**If)** the user(cashier) input a tender received number that matched what the price of the item was as entered before,
then the program will forcibly quit since there is no dispense of change required once the user(cashier) accepts the
tender from the customer.

**If)** the user(cashier) input a tender received number < the price of the item was indicated as
then the program will output a line "Please request more money from the customer. I'm restarting now..."
and the program will loop back to the beginning. This would prevent the cashier from being ripped off.

**If)** the user(cashier) input a tender received number > what the price of the item was indicated as then
the program will output the necessary change (difference between price and tendered amount) that needs to be given to the customer.
The program will print out the denominations from 20 dollar bills, 10 dollar bills, 5 dollar bills, 1 dollar bills, quarters, dimes, nickels, and pennies. Precedence is taken to the higher denominations and runs through to the lowest denominations until the change
output is dispensed. This prevents the user(cashier) from giving the customer change in entirely pennies.)






()**I tried to include an option to type QUIT or quit to stop the loop and tried to
use methods but I need to review and learn how to do it more effectively. Lastly, I planned
on putting an option for the cashier to become a thief but didn't get around to it.
 For now this was the best I could do.**)
