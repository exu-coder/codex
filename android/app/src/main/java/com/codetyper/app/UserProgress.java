package com.codetyper.app;
import android.content.*; import com.google.gson.Gson;
public class UserProgress { public int xp=0, level=1, hearts=5, streak=0; public java.util.HashSet<String> completed=new java.util.HashSet<>();
 static final String KEY="progress"; static UserProgress load(Context c){ String s=c.getSharedPreferences("codetyper",0).getString(KEY,null); return s==null?new UserProgress():new Gson().fromJson(s,UserProgress.class); }
 void save(Context c){ c.getSharedPreferences("codetyper",0).edit().putString(KEY,new Gson().toJson(this)).apply(); }
}
