package ble.com.kamilsklep;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.util.List;
/**
 * Created by student on 04.11.2016.
 */
public class Adapter extends ArrayAdapter {
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
        Produkt produkt = (Produkt) getItem(position);


        //
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        txtTitle.setText(produkt.title);

        // show image
        ImageView img = (ImageView)convertView.findViewById(R.id.image);

        // download image
        ImageDownloader imageDownloader = new ImageDownloader();
        imageDownloader.download(produkt.img_url, img);

        return convertView;
    }
}
