# Inspector

Napisz program, który będzie symulował rolę kontrolera biletów. Bilety przydzielane są w postaci elektronicznej i mają ograniczony czas ważności.

Zdefiniuj klasy:

Ticket - reprezentuje bilet, przechowuje informację o czasie skasowania biletu oraz czasie jego ważności (wyrażonej w minutach). 
Ponieważ bilety sprzedawane są wyłącznie w formie elektronicznej, to bilet po zakupie jest od razu "skasowany",
Passenger reprezentującą pasażera. Przechowuje informacje o imieniu i nazwisku. Może mieć także przypisany obiekt Ticket, co oznacza, 
że dany pasażer zakupił bilet.
TicketMachine - reprezentuje automat do biletów. Posiada tylko jedną metodę buyTicket, która przyjmuje jako argumenty pasażera oraz czas 
na jaki dany pasażer wykupuje bilet a jej zadaniem jest utworzenie biletu i przypisanie go do przekazanego obiektu pasażera.
W klasie TicketController, która powinna być klasą startową programu utwórz tablicę pasażerów i do części z nich przypisz bilety (z czego 
niektóre bilety powinny być "przeterminowane"). Zdefiniuj osobną metodę, która posłuży do sprawdzenia, którzy pasażerowie posiadają ważny bilet. 
W wyniku metoda powinna zwrócić tablicę pasażerów, którzy nie posiadają ważnego biletu.

Zagadnienia przydatne do rozwiązania: definiowanie klas, metod i obiektów, Date Time API, pętle, instrukcje sterujące
