### Rename (Zmień nazwę)
- Jak to działa: 
  - Zmienia nazwę zmiennej, metody lub klasy wszędzie, gdzie została użyta w całym projekcie. 

- Jak przetestować: 
  - Kliknij na jakąkolwiek swoją zmienną, wciśnij Shift + F6, wpisz nową nazwę i wciśnij Enter.

### Extract Method (Wyodrębnij metodę)
- Jak to działa: 
  - Bierze zaznaczony kawałek kodu i tworzy z niego osobną metodę. Idealne, gdy Twoja metoda main robi się za długa.

- Jak przetestować: 
  - Zaznacz fragment kodu. Wciśnij Ctrl + Alt + M (Mac: Cmd + Option + M). IntelliJ zapyta Cię, jak nazwać nową metodę i sam ją stworzy, a w main wstawi tylko jej wywołanie.

### Introduce Variable (Wprowadź zmienną)
- Jak to działa: 
  - Zastępuje skomplikowane wyrażenie nową zmienną lokalną, żeby kod był czytelniejszy.

- Jak przetestować: 
  - Zaznacz fragment wyrażenia i wciśnij Ctrl + Alt + V (Mac: Cmd + Option + V). IDE samo stworzy zmienną i podstawi ją w odpowiednie miejsce.

### Extract Constant (Wyodrębnij stałą)
- Jak to działa: 
  - Zamienia tzw. "magiczne liczby" lub "magiczne stringi" w kodzie na nazwaną stałą (static final).

- Jak przetestować: 
  - Zaznacz wyrażenie, wciśnij Ctrl + Alt + C (Mac: Cmd + Option + C). Nazwij stałą jak chcesz.

### Extract Field (Wyodrębnij pole)
- Jak to działa: 
  - Zmienia zwykłą zmienną lokalną (żyjącą tylko w jednej metodzie) w pole całej klasy (dostępne dla wszystkich metod w klasie).

- Jak przetestować: 
  - Zaznacz deklarację i wciśnij Ctrl + Alt + F (Mac: Cmd + Option + F). Zobaczysz, że definicja przeniesie się na samą górę, pod nazwę klasy.

### Extract Parameter (Wyodrębnij parametr)
- Jak to działa: 
  - Bierze zmienną z wnętrza metody i wyrzuca ją do sygnatury metody jako parametr wejściowy.

- Jak przetestować: 
  - Wciskasz Ctrl + Alt + P (Mac: Cmd + Option + P) na zmiennej wewnątrz własnej metody, a IDE każe Ci podawać tę wartość przy każdym wywołaniu tej metody.

### Safe Delete (Bezpieczne usuwanie)
- Jak to działa: 
  - Zanim usunie metodę lub klasę, przeszukuje cały projekt, żeby upewnić się, że nigdzie indziej z niej nie korzystasz. Jeśli korzystasz – ostrzeże Cię!

- Jak przetestować: 
  - Kliknij na nazwę jakiejś stworzonej przez siebie metody i wciśnij Alt + Delete (Mac: Cmd + Delete).