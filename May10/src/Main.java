public class Main {
    public static void main(String[] args) {
        String movie_name="Xmen";
        String genre="action";
        int release_year=2000;
        String movie[][]={
                {"Avatar","Xmen"},
                {"one piece","boku no pico"},
                {"my hero","no game no life"}
        };

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if(movie[i][j]==movie_name) {
                    System.out.print("Movie = " + movie_name + "\nGenre = " + genre + "\nRelease year = " + release_year+"\n\n");
                }
            }
        }
        for (int i=0;i<3 ;i++){
            for(char hel:movie){

            }
        }

    }
}