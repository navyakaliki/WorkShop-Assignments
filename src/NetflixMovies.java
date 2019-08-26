public class NetflixMovies {
    private static String repoName = "NetFlix";

    public static void setRepoName(String newName) {
        repoName = newName;
    }

    private String movieName;
    private String actor1;
    private String actor2;

    public NetflixMovies(String movieName, String actor1, String actor2) {
        this.movieName = movieName;
        this.actor1 = actor1;
        this.actor2 = actor2;
    }

    public static String getRepoName() {
        return repoName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s",repoName,movieName, actor1, actor2);
    }

}
