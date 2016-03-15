/*
Come up with two sets of numbers, and sort them. These sets of numbers must have at least 5 numbers in them, and cannot already be sorted beforehand. They also cannot be any set of numbers discussed during class.

Just like the Bubble and Insertion Sort Lab, sort as many as you can. Make sure to show your work; show the result after each pass.

Requirements

Provide the worked-out results. You can either take photos of the individual results that were written on paper or you can type them in a text file; it does not matter which one.

Bonus:

Sort the following string, using Insertion sort:

G, e, n, E, R, a, L
*/

Set 1: 6, 44, 235, 313, 23, 1
6, 44, 235, 313, 23, 1  ->  6, 23, 44, 235, 313, 1
6, 23, 44, 235, 313, 1  ->  1, 6, 23, 44, 235, 313


Set 2: 23, 32, 65, 23, 99, 9999
23, 32, 65, 9999, 23, 99  ->  23, 23, 32, 65, 9999, 99
23, 23, 32, 65, 9999, 99  ->  23, 23, 32, 65, 99, 9999

Bonus
G, e, n, E, R, a, L  ->  E, G, e, n, R, a, L
E, G, e, n, R, a, L  ->  E, G, R, e, n, a, L
E, G, R, e, n, a, L  ->  E, G, R, a, e, n, L
E, G, R, a, e, n, L  ->  E, G, L, R, a, e, n
