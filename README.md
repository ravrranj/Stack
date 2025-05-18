# Stack
Understanding the logic of one of the most important and Useful Data structure 


🧱 What is a Stack?
Think of a stack like a pile of plates 🍽️.
You add a plate on top → you remove a plate from the top.
That’s how Stack works — Last In, First Out (LIFO).



Stacks follow the LIFO (Last In, First Out) principle—think of it like a stack of books where the last one placed on top is the first one taken off.
🏆 Real-World Examples of Stacks:
- Stack of Books or Plates – The last item placed on top is the first one removed.
- Undo/Redo in Software – Your most recent action is the first one undone.
- Browser Back Button – Your previously visited pages are stacked, and clicking "Back" pops the last page first.
- Backtracking in Games – Moves are stored in a stack, allowing you to undo or retrace your steps.
- Function Calls in Programming – When a function is called, it gets added to a "call stack." Once it completes, it's removed in reverse order.
- Reversing Words in a Sentence – Words are pushed onto a stack and popped off in reverse order.
- Peeling an Onion – Each layer you remove exposes the previous one.
Stacks are useful wherever we need to process things in reverse order or track history without losing data. 


🔁 Core Stack Operations:
push(x) → Add element x to the top

pop() → Remove and return the top element

peek() / top() → Just view the top element without removing

isEmpty() → Check if the stack is empty

📦 Java Stack Basics
Java has a built-in Stack class inside java.util.Stack.




