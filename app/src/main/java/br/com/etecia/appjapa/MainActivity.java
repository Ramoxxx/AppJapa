package br.com.etecia.appjapa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

        String nomecomidas [] = {"shushi", "hotRoll"};
        int fotocomidas [] = {R.drawable.shushibonito, R.drawable.sushi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.idComidas);

    }

class CustomAdapter extends BaseAdapter{


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = getLayoutInflater().inflate(R.layout.main2_layout, null);

        return view1;
    }
}



}
