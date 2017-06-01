# NCDC-Tree-in-Java (bez hate'u proszę. To pierwszy program w Javie zrobiony na prędce) 

Wracając do zadania:
1. Program ma wyświetlać w konsoli choinkę.
2. Program ma przyjmować jako parametr liczbę. Liczba ta będzie określać wysokość choinki w wierszach.
3. Choinka składa się z czterowierszowych poziomów.
- pierwszy poziom ma na szczycie jeden znak,
- każdy kolejny poziom jest szerszy o dwa znaki od poprzedniego,
- liczbę znaków w poszczególnych poziomach można zobaczyć na załączonym obrazku
(w przykładzie pokazano pierwsze cztery poziomy, kolejne powinny być rozszerzane analogicznie).
4. Jeśli zadana jako parametr liczba wierszy określająca wysokość choinki nie będzie wielokrotnością czwórki, poziom najniższy powinien zostać ograniczony do takiej liczby wierszy, aby łączna liczba wierszy choinki była zgodna z zadanym parametrem.
5. Smutna byłaby jednak choinka bez bombek :) Nam za bombki niech posłużą cyfry. 
- żeby nie było monotonnie, na szczycie umieśćmy jedynkę
- skrajne boczne znaki niech będą kolejnymi cyframi ułożonymi rosnąco w kierunku przeciwnym do ruchu wskazówek zegara. Po dziewiątce zero, potem jedynka i od nowa.
- dolna krawędź (poza bocznymi skrajnymi znakami) niech będzie złożona z gwiazdek
- wszystkie pozostałe znaki wypełniające choinkę to też gwiazdki.

Przykładowe wyniki działania programu dla 3, 7 i 11 wierszy wysokości
znajdziesz również na załączonym obrazku.
