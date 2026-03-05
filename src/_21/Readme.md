NIO to skrót od New I/O (Nowe Wejście/Wyjście).

Stara szkoła (java.io): Powstała na samym początku istnienia Javy (1995 rok). To te wszystkie klasy typu File, FileReader, BufferedReader. Były potężne, ale bardzo toporne w użyciu i miały jedną wielką wadę: były "blokujące". Kiedy program czytał duży plik z dysku, zawieszał się i nie mógł robić niczego innego.

Nowa szkoła (java.nio.file): To tzw. NIO.2, wprowadzone jako potężna aktualizacja. Zastąpiono starego, problematycznego File nowoczesnymi i lekkimi interfejsami Path i Paths. Dodano też klasę-kombajn Files, która robi za nas całą brudną robotę w jednej linijce (jak nasze Files.readAllLines()). Jest znacznie szybsza, bezpieczniejsza, radzi sobie z uprawnieniami systemowymi i lepiej obsługuje wyjątki.