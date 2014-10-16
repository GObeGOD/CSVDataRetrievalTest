package com.gobi.DataRetrieval;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends Activity {
	CSVAdapter mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		   ListView mList = (ListView)findViewById(R.id.listView1);
		   
		 mAdapter = new CSVAdapter(this, -1);
		   
		   mList.setAdapter(mAdapter);
           
           
           /*
            * This listener will get a callback whenever the user clicks on a row. 
            * The pos parameter will tell us which row got clicked.
            * 
            * For now we'll just show a Toast with the state capital for the state that was clicked.
            */
           mList.setOnItemClickListener(new OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> parent, View v, int pos,long id) {
                          // Toast.makeText(v.getContext(), mAdapter.getItem(pos).getPost_ID(), Toast.LENGTH_SHORT).show();
                         //String Post_ID;
                           //String Mid_Block_ID;
                           //String Street_1;
                           //String Street_2;
                           //String Street_3;
                       	//String Side;
                       	//String Latitude;
                       	//String Longitude;
                       	//String Core;
                       	//String Notes;
                           String PostId = mAdapter.getItem(pos).getPost_ID() ; 
                           String MidBlockID = mAdapter.getItem(pos).getMid_Block_ID();
                           String Street1 = mAdapter.getItem(pos).getStreet_1();
                           String Street2 = mAdapter.getItem(pos).getStreet_2();
                           String Street3 =  mAdapter.getItem(pos).getStreet_3();
                           String Side   = mAdapter.getItem(pos).getSide();
                           String Latitude =  mAdapter.getItem(pos).getLatitude();
                           String Longitude  =  mAdapter.getItem(pos).getLongitude();
                           String Core   =  mAdapter.getItem(pos).getCore();
                           String Notes   =  mAdapter.getItem(pos).getNotes(); 
                           
                           
                           Intent intent=new Intent(getBaseContext(),InfoActivity.class);
                        //   String username=uname.getText().toString();
                         //  String upaswrd=pass.getText().toString();
                          // Bundle bundle=new Bundle();

                        intent.putExtra("PostIdNM",PostId);
                        intent.putExtra("MidBlockIDNM", MidBlockID);
                        intent.putExtra("Street1NM", Street1);
                        intent.putExtra("Street2NM", Street2);
                        intent.putExtra("Street3NM", Street3);
                        intent.putExtra("SideNM", Side);
                        intent.putExtra("LatitudeNM", Latitude);
                        intent.putExtra("LongitudeNM", Longitude);
                        intent.putExtra("CoreNM", Core);
                        intent.putExtra("NotesNM", Notes);

                        startActivity(intent);
                   }
           });
   }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
