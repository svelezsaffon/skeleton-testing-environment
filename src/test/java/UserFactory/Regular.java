package UserFactory;

import Google_Search.GooglePom;

/**
 * Created by santiago on 11/04/18.
 */
class Regular implements User{

    @Override
    public void verify(GooglePom page){

        page.sendTextToSearch("This is a regular user visiting google");
    }

}

