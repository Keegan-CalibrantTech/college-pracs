male(george).
male(darral).
male(edsel).
male(keegan).
male(ashton).
male(anthony).
male(clyde).

female(teresa).
female(crystal).
female(belinda).
female(chelsea).
female(nasya).
female(nikhita).
female(kimberly).
female(samantha).

father(george,darral).
father(george,anthony).
father(george,crystal).
father(george,belinda).
father(george,edsel).
father(darral,keegan).
father(darral,chelsea).
father(anthony,ashton).
father(anthony,nasya).

mother(teresa,darral).
mother(teresa,anthony).
mother(teresa,crystal).
mother(teresa,belinda).
mother(teresa,edsel).
mother(crystal,nikhita).
mother(crystal,samantha).
mother(belinda,clyde).
mother(belinda,kimberly).

parent(X,Y) :- father(X,Y),male(X);mother(X,Y),female(X).
grandparent(X,Y) :- parent(X,Z),parent(Z,Y).