package UserFactory;

import Google_Search.GooglePom;

/**
 * Created by santiago on 11/04/18.
 */
 class Admin implements User{

    @Override
    public void verify(GooglePom page){

        page.sendTextToSearch("This is an admin looking in google");
    }
}
