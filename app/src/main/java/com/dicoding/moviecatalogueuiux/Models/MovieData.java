package com.dicoding.moviecatalogueuiux.Models;

import java.util.ArrayList;

public class MovieData {
    public static String[][] dataMovie = new String[][]{
            {"A Star is Born", "https://www.gsgmedia.co/wp-content/uploads/2018/10/a_star_is_born_original_motion_picture_soundtrack-portada.jpg", "Seasoned musician Jackson discovers and falls in love with struggling artist Ally. She has just about given up on her dream to make it big as a singer until Jack coaxes her into the spotlight."},
            {"Aquaman", "https://image.tmdb.org/t/p/original/zdw7Wf97vsQ0YnGomxDqfcEdUjX.jpg", "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. "},
            {"Avenger Infinity War", "https://static.gamespot.com/uploads/original/1557/15576725/3376450-infinity-war-poster1.jpg", "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos."},
            {"Robin Hood", "https://image.tmdb.org/t/p/original/9KKT8qPAII0VJMpviThOTMLN0Wt.jpg", "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."},
            {"Bohemian Rhapsody", "https://i1.wp.com/aliimad.com/wp-content/uploads/2019/01/bohemian1.jpg?resize=960%2C1200&ssl=1", "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon."},
            {"Bumblebee", "https://cdn.flickeringmyth.com/wp-content/uploads/2018/11/Bumblebee-poster-35462.jpg", "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town."},
            {"Spiderman", "http://image.tmdb.org/t/p/original/7q0AQtk7lPtke1UGnWh889eJnHD.jpg", "Miles Morales is juggling his life between being a high school student and being a spider-man."},
            {"Deadpool","https://www.newdvdreleasedates.com/images/posters/large/deadpool-2016-08.jpg","Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boys life"},
            {"Venom","https://orig00.deviantart.net/f49d/f/2018/222/5/9/venom__2018____poster_3_by_camw1n-dcjqpdu.png","Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote."},
            {"Black Panther","http://static.tvgcdn.net/feed/1/541/thumbs/118202541_1300x1733.jpg","King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war."},
            {"Bird Box","https://static.rogerebert.com/uploads/movie/movie_poster/bird-box-2018/large_bird-box-poster-6.jpg","Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety."}
    };

    public static ArrayList<Movie> getListDataMov() {
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : dataMovie) {
            Movie movie = new Movie();
            movie.setTitle(aData[0]);
            movie.setPoster(aData[1]);
            movie.setDescription(aData[2]);

            list.add(movie);
        }
        return list;
    }
}
