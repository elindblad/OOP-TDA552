# block21exercise

Paketet utgår ifrån slutresultatet från förra veckan, med polygoner extraherade till egna klasser, i en arvshierarki. Utöver denna refaktorering har polygonerna också fått följande extra funktionalitet:
* Samtliga polygoner implementerar metoden toString(), som (i nuläget) enbart skriver ut typen på objektet den anropas på.
* I den abstrakta klassen Polygon finns en metod overlaps(Polygon other). Vi tänker oss att denna metod beräknar huruvida två polygoner överlappar. I nuläget rapporterar den dock bara typen (via toString()) på det implicita argumentet (this), och det explicita argumentet (other).

## Uppgifter

1) Skapa en ny applikationsklass TestOverlaps, som i en main-metod skapar några olika polygoner av olika slag och jämför med varandra med overlaps. Stämmer utskrifterna med vad ni förväntar dig? Kan ni förklara vad som händer i termer av statisk och dynamisk typ? Tänk och förutsäg först, kör sen!
2) Lägg till (mha overloading) specialiserade metoder av overlaps – e.g. overlaps(Triangle t):void i Triangle, och motsvarande i övriga subclasses. Låt dessa skriva ut liknande information som den i superklassen, så ni kan se vilken metod som anropas. Testa igen att jämföra olika polygoner. Stämmer det fortfarande med vad ni förväntar er?
3) Skapa ytterligare en polygon (av någon specifik dynamisk typ), men låt denna hållas av en variabel av statisk typ Polygon. Testa att jämföra även denna, med sig själv och med övriga polygoner med mer specifik statisk typ. Testa den både som implicit och explicit argument i olika anrop. Kan ni förutsäga vilka utskrifter ni kommer få?
4) Gör en override av metoden overlaps(Polygon p):boolean i alla subclasses, med en särskiljande utskrift. Kör testerna igen. Kan ni förutsäga vilka utskrifter ni kommer få?

## För mer utmaning

Java implementerar så kallad single dispatch för metoder – dvs att valet av konkret metod-implementation vid runtime baseras enbart på det implicita argumentet. Hur kan vi i Java åstadkomma double eller multiple dispatch, alltså att valet av metod baseras på både implicit och explicita argument?
* Som konkret exempel – säg att vi har en specialiserad algoritm som effektivt kan avgöra om en Triangle överlappar med en annan Triangle. Hur kan vi se till att denna algoritm används, även om de statiska typerna, för både implicit och explicit argument, är Polygon?
* Googla gärna – men försök klura ut en lösning själva först!
