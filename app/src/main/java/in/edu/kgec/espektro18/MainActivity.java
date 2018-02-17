package in.edu.kgec.espektro18;

import android.app.VoiceInteractor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
String events;
boolean searchShown;
TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout lin1, lin2;
        lin1 = findViewById(R.id.in1);
        lin2 = findViewById(R.id.in2);
        searchShown = false;

        lin1.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));
        lin2.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));

        lin1.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));
        lin2.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));

        lin1.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));
        lin2.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));

        lin1.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));
        lin2.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));

        lin1.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));
        lin2.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));

        lin1.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));
        lin2.addView(new EventView(this, R.drawable.onlinecourse8,"random event", "what do you expect?"));


    }

    private void addEvent(String head) {
        events = events + '\n' + head;
        view.setText(events);
        view.refreshDrawableState();
    }

    public void toggleSearch(View view) {
        if(searchShown)
            findViewById(R.id.searchlin).setVisibility(View.GONE);
        else
            findViewById(R.id.searchlin).setVisibility(View.VISIBLE);
        searchShown = !searchShown;
    }
}
