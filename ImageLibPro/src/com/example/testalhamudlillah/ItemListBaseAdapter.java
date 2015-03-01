package com.example.testalhamudlillah;

import java.util.ArrayList;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.bitmapfun.util.ImageUtility;
import com.example.android.bitmapfun.util.Storage;

public class ItemListBaseAdapter extends BaseAdapter {
	 private static ArrayList<ItemDetails> itemDetailsrrayList;
	 ImageUtility imageUtility;
	
	 
	 private LayoutInflater l_Inflater;

	 public ItemListBaseAdapter(FragmentActivity activity, ArrayList<ItemDetails> results) {
	  itemDetailsrrayList = results;
	  l_Inflater = LayoutInflater.from(activity);
	  
	   imageUtility = ImageUtility.getInstanc(activity,
				Storage.DISK);
	 }

	 public int getCount() {
	  return itemDetailsrrayList.size();
	 }

	 public Object getItem(int position) {
	  return itemDetailsrrayList.get(position);
	 }

	 public long getItemId(int position) {
	  return position;
	 }

	 public View getView(int position, View convertView, ViewGroup parent) {
	  ViewHolder holder;
	  if (convertView == null) {
	   convertView = l_Inflater.inflate(R.layout.view_item_list, null);
	   holder = new ViewHolder();
	   holder.txt_itemName = (TextView) convertView.findViewById(R.id.name);
	   holder.txt_itemDescription = (TextView) convertView.findViewById(R.id.itemDescription);
	   holder.txt_itemPrice = (TextView) convertView.findViewById(R.id.price);
	   holder.itemImage = (ImageView) convertView.findViewById(R.id.photo);

	   convertView.setTag(holder);
	  } else {
	   holder = (ViewHolder) convertView.getTag();
	  }
	  
	  holder.txt_itemName.setText(itemDetailsrrayList.get(position).getName());
	  holder.txt_itemDescription.setText(itemDetailsrrayList.get(position).getItemDescription());
	  holder.txt_itemPrice.setText(itemDetailsrrayList.get(position).getPrice());
	  imageUtility.loadImage(itemDetailsrrayList.get(position).getImageNumber(),holder.itemImage);

	  return convertView;
	 }

	 static class ViewHolder {
	  TextView txt_itemName;
	  TextView txt_itemDescription;
	  TextView txt_itemPrice;
	  ImageView itemImage;
	 }
	}