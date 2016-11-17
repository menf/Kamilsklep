package ble.com.kamilsklep;

/**
 * Created by menf on 2016-11-04.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.util.List;


public class Adapter extends ArrayAdapter<Produkt>{

    List<Produkt> mylist;

    public Adapter(Context _context, List<Produkt> _mylist) {
        super(_context, R.layout.list_item, _mylist);

        this.mylist = _mylist;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = new LinearLayout(getContext());
        String inflater = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater vi = (LayoutInflater)getContext().getSystemService(inflater);
        convertView = vi.inflate(R.layout.list_item, parent, false);


        // Product object
        Produkt product = getItem(position);
        //
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        txtTitle.setText(product.title);

        // show image
        ImageView img = (ImageView)convertView.findViewById(R.id.image);

        // download image
        img.setImageResource(product.img_url);

        return convertView;
    }


}