public class MovieMaker {
    public static void main(String[] args) {
        NetflixMovies n1 = new NetflixMovies("Titanic","Jack","Rose");
        NetflixMovies n2 = new NetflixMovies("Friends","Jen","Joey");
        NetflixMovies n3 = new NetflixMovies("Murder Mystery","Adam","Jen");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        NetflixMovies.setRepoName("Youtubeflix");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }

}
