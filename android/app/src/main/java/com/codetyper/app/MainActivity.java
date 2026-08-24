package com.codetyper.app;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.InputStreamReader;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    ArrayList<Lesson> lessons = new ArrayList<>();
    UserProgress progress;
    @Override public void onCreate(Bundle b) { super.onCreate(b); setContentView(R.layout.activity_main);
        progress = UserProgress.load(this); loadLessons();
        RecyclerView rv=findViewById(R.id.lessons); rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new LessonsAdapter(lessons, progress, l -> { Intent i=new Intent(this,LessonActivity.class); i.putExtra("lesson", new Gson().toJson(l)); startActivity(i); }));
    }
    void loadLessons(){ try { for(int c=1;c<=6;c++){ String n=String.format(Locale.US,"%02d_",c); String file=n+new String[]{"basics","control_flow","functions","data_structures","oop","advanced"}[c-1]+".json"; InputStreamReader r=new InputStreamReader(getAssets().open("lessons/"+file)); List<Lesson> x=new Gson().fromJson(r,new TypeToken<List<Lesson>>(){}.getType()); lessons.addAll(x); r.close(); } } catch(Exception e){ e.printStackTrace(); } }
}
