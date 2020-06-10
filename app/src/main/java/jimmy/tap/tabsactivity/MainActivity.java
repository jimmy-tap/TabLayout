package jimmy.tap.tabsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    boolean isZero, isTransparent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab mobileTab = tabLayout.getTabAt(0);
        ImageView firstImage = mobileTab.getCustomView().findViewById(R.id.first_image);
        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor();
            }
        });
    }

    public void changeColor() {
        if (isTransparent)
            tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        else
            tabLayout.setSelectedTabIndicatorColor(Color.TRANSPARENT);
        isTransparent = !isTransparent;
    }
}
