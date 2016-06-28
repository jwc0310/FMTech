import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.HashMap;

final class cfr
  extends ci
{
  private final HashMap<Integer, Bundle> b;
  
  public cfr(bw parambw, HashMap<Integer, Bundle> paramHashMap)
  {
    super(paramHashMap);
    Object localObject;
    this.b = localObject;
  }
  
  public final bk a(int paramInt)
  {
    Bundle localBundle;
    Object localObject;
    if (this.c.f().getIntent().getExtras() != null)
    {
      localBundle = new Bundle(this.c.f().getIntent().getExtras());
      localBundle.putInt("account_id", this.c.am.c());
      localBundle.putBoolean("ActionBarFragmentMixin.Enabled", false);
      localBundle.putBoolean("external", this.c.aD);
      localBundle.putBoolean("is_for_get_content", this.c.aE);
      localBundle.putBoolean("force_return_edit_list", this.c.aF);
      localBundle.putInt("filter", this.c.aC);
      localBundle.putInt("photo_picker_mode", this.c.aA.b);
      localBundle.putBoolean("external", this.c.aD);
      localBundle.putString("get_content_action", this.c.F());
      localBundle.putBoolean("show_promos", this.c.m.getBoolean("show_promos"));
      localBundle.putBoolean("show_autobackup_status", this.c.m.getBoolean("show_autobackup_status"));
      localBundle.putBoolean("finish_on_back", this.c.m.getBoolean("finish_on_back"));
      int i = cfp.a(this.c, paramInt);
      if ((this.b != null) && (this.b.containsKey(Integer.valueOf(i)))) {
        localBundle.putAll((Bundle)this.b.get(Integer.valueOf(i)));
      }
      switch (i)
      {
      default: 
        localObject = null;
      }
    }
    for (;;)
    {
      if (localObject != null) {
        ((bk)localObject).f(localBundle);
      }
      return localObject;
      localBundle = new Bundle();
      break;
      localObject = new cbj();
      localBundle.putInt("mode", 1);
      localBundle.putParcelable("scroll_to_uri", this.c.b);
      continue;
      localObject = new cbj();
      localBundle.putBoolean("trim_remote", true);
      if (!this.c.am.e())
      {
        localBundle.putInt("mode", 2);
        continue;
        localObject = new cbf();
        continue;
        localObject = new cey();
        localBundle.putString("query", "#videos");
        localBundle.putBoolean("hide_search_view", true);
        localBundle.putBoolean("search_local_videos", true);
        continue;
        if (this.c.am.e())
        {
          localObject = new caz();
          localBundle.putParcelable("scroll_to_uri", this.c.b);
        }
        else
        {
          localObject = new cbj();
          localBundle.putInt("mode", 1);
          localBundle.putParcelable("scroll_to_uri", this.c.b);
          continue;
          localObject = new cbq();
        }
      }
    }
  }
  
  public final int b()
  {
    return this.c.a;
  }
  
  public final CharSequence b(int paramInt)
  {
    int i = aau.og;
    switch (this.c.d(paramInt))
    {
    }
    for (;;)
    {
      return this.c.g().getString(i).toUpperCase();
      i = aau.cA;
      continue;
      i = aau.cC;
      continue;
      i = aau.od;
      continue;
      i = aau.oi;
      continue;
      i = aau.cz;
      continue;
      i = aau.cB;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfr
 * JD-Core Version:    0.7.0.1
 */