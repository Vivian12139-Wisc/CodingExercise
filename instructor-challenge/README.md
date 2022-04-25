# Code Platoon Instructor Challenge

Please fork this challenge and email jobs@codeplatoon.org once you are finished. Note that we prioritize code quality and algorithmic efficiency above how quickly you submit an answer, so feel free to take up to a week to finish this challenge.

## Instructions

You are writing a computer program for an electronic vending machine to give you the optimal change for an item's cost. Write a function called `optimal_change` that takes in two arguments: `item_cost` and `amount_paid`. The function should return a string describing the optimal change which follows the following convention:

```python
# This example is in Python
print(optimal_change(62.13, 100))
> "The optimal change for an item that costs $62.13 with an amount paid of $100 is 1 $20 bill, 1 $10 bill, 1 $5 bill, 2 $1 bills, 3 quarters, 1 dime, and 2 pennies."

print(optimal_change(31.51, 50))
> "The optimal change for an item that costs $31.51 with an amount paid of $50 is 1 $10 bill, 1 $5 bill, 3 $1 bills, 1 quarter, 2 dimes, and 4 pennies."
```

Some helpful notes:
- At Code Platoon, we teach Python and Javascript, but feel free to answer this question using your most fluent coding language 
- Your algorithm should compute the **optimal** change. Obviously, you can give the change in pennies, but we're looking for the most optimal (least amount of) change possible.
- You should only consider **common** monetary denominations (i.e. ignore $2-bills, half-dollars, etc.)
- You need to account for proper plural denominations (i.e., quarters, dimes, pennies, bills) and proper punctuation (i.e., commas, using "and", and the period at the end of a sentence).
- Unit testing is important for students as will be important for our instructors to teach. Please include at least 5-6 test cases in a separate `spec` file and account for for edge cases and special cases.
