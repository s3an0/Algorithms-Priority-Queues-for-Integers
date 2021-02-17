import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // generate random array
        int[] A = IntStream.generate(() -> new Random().nextInt(1000)).limit(20).toArray();

        // convert to Integer[]
        Integer[] arrRand = Arrays.stream(A).boxed().toArray(Integer[]::new);

        System.out.println("Unordered Integers:");
        for (Integer i : arrRand) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Priority Queue
        MinPQ<Integer> pqInts = new MinPQ<Integer>(arrRand.length + 1);

        // add
        for (Integer i : arrRand) {
            pqInts.insert(i);
        }

        // tmp stack to take all the values
        Stack<Integer> stackInt = new Stack<Integer>();

        // add all max to stack
        while (!pqInts.isEmpty()) {
            stackInt.push(pqInts.delMin());
        }

        // show result
        System.out.println("Ordered Integers:");
        for (Integer i : stackInt) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Example Films
        Film sevenSamurai = new Film("Seven Samurai", 1954, 100);
        Film lastAirbender = new Film("The Last Airbender", 2010, 5);
        Film starWars = new Film("Star Wars", 1977, 92);
        Film spiritedAway = new Film("Spirited Away", 2002, 97);
        Film independenceDay = new Film("Independence Day", 1996, 67);
        Film citizenKane = new Film("Citizen Kane", 1941, 100);
        Film goneWind = new Film("Gone with the Wind", 1939, 91);
        Film godzilla = new Film("Godzilla", 1954, 93);
        Film fantasia = new Film("Fantasia", 1940, 95);
        Film robotMonster = new Film("Robot Monster", 1953, 36);


        // Array of Films
        Film[] arrFilms = new Film[10];
        arrFilms[0] = starWars;
        arrFilms[1] = lastAirbender;
        arrFilms[2] = sevenSamurai;
        arrFilms[3] = spiritedAway;
        arrFilms[4] = independenceDay;
        arrFilms[5] = citizenKane;
        arrFilms[6] = goneWind;
        arrFilms[7] = godzilla;
        arrFilms[8] = fantasia;
        arrFilms[9] = robotMonster;

        System.out.println("Unordered Films:");
        for (Film i : arrFilms) {
            System.out.print(i + " | ");
        }
        System.out.println();

        // Priority Queue
        MinPQ<Film> pqFilm = new MinPQ<Film>(arrFilms.length + 1);

        // add
        for (Film i : arrFilms) {
            pqFilm.insert(i);
        }

        // tmp stack to take all the values
        Stack<Film> stackFilm = new Stack<Film>();

        // add all max to stack
        while (!pqFilm.isEmpty()) {
            stackFilm.push(pqFilm.delMin());
        }

        // show result sorted by review score
        System.out.println("Ordered Films (Score):");
        for (Film i : stackFilm) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }
}