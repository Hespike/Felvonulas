public class Felvonulas {

    static int szavazas(String[] szavazatok) {
        int lovasSzekerSzavazatok = 0;
        for(int i = 0; i < szavazatok.length; i++) {
            if (szavazatok[i].equals("lovasszeker")) {
                lovasSzekerSzavazatok++;
            }
        }
return lovasSzekerSzavazatok;
    }

}

/* also
public class Felvonulas {

    static int szavazas(String[] szavazatok) {
        int darabszam = 0;
        for (int i = 0; i < szavazatok.length; i++) {
            if (szavazatok[i].equals("lovasszeker")) {
                darabszam++;
            }
        }

        return darabszam;
    }

}

 */
