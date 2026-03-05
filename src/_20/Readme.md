## Kiedy i po co stosujemy for-each?
Pętla for-each (w Javie znana oficjalnie jako Enhanced for loop) służy do sekwencyjnego przechodzenia przez wszystkie elementy tablic lub kolekcji (np. List, Set), od pierwszego do ostatniego.

Pozwala nam pozbyć się zarządzania indeksami `(int i = 0; i < tablica.length; i++)`, dzięki czemu kod staje się super czysty i czyta się go jak zwykłe zdanie po angielsku.

Pętla `for-each` ma dwie wady i nie używa się jej zawsze:

- Brak dostępu do indeksu

- Zakaz usuwania: 
  - Nie można usunąć przedmiotu z kolekcji w trakcie trwania pętli `for-each`. Instrukcja `if(item.equals("Rusty Dagger")) bossLoot.remove(item);`, program natychmiast wybuchnie znanym błędem ConcurrentModificationException.