# PracticaFinal_AngeloPicon_JeanCarloCortes
La aplicació que hem decidit elaborar, tracta de una perruqueria la qual disposa d’un menú i tens diferents opcions; com demanar cita, veure la cita, selecciona el mètode de pagament etc.  El programa mostra un menú principal amb tres opcions: demanar cita, veure cita i sortir.

La funció main () del programa crida a la funció menuPrincipal (). La funció menuPrincipal () mostra el missatge de menú i sol·licita l'entrada de l'usuari. L'entrada és controlada mitjançant la funció control (). La funció control () mostra el missatge d'entrada i comprova que l'usuari ingressi un nombre enter vàlid dins del rang mínim i màxim especificat. Si l'entrada és invàlida, es mostra un missatge d'error i es torna a sol·licitar l'entrada. Una vegada que s'ingressa una opció vàlida, el programa entra en un bucle do-while que executa l'opció seleccionada fins que l'usuari tria sortir.

La funció obtenerInformacion () sol·licita informació a l'usuari per a programar una cita. Primer, sol·licita el nom de l'usuari, que ha de tenir un màxim de 15 caràcters. Després, sol·licita el número de telèfon de l'usuari, que ha de tenir un mínim de 8 nombres enters. Finalment, sol·licita a l'usuari que seleccioni una hora per a la seva cita. La funció retorna la informació ingressada i crida a la funció Preus ().

La funció Preus () mostra els preus de les diferents tallades de cabells i sol·licita a l'usuari que seleccioni un d'ells. Una vegada que s'ha seleccionat una tallada de cabells, el programa sol·licita a l'usuari que seleccioni un mètode de pagament (efectiu o targeta de crèdit). Si se selecciona efectiu, el programa sol·licita a l'usuari que ingressi els diners i calcula el canvi. Si se selecciona targeta de crèdit, es mostra un missatge d'èxit.

La funció mostrarInformacion () mostra la informació ingressada per l'usuari (nom, telèfon i hora de la cita).

En general, aquest programa permet als usuaris programar cites en una perruqueria i seleccionar la tallada de cabells i el mètode de pagament de la seva elecció. El programa utilitza l'entrada de l'usuari per a validar i controlar els errors, assegurant que el programa funcioni de manera eficient i efectiva.
