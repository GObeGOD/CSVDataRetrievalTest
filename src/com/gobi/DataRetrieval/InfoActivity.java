package com.gobi.DataRetrieval;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class InfoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);

		TextView PostId = (TextView) findViewById(R.id.Post_ID);
		TextView MidBlockID = (TextView) findViewById(R.id.Mid_Block_ID);
		TextView Street1 = (TextView) findViewById(R.id.Street_1);
		TextView Street2 = (TextView) findViewById(R.id.Street_2);
		TextView Street3 = (TextView) findViewById(R.id.Street_3);
		TextView Side = (TextView) findViewById(R.id.Side);
		TextView Latitude = (TextView) findViewById(R.id.Latitude);
		TextView Longitude = (TextView) findViewById(R.id.Longitude);
		TextView Core = (TextView) findViewById(R.id.Core);
		TextView Notes = (TextView) findViewById(R.id.Notes);

		Intent intent = getIntent();
		String PostIdStr = intent.getStringExtra("PostIdNM");
		String MidBlockIDStr = intent.getStringExtra("MidBlockIDNM");
		String Street1Str = intent.getStringExtra("Street1NM");
		String Street2Str = intent.getStringExtra("Street2NM");
		String Street3Str = intent.getStringExtra("Street3NM");
		String SideStr = intent.getStringExtra("SideNM");
		String LatitudeStr = intent.getStringExtra("LatitudeNM");
		String LongitudeStr = intent.getStringExtra("LongitudeNM");
		String CoreStr = intent.getStringExtra("CoreNM");
		String NotesStr = intent.getStringExtra("NotesNM");
		
	   PostId.setText("Post_ID: "+PostIdStr);
		MidBlockID.setText("Mid_Block_ID: " +MidBlockIDStr);
		Street1.setText("Street_1: "+Street1Str);
		Street2.setText("Street_2: "+Street2Str);
		Street3.setText("Street_3: "+Street3Str);
		Side.setText("Side: "+SideStr);
		Latitude.setText("Latitude: "+LatitudeStr);
		Longitude.setText("Longitude: "+LongitudeStr);
		Core.setText("Core: "+CoreStr);
		Notes.setText("Notes: "+NotesStr);
		
		

		// Log.i("whatever", MidBlockID.toString());
		// PostId.getId();
		// TextView textView = new TextView(this);
		// textView.setTextSize(40);
		// textView.setText(PostId.toString());
		//
		// // Set the text view as the activity layout
		// setContentView(textView);

		//
		// Intent intent = getIntent();
		// String message = intent.getStringExtra();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
