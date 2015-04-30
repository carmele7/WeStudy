package il.ac.huji.westudy;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;


/**
 * Created by LM on 30/04/2015.
 */
public class DataStore {

    final int NOT_FOUND = -1;
    Map<Integer, String> courseMap;
    private static DataStore instance = null;
    protected DataStore() {
        // Exists only to defeat instantiation.
    }
    public static DataStore getInstance() {
        if(instance == null) {
            instance = new DataStore();
        }
        return instance;
    }
    private List<String> loadAssetTextAsString(Context context, String name) {
        BufferedReader in = null;
        try {
            StringBuilder buf = new StringBuilder();
            InputStream is = context.getAssets().open(name);
            in = new BufferedReader(new InputStreamReader(is));
            String str;
            String[] temp;
            boolean isFirst = true;
            while ( (str = in.readLine()) != null ) {
                if (isFirst){
                    isFirst = false;
                    temp = str.split(" ", 2);
                    int courseID = Integer.parseInt(temp[0]);
                    String courseName = temp[1];
                    courseMap.
                 }
                else{
                    buf.append('\n');
                }
                buf.append(str);
            }
            return buf.toString();
        } catch (IOException e) {
            Log.e("TAG", "Error opening asset " + name);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    Log.e("TAG", "Error closing asset " + name);
                }
            }
        }

        return null;
    }
}
