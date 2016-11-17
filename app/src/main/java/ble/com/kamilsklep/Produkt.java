package ble.com.kamilsklep;

/**
 * Created by menf on 2016-11-04.
 */

public class Produkt{

    public String id;
    public int title;
    public int img_url;
    public int desc;


    public Produkt(int p_title, int p_img_url, int p_desc) {
        title = p_title;
        img_url = p_img_url;
        desc=p_desc;
    }

    public int getDesc() {
        return desc;
    }
}