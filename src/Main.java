import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Movie movie1 = new Movie("A", 4, 7, 200, 300);
        System.out.println(movie1);
//
//        String title = in.nextLine();
//        int nominated = in.nextInt();
//
//        Movie movie2 = new Movie(title, nominated, in.nextInt(), in.nextDouble(), in.nextDouble());
//        System.out.println(movie2);
//
//        Movie[] movies = new Movie[2];
//        for (int i = 0; i < movies.length ; i++) {
//            movies[i] = new Movie(in.nextLine(), in.nextInt(), in.nextInt(), in.nextDouble(), in.nextDouble());
//            in.nextLine();
//        }
//
//        // display title only
//        for (int i = 0; i < movies.length ; i++) {
//            System.out.println(movies[i].getTitle() + ", ");
//        }

        System.out.println("Profitable: " + movie1.isProfitable() + " by " + movie1.getDifference());



    }
}









