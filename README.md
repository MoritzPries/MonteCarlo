# MonteCarlo
Pi calculation using the Algorithm by Monte Carlo

based on the task: 

Instructions - Monte Carlo Method
Given a square with the vertices (0; 0); (0; 1); (1; 0) and (1; 1), in which a circle quarter
with the radius 1:0 is inscribed. Within the square now n points with
random x and y coordinates ((x; y) 2 [0; 1] [0; 1]) are distributed.
a) What is the ratio of the set of all points underneath the arc to
of the total set of points?
 Which condition is fulfilled by a point (x; y) below the arc with respect to its Euclidean distance to the zero point (0; y)?
distance to the zero point (0; 0)?
 Formulate by means of the preceding considerations an algorithm as a
structure for a program MonteCarlo.java, which approximates the number with n randomly generated points.
points to approximate the number.
b) Implement your rough structure MonteCarlo.java by stepwise refinement.
Test it with n = 103; 106 and 109 and calculate in each case the absolute error to
the value of the Java constant Math.PI. Redirect the output to a file Monte-
Carlo.out.
Hints:
 double Math.random() returns a random number r 2 [0; 1).
 The calculation for very large n may take longer time.
 
 based on the original task in german language: 
 
 Anweisungen - Monte Carlo Verfahren
Gegeben sei ein Quadrat mit den Eckpunkten (0; 0); (0; 1); (1; 0) und (1; 1), in dem ein Kreisviertel
mit dem Radius 1:0 einbeschrieben ist. Innerhalb des Quadrates werden nun n Punkte mit
zufälliger x- und y-Koordinate ((x; y) 2 [0; 1]  [0; 1]) verteilt.
a)  Welchem Verhältnis entspricht die Menge aller Punkte unterhalb des Kreisbogens zu
der Gesamtpunktmenge?
 Welche Bedingung erfüllt ein Punkt (x; y) unterhalb des Kreisbogens bzgl. seines euklidischen
Abstandes zum Nullpunkt (0; 0)?
 Formulieren Sie mittels der vorrangegangenen Überlegungen einen Algorithmus als
Grobstruktur für ein Programm MonteCarlo.java, welcher mit n zufällig erzeugten
Punkten die Zahl  näherungsweise bestimmt.
b) Implementieren Sie durch schrittweise Verfeinerung Ihre Grobstruktur MonteCarlo.java.
Testen Sie es mit n = 103; 106 und 109 und berechnen Sie jeweils den absoluten Fehler zu
dem Wert der Java-Konstanten Math.PI. Leiten Sie die Ausgaben in eine Datei Monte-
Carlo.out um.
Hinweise:
 double Math.random() liefert eine Zufallszahl r 2 [0; 1) zurück.
 Die Berechnung für sehr groÿe n kann längere Zeit in Anspruch nehmen.
