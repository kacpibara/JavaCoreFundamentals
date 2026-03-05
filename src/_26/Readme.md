Do wersji Java 8 obowiązywała święta, nienaruszalna zasada: Interfejs to tylko kontrakt, nie może mieć w sobie żadnego ciała metody (kodu).

Wszystko zmieniło się w Javie 8. Wprowadzono tzw. metody default (domyślne) oraz static wewnątrz interfejsów.

Dlaczego to zrobiono? Wyobraź sobie, że twórcy Javy chcieli dodać nową metodę (np. .stream()) do interfejsu List. Gdyby zrobili to po staremu, nagle miliony programistów na całym świecie dostałyby błędy kompilacji, bo musieliby ręcznie dopisać tę metodę w każdej swojej klasie implementującej List! Metody default pozwoliły dodać gotowy kod z zachowaniem kompatybilności wstecznej.

Dlaczego to jest takie ważne?

Zaleta (Backward Compatibility): Gdybyś miał aplikację z 50 różnymi przedmiotami magicznymi i nagle szef kazałby dodać funkcję repair(), po staremu musiałbyś otworzyć 50 plików i ją dopisywać. W Javie 8 dodajesz jedno default void repair() w interfejsie i gotowe! Wszystkie 50 klas zyskuje tę funkcję automatycznie.

Nowe możliwości: Interfejsy w Javie stały się dzięki temu bardzo podobne do tzw. klas abstrakcyjnych (o czym pewnie będziesz miał niedługo zadanie).