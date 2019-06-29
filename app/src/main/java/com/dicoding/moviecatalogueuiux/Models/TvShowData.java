package com.dicoding.moviecatalogueuiux.Models;

import java.util.ArrayList;

public class TvShowData {
    public static String[][] dataTvShow = new String[][]{
            {"Arrow","https://fanart.tv/fanart/tv/257655/tvposter/arrow-562668db6cf82.jpg","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow."},
            {"Naruto Shippuden","http://img3.wikia.nocookie.net/__cb20131107012205/toonami/images/0/08/Shipuden.jpg","Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki."},
            {"Fairy Tail","http://3.bp.blogspot.com/-4h5lFECFHNM/U1ltYh02PkI/AAAAAAAAAqs/JlkDkf4OJ-U/s1600/Fairy-Tail-top+ten+anime+cheks.jpg","Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail."},
            {"Dragon Ball","http://anime.es/wp-content/uploads/2014/01/Anime-Dragon-Ball-50-0.jpg","Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku's home. Together, they set off to find all seven dragon balls in an adventure that would change Goku's life forever. See how Goku met his life long friends Bulma, Yamcha, Krillin, Master Roshi and more. And see his adventures as a boy, all leading up to Dragonball Z and later Dragonball GT."},
            {"The Flash","https://www.dvdsreleasedates.com/covers/flash-season-1-dvd-cover-58.jpg","After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel."},
            {"One Punch Man","https://static3.cbrimages.com/wordpress/wp-content/uploads/2019/01/One-Punch-Man-1.jpg","Saitama is a hero who only became a hero for fun. After three years of “special” training, though, he’s become so strong that he’s practically invincible. In fact, he’s too strong—even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?"},
            {"Wise Man’s Grandchild","https://i0.wp.com/www.theouterhaven.net/wp-content/uploads/2019/04/WIseMans_Grandchild.png?resize=750%2C1125&ssl=1","A young man who had surely died in an accident, was reborn in another world as a baby! After that, he was picked up by the patriot hero Merlin Wolford and was given the name Shin. He was raised as a grandson by Merlin and soaked up Merlin's teachings, earning him some shocking powers; however, when he became 15, his grandfather Merlin said, I forgot to teach him common sense!"},
            {"Fear the Walking Dead","https://fanart.tv/fanart/tv/290853/tvposter/fear-the-walking-dead-55e16cb8aabd2.jpg","What did the world look like as it was transforming into the horrifying apocalypse depicted in he Walking Dead? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question."},
            {"Bleach","https://fanart.tv/fanart/tv/74796/tvposter/bleach-53c591ac35f9a.jpg","For as long as he can remember, Ichigo Kurosaki has been able to see ghosts. But when he meets Rukia, a Soul Reaper who battles evil spirits known as Hollows, he finds his life is changed forever. Now, with a newfound wealth of spiritual energy, Ichigo discovers his true calling: to protect the living and the dead from evil."},
            {"Supergirl","https://i1.wp.com/i.pinimg.com/736x/3b/92/0d/3b920de461abbc7f3255677950841bf3--chloe-grace-moretz-funny-chloë-grace-moretz.jpg","Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism."},
            {"Hawaii Five-0 ","https://static.tvgcdn.net/feed/1/350/thumbs/118567350_1300x1733.jpg","Steve McGarrett returns home to Oahu, in order to find his father's killer. The governor offers him the chance to run his own task force (Five-0). Steve's team is joined by Chin Ho Kelly, Danny Danno Williams, and Kono Kalakaua."}
    };

    public static ArrayList<TvShow> getListDataTvShow() {
        ArrayList<TvShow> listData = new ArrayList<>();
        for (String[] aData : dataTvShow) {
            TvShow tvShow = new TvShow();
            tvShow.setTitle(aData[0]);
            tvShow.setPoster(aData[1]);
            tvShow.setDescription(aData[2]);

            listData.add(tvShow);
        }
        return listData;
    }
}
