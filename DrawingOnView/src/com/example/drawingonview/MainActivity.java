package com.example.drawingonview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyView(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public class MyView extends View {
    	public MyView (Context context) {
    		super (context);
    		//todo
    	}
    	@Override
    	protected void onDraw (Canvas canvas) {
    		super.onDraw(canvas);
    		int x = getWidth();
    		int y = getHeight();
    		int radius;
    		radius = 100;
    		Paint paint = new Paint();
    		paint.setStyle(Paint.Style.FILL);
    		paint.setColor(Color.BLUE);
    		canvas.drawPaint(paint);
    		
    		paint.setColor(Color.parseColor("#CD5C5C"));
    		canvas.drawCircle(x/2,y/2, radius, paint);
    	}
    }
}
