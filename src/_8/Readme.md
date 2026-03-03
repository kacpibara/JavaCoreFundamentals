# Zadanie 8: Modyfikacja wartości podanych liczb (Inkrementacja)

Ten folder zawiera trzy różne podejścia do rozwiązania z pozoru banalnego problemu: zwiększenia liczby o 1 wewnątrz osobnej metody.

##  Dlaczego zwykłe `x++` nie działa? (Problem Pass-by-Value)

W Javie argumenty do metod są **ZAWSZE przekazywane przez wartość (Pass-by-Value)**.
- Typy proste (np. `int`, `double`) żyją w pamięci na tzw. **Stosie (Stack)**. Gdy przekazujemy je do metody, Java tworzy ich **kopię**. Zmiana kopii wewnątrz metody nie wpływa na oryginał.
- Klasy opakowujące (np. `Integer`) rozwiązują problem obiektowości, ale są **niezmienne (immutable)**. Po stworzeniu obiektu `Integer`, nie da się zmienić jego wartości wewnątrz.



Aby zmienić oryginalną wartość, musimy użyć obiektów, których stan można modyfikować (mutować), i które żyją na **Stercie (Heap)**. Gdy przekazujemy obiekt do metody, przekazujemy *kopię referencji* (adresu w pamięci), która nadal wskazuje na ten sam oryginał na Stercie.

---

## 3 Sposoby Rozwiązania (Dlaczego mam tu 3 pliki?)

### 1. Sposób z Tablicą (`MainArray.java`)
**Jak to działa:** Tablice w Javie są obiektami (żyją na Stercie). Do metody przekazujemy referencję do tablicy.
**Dlaczego tak:** To najszybszy, wręcz "hakerski" trik, by zmodyfikować wartość, nie tworząc nowej klasy. Wchodzimy pod podany adres i zmieniamy zawartość szufladki `[0]`.

### 2. Sposób Obiektowy / OOP (`MainObject.java`)
**Jak to działa:** Tworzymy własną klasę `MutableNumber`, która ma wewnątrz zmienną `int` (bez słówka `final`). Przekazujemy ten obiekt do metody.
**Dlaczego tak:** To klasyczne podejście z Programowania Obiektowego (OOP). Obiekt trafia na Stertę. Metoda `modyfikuj()` odbiera adres tego obiektu i używa jego wewnętrznej metody (np. `zwiekszO()`), by zmienić jego stan. Jest to bardzo czytelne biznesowo.

### 3. Sposób Funkcyjny (`MainFunctional.java` - ZALECANY)
**Jak to działa:** Zamiast modyfikować oryginał w pamięci, metoda przyjmuje kopię, powiększa ją i **zwraca nową wartość** (używając `return`).
**Dlaczego tak:** Jest to zgodne z zasadami "Czystego Kodu". Funkcja nie robi tzw. "efektów ubocznych" (nie modyfikuje niczego potajemnie w tle). Programista wywołując metodę, sam musi zdecydować o nadpisaniu zmiennej: `x = zwieksz(x);`. To najbezpieczniejsze i najczęstsze podejście przy typach prostych.