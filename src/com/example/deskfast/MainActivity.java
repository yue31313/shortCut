package com.example.deskfast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button crateShortcut=(Button)findViewById(R.id.create);
		final Button exit=(Button)findViewById(R.id.exit);
		crateShortcut.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent addIntent=new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
				Parcelable icon=Intent.ShortcutIconResource.fromContext(MainActivity.this,R.drawable.sms);
				Intent myIntent=new Intent(MainActivity.this,MainActivity.class);
				addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "¿ì½Ý·½Ê½");
				addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, icon);
				addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT,myIntent);
				sendBroadcast(addIntent);
			}
		});
		exit.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				System.exit(0);
			}
		});
	}


}
