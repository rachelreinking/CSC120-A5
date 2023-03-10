Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Association` affects your programming?
- What worked, what didn't, what advice would you give someone taking this course in the future?

It was a little hard to understand if I had implemented the associations correctly, because there is no
function or keyword to specify theses relationships (besides final and composition). I understand the 
different types of associations, but I wasn't sure exactly how to reflect these dynamics into the code. 
I think that I ended up establishing the relationships between the classes in the way the assignment 
detailed, but I don't know of a way to necessarily "check" that an aggregation relationship was established
correctly. It was a bit of a task to set up all of the relationships, but the association approach actually
made some of the more complex parts of the Train class really easy to execute because a lot of the methods 
already existed in other classes.

I would recommend that someone should approach the classes one at a time and thoroughly debug the simpler 
elements before moving on to more complex elements. For example, I kept getting an error in my Car class
that was very difficult to resolve because I had forgotten an important method in the Passenger class. I 
found that solving bugs often required me to search and test inside other classes instead of the actual class
that I was working in, so I would recommend others to start from simplest and move on to more complicated 
tasks and to remember that errors might be originating from other places so it is important to be cognizant 
of the associations and what specific methods are using from/within other classes.