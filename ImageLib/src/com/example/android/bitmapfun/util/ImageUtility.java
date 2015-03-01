package com.example.android.bitmapfun.util;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;

/**
 * Singleton class
 * 
 */
public class ImageUtility {
	private static ImageUtility imageUtility = new ImageUtility();

	private static ImageFetcher mImageFetcher;
	private static final String IMAGE_CACHE_DIR = "images";
	public static final String EXTRA_IMAGE = "extra_image";
	
	 /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	private ImageUtility() {
	}

	/**
	 * Object can create only from factory Instance method
	 * 
	 * @return the object
	 */
	public static ImageUtility getInstanc(FragmentActivity activity, Storage storge) {
		Log.e("TAG", "GetInstance");

		if (storge.equals(Storage.DISK)) {
			Log.e("TAG", "DISK");
			createObjectDisk(activity);
			return imageUtility;
		} else {
			Log.e("TAG", "MEM");
			createObjectMem(activity);
			return imageUtility;
		}

	}

	private static ImageUtility createObjectDisk(FragmentActivity activity) {
		// Fetch screen height and width, to use as our max size when loading
		// images as this
		// activity runs full screen
		final DisplayMetrics displayMetrics = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		final int height = displayMetrics.heightPixels;
		final int width = displayMetrics.widthPixels;

		// For this sample we'll use half of the longest width to resize our
		// images. As the
		// image scaling ensures the image is larger than this, we should be
		// left with a
		// resolution that is appropriate for both portrait and landscape. For
		// best image quality
		// we shouldn't divide by 2, but this will use more memory and require a
		// larger memory
		// cache.
		final int longest = (height > width ? height : width) / 2;

		ImageCache.ImageCacheParams cacheParams = new ImageCache.ImageCacheParams(activity, IMAGE_CACHE_DIR);
		cacheParams.setMemCacheSizePercent(0.25f); // Set memory cache to 25% of
													// app memory

		// The ImageFetcher takes care of loading images into our ImageView
		// children asynchronously
		mImageFetcher = new ImageFetcher(activity, longest);
		mImageFetcher.addImageCache(activity, EXTRA_IMAGE);
		mImageFetcher.setImageFadeIn(false);
		return null;
	}

	private static ImageUtility createObjectMem(Activity activity) {
		return null;
	}

	public void loadImage(String url,ImageView imageView ){
		mImageFetcher.loadImage(url, imageView);
	}

}
