package in.edu.kgec.espektro18;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.StringRequest;

/**
 * Created by Aditya on 16-02-2018.
 */

public class EventView extends CardView {

String head, desc;
int img;

    public EventView(Context context) {
        super(context);
    }

    public EventView(Context context, int imageId, String head, String desc)
    {
        super(context);
        this.desc = desc;
        this.head = head;
        this.img = imageId;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(inflater != null)
            inflater.inflate(R.layout.event_view, this);

        ((ImageView)this.findViewById(R.id.image)).setImageResource(imageId);
        ((TextView)this.findViewById(R.id.eventhead)).setText(head);
        ((TextView)this.findViewById(R.id.eventdetails)).setText(desc);
        setRadius(10f);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(20,30,20,20);
        EventView.this.setLayoutParams(params);
        ViewTreeObserver ob = findViewById(R.id.image).getViewTreeObserver();
        setCardElevation(12f);
        if(ob.isAlive())
        {
            ob.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    EventView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int viewWidth = EventView.this.getWidth();
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(viewWidth, viewWidth);
                    EventView.this.findViewById(R.id.image).setLayoutParams(params);
                }
            });
        }
    }
}
