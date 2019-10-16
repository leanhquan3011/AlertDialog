package leanhquan.laq.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Order order = new FastFoodOderBuilder()
                    .orderBread(BreadType.BEEF)
                    .build();
    }
}
