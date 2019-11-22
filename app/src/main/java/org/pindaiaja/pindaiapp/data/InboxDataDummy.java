package org.pindaiaja.pindaiapp.data;

import org.pindaiaja.pindaiapp.R;
import org.pindaiaja.pindaiapp.model.Inbox;

import java.util.ArrayList;

public class InboxDataDummy {
    public static ArrayList<Inbox> getDummyInbox(){
        ArrayList<Inbox> inboxes = new ArrayList<>();
        inboxes.add(new Inbox(
                "Orlando Bloom",
                "Hello, I am admin",
                "Introduce",
                "20:14",
                R.drawable.man1 ));
        inboxes.add(new Inbox(
                "Joe Russo",
                "To they four in love. Settling you has separate supplied bed. Concluded resembled suspected his resources curiosity joy. Led all cottage met enabled attempt through talking delight. Dare he feet my tell busy. Considered imprudence of he friendship boisterous. \n" +
                        "\n" +
                        "Remember outweigh do he desirous no cheerful. Do of doors water ye guest. We if prosperous comparison middletons at. Park we in lose like at no. An so to preferred convinced distrusts he determine. In musical me my placing clothes comfort pleased hearing. Any residence you satisfied and rapturous certainty two. Procured outweigh as outlived so so. On in bringing graceful proposal blessing of marriage outlived. Son rent face our loud near. ",
                "Love Letter",
                "20:12",
                R.drawable.man2 ));
        inboxes.add(new Inbox(
                "Maria Saraphova",
                "Its had resolving otherwise she contented therefore. Afford relied warmth out sir hearts sister use garden. Men day warmth formed admire former simple. Humanity declared vicinity continue supplied no an. He hastened am no property exercise of. Dissimilar comparison no terminated devonshire no literature on. Say most yet head room such just easy. \n" +
                        "\n" +
                        "Talent she for lively eat led sister. Entrance strongly packages she out rendered get quitting denoting led. Dwelling confined improved it he no doubtful raptures. Several carried through an of up attempt gravity. Situation to be at offending elsewhere distrusts if. Particular use for considered projection cultivated. Worth of do doubt shall it their. Extensive existence up me contained he pronounce do. Excellence inquietude assistance precaution any impression man sufficient. ",
                "Message",
                "19:58",
                R.drawable.woman1 ));
        inboxes.add(new Inbox(
                "Vannessa Hudgens",
                "Do so written as raising parlors spirits mr elderly. Made late in of high left hold. Carried females of up highest calling. Limits marked led silent dining her she far. Sir but elegance marriage dwelling likewise position old pleasure men. Dissimilar themselves simplicity no of contrasted as. Delay great day hours men. Stuff front to do allow to asked he. ",
                "Writing",
                "19:23",
                R.drawable.woman2 ));
        return inboxes;
    }

    public static Inbox getInbox(){
        for(int i = 0; i<getDummyInbox().size();i++){
            Inbox inbox = getDummyInbox().get(i);
            if(inbox != null){
                return inbox;
            }
        }
        return null;
    }
}
