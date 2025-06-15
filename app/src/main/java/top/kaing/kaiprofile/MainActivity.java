package top.kaing.kaiprofile;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Switch Age, Blog, Stacks, Hobbies, Country;
        TextView age, blog, stacks, hobbies, country;
        Age = findViewById(R.id.switch1);
        Blog = findViewById(R.id.switch2);
        Stacks = findViewById(R.id.switch3);
        Hobbies = findViewById(R.id.switch4);
        Country = findViewById(R.id.switch5);

        age = findViewById(R.id.textView1);
        blog = findViewById(R.id.textView2);
        stacks = findViewById(R.id.textView3);
        hobbies = findViewById(R.id.textView4);
        country = findViewById(R.id.textView5);

        Age.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    age.setText("17 years old");
                }
                else age.setText(R.string.ElseSwitch);
            }

        });
        Blog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    blog.setText("Kaing.top");
                }
                else blog.setText(R.string.ElseSwitch);
            }

        });
        Stacks.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    stacks.setText("Cpp, Java, Python, ESE, Web, etc");
                }
                else stacks.setText(R.string.ElseSwitch);
            }

        });
        Hobbies.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    hobbies.setText("Program, Physics, Literature, etc");
                }
                else hobbies.setText(R.string.ElseSwitch);
            }

        });
        Country.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    country.setText("China");
                }
                else country.setText(R.string.ElseSwitch);
            }

        });
    }
}