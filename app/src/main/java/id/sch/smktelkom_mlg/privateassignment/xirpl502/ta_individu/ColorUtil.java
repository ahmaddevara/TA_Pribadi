package id.sch.smktelkom_mlg.privateassignment.xirpl502.ta_individu;

/**
 * Created by microsoft on 5/14/2017.
 */
import android.graphics.Color;

import java.util.Random;


public class ColorUtil {
    public static int getRandomColor() {
        Random rnd = new Random();
        //return Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return Color.rgb(rnd.nextInt(192), rnd.nextInt(192), rnd.nextInt(192));
    }
}
