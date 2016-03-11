package com.test.listviewtest;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
/*
	private String[] data = {"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
 */
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initFruits();
		FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item,fruitList);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		Button buttonsunny = (Button)findViewById(R.id.button_sunny);
		
		listView.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id)
			{
				Fruit fruit = fruitList.get(position);
				String fruitname = fruit.getName();

				if(fruitname.equals("Sunny"))
				{
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,SunnyActivity.class);
						startActivity(intent);
				}
				if(fruitname.equals("Cloudy"))
				{
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,CloudyActivity.class);
						startActivity(intent);
				}
			    if(fruitname.equals("Gloomy"))
			    {
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,GloomyActivity.class);
						startActivity(intent);
			    }
			    if(fruitname.equals("Drizzle"))
			    {
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,DrizzleActivity.class);
						startActivity(intent);
			    }
			    if(fruitname.equals("Stormy"))
			    {
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,StormyActivity.class);
						startActivity(intent);
			    }
			    if(fruitname.equals("Sleety"))
			    {
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,SleetyActivity.class);
						startActivity(intent);
			    }
			    if(fruitname.equals("Shower"))
			    {
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,ShowerActivity.class);
						startActivity(intent);
			    }
			    if(fruitname.equals("Pour"))
			    {
						Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
						Intent intent = new Intent(MainActivity.this,PourActivity.class);
						startActivity(intent); 
			    }
				/*
				Fruit fruit = fruitList.get(position);
				Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(MainActivity.this,SunnyActivity.class);
				startActivity(intent);*/
			}
		});
	}
	
	private void initFruits()
	{
		Fruit Sunny = new Fruit("Sunny",R.drawable.sunny);
		fruitList.add(Sunny);
		Fruit Cloudy = new Fruit("Cloudy",R.drawable.cloudy);
		fruitList.add(Cloudy);
		Fruit Gloomy = new Fruit("Gloomy",R.drawable.gloomy); 
		fruitList.add(Gloomy);
		Fruit Drizzle = new Fruit("Drizzle",R.drawable.drizzle);
		fruitList.add(Drizzle);
		Fruit Stormy = new Fruit("Stormy",R.drawable.stromy);
		fruitList.add(Stormy);
		Fruit Sleety = new Fruit("Sleety",R.drawable.sleety);
		fruitList.add(Sleety);
		Fruit Shower = new Fruit("Shower",R.drawable.shower);
		fruitList.add(Shower);
		Fruit Snow = new Fruit("Pour",R.drawable.snow);
		fruitList.add(Snow);
	}
	
	/**
	 * ÷ÿ–¥Menu∑Ω∑®
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch(item.getItemId())
		{
		case R.id.add_item:
			Toast.makeText(this,"You clicked Add!", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked Remove!",Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}	
}
