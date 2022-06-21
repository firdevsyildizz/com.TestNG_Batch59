package tests.Projecalisma;

import org.testng.annotations.Test;
import pages.US2;
import utilities.ConfigReader;
import utilities.Driver;

public class US002 {
    US2 US2;

    @Test
    public void kutular() throws InterruptedException {
        US2 = new US2();
        //Vendor sign in, Vendor olarak Sign in yapılabilmeli
        US2 US2 = new US2();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

//1- Siparisler yazisi gozukmeli
//2- Indirimler yazisi gozukmeli
//3- Adresler yazisi gozukmeli
//4-Hesap detaylari gozukmeli
//5-Favorilerim yazisi gozukmeli
//6-Cikis yazisi gozukmeli


        // Vendor olarak email ve şifre girilmeli ve sistemde My Accout görünmeli
        //Orders, Downloads, addresses, account details,whislist ve Logout gorulmeli
        // Dashboard altında ise; Store manager, orders, downloads, addresses , account details, appointments, wishlist
        // Support tickets, followings ve log out olmali
    }
}
