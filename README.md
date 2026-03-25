# Münzwechselproblem (Java)

## Beschreibung
Dieses Projekt löst das klassische Coin Change Problem. Ziel ist es, die Anzahl der Möglichkeiten zu berechnen, einen bestimmten Betrag S mit gegebenen Münzdenominationen zu bilden. Zusätzlich können alle möglichen Kombinationen angezeigt werden, wenn der Betrag klein genug ist.

## Regeln
Jeder Betrag S muss ausschließlich aus den angegebenen Münzen gebildet werden. Münzen können beliebig oft verwendet werden. Die maximale Summe beträgt 10.000. Kombinationen werden nur angezeigt, wenn S ≤ 30, um große Ausgaben zu vermeiden.

## Funktionsweise
Das Programm verwendet dynamische Programmierung, um effizient die Anzahl der Möglichkeiten zu berechnen. Für kleine Summen wird eine rekursive Methode genutzt, um alle Kombinationen zu finden. Nach der Eingabe von Betrag, Anzahl der Münzarten und den Münzwerten werden die Ergebnisse auf der Konsole ausgegeben.

## Ablauf
Benutzer gibt Betrag S = 5 ein.
Benutzer gibt Münzen 1 2 ein.
Ausgabe:
Number of ways to make 5 is: 3
All possible combinations to make 5:
[1, 1, 1, 1, 1]
[1, 1, 1, 2]
[1, 2, 2]

## Ausführen
javac com/mycompany/coinchangeproblem/CoinChangeProblem.java
java com.mycompany.coinchangeproblem.CoinChangeProblem

## Voraussetzungen
Java JDK 8 oder höher
