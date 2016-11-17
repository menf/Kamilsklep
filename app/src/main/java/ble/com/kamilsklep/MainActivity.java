package ble.com.kamilsklep;

import android.os.Bundle;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    List products;
    ListView lvProducts;
    TextView pole;
    ImageView podglad;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // populate data
        products = new ArrayList();
        products.add(new Produkt(R.string.brazowa, R.drawable.brazowa, R.string.brazowa_opis));
        products.add(new Produkt(R.string.czerwona,R.drawable.czerwona, R.string.czerwona_opis));
        products.add(new Produkt(R.string.niebieska,R.drawable.niebieska, R.string.niebieska_opis));
        products.add(new Produkt(R.string.zielona,R.drawable.zielona, R.string.zielona_opis));
        products.add(new Produkt(R.string.zolta,R.drawable.zolta, R.string.zolta_opis));




        //
        podglad = (ImageView) findViewById(R.id.imageView);
        lvProducts = (ListView) findViewById( R.id.list_products);
        pole = (TextView) findViewById(R.id.textView4);
        lvProducts.setAdapter(new Adapter(this, products) );
        lvProducts.setClickable(true);
        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Produkt product =(Produkt) lvProducts.getItemAtPosition(position);
                // Toast.makeText(getApplicationContext(),product.getDesc(),Toast.LENGTH_LONG).show();
                pole.setText(product.getDesc());
                podglad.setImageResource(product.img_url);
            }
        });
    }






}