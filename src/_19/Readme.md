W starych wersjach Javy (przed Javą 5) pudełko mogło przyjąć wszystko (było typu Object). Mogłeś tam wrzucić jabłko, a potem wyciągnąć je myśląc, że to granat. Program kompilował się bez błędu, ale w trakcie działania wybuchał z błędem ClassCastException!

Generics wprowadzono, aby to naprawić. Główne powody ich stosowania to:

- Bezpieczeństwo typów (Type Safety): Kompilator pilnuje, żeby do pudełka z napisem "Jabłka" nie wrzucić granatu. IDE podświetla błąd

- Eliminacja rzutowania (No Casting): Przy wyciąganiu z pudełka Box<String>, Java od razu wie, że to String. Nie trzeba pisać (String) box.get().

- Oszczędność kodu (Reusability): Zamiast pisać osobne klasy IntegerBox, StringBox, WizardBox, piszesz jedną uniwersalną klasę Box<T>, gdzie T to dowolny typ, który określisz dopiero przy tworzeniu obiektu.