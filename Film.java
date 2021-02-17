public class Film implements Comparable<Film>{

    public String name;
    public Integer year;
    public Integer score;

    public Film (String name, Integer year, Integer score) {
        this.name = name;
        this.year = year;
        this.score = score;
    }

    public int compareTo(Film other) {
        if(this.score < other.score) {
            return -1;
        }
        if(this.score > other.score) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return this.name + ": " + this.score + "%";
    }
}
