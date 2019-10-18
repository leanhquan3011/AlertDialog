package leanhquan.laq.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnAlertDialog = findViewById(R.id.AlertDialog);
        mBtnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Muon gi?");
             //   alert.setMessage("Xac thuc"); // message or checkbox
                alert.setIcon(R.mipmap.ic_launcher); // <150
                alert.setCancelable(false);
                //Mutiplechoice
//                String[] arrayAnimal = {"Cat","Dog","Pig","Dophin","Mouse","Clown"};
//                boolean[] arrayChecked = {false,false,false,false,false,false};
//                alert.setMultiChoiceItems(arrayAnimal, arrayChecked, new DialogInterface.OnMultiChoiceClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
//                        if(b)
//                            Toast.makeText(MainActivity.this, "Da check", Toast.LENGTH_SHORT).show();
//                        else
//                            Toast.makeText(MainActivity.this, "Da check", Toast.LENGTH_SHORT).show();
//
//                    }
//                });
                String[] arrayAnimal = {"Cat","Dog","Pig","Dophin","Mouse","Clown"};
                alert.setSingleChoiceItems(arrayAnimal, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });


                alert.show();
            }
        });
    }
}
