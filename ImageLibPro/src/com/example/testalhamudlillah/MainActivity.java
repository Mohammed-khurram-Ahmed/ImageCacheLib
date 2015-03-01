package com.example.testalhamudlillah;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;

public class MainActivity extends FragmentActivity {

	FragmentActivity activity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		activity = MainActivity.this;

		// ImageUtility imageUtility = ImageUtility.getInstanc(activity,
		// Storage.DISK);
		// imageUtility.loadImage("https://lh4.googleusercontent.com/-WIuWgVcU3Qw/URqubRVcj4I/AAAAAAAAAbs/YvbwgGjwdIQ/s1024/Antelope%252520Walls.jpg",
		// imageView);

		ArrayList<ItemDetails> image_details = GetSearchResults();

		final ListView lv1 = (ListView) findViewById(R.id.list);

		lv1.setAdapter(new ItemListBaseAdapter(this, image_details));
	}

	private ArrayList<ItemDetails> GetSearchResults() {
		ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
		ItemDetails item_details = new ItemDetails();
		item_details.setName("Pizza");
		item_details.setItemDescription("Spicy Chiken Pizza");
		item_details.setPrice("RS 310.00");
		item_details.setImageNumber("http://blog.reducedata.com/wp-content/uploads/2014/09/mobile1.jpg");
		results.add(item_details);

		item_details = new ItemDetails();
		item_details.setName("Burger");
		item_details.setItemDescription("Beef Burger");
		item_details.setPrice("RS 350.00");
		item_details.setImageNumber("http://www.contentcrossroads.com/wp-content/uploads/2012/10/mobile-social-network1.jpg");
		results.add(item_details);

		item_details = new ItemDetails();
		item_details.setName("Pizza");
		item_details.setItemDescription("Chiken Pizza");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://cloudxtension.com/wp-content/uploads/2014/10/mobile-app-development.jpg");
		results.add(item_details);

		item_details = new ItemDetails();
		item_details.setName("Burger");
		item_details.setItemDescription("Chicken Burger");
		item_details.setPrice("RS 350.00");
		item_details.setImageNumber("http://cdn2.gsmarena.com/vv/pics/t-mobile//T-Mobile-Comet-1.jpg");
		results.add(item_details);

		item_details = new ItemDetails();
		item_details.setName("Burger");
		item_details.setItemDescription("Fish Burger");
		item_details.setPrice("RS 310.00");
		item_details.setImageNumber("http://www.picturesnew.com/media/images/mobile-samsung.jpg");
		results.add(item_details);

		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://3.imimg.com/data3/JH/TI/MY-2976685/samsung-mobile-bulk-dealer-250x250.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://gdj.gdj.netdna-cdn.com/wp-content/uploads/2013/06/Flat-Mobile-UI-Design-29-3.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://www.telecomb2b.com/uploadedimages/5749Nokia%20mobile.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://www.contactvirginmedia.com/wp-content/uploads/2013/05/virgin-media-mobile.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://imshopping.rediff.com/imgshop/800-1280/shopping/pixs/14132/f/f51._fly-f51-android-mobile-with-5-inch.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://www.mytokri.com/images/samsung-galaxy-core-i8262-mobile-phone-white-rs-11913-from-tradus.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://www.janparivartan.com/images/mobtouch.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://www.upsidelearning.com/blog/wp-content/uploads/2013/03/mobile-learning-third-dimension.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://img-d01.moneycontrol.co.in/news_image_files/2012/m/mobile.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://www.sweeneypr.com/wp-content/uploads/2013/08/How-to-test-mobile-apps2.png");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("https://leanplum-wordpress.storage.googleapis.com/mobiletrends.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://purplechai.com/wp-content/uploads/2014/12/mobile-apps.jpg");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("https://fbcdn-dragon-a.akamaihd.net/hphotos-ak-xpa1/t39.2178-6/851561_586455481373764_1553052646_n.png");
		results.add(item_details);
		item_details = new ItemDetails();
		item_details.setName("Mango");
		item_details.setItemDescription("Mango Juice");
		item_details.setPrice("RS 250.00");
		item_details.setImageNumber("http://www.emc.com/apps/images/documentum-mobile-app-image1.jpg");
		results.add(item_details);

		return results;
	}

}
