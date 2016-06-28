import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class htg
  extends mca
{
  List<hta> a;
  Bundle b;
  private htm c;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LinearLayout localLinearLayout = (LinearLayout)paramLayoutInflater.inflate(efj.Kj, paramViewGroup, false);
    RecyclerView localRecyclerView = (RecyclerView)localLinearLayout.findViewById(aau.zK);
    localRecyclerView.a(new aew(this.bn));
    localRecyclerView.a(new htj(this, this.a));
    ((Button)localLinearLayout.findViewById(aau.zM)).setOnClickListener(new hth(this));
    return localLinearLayout;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.c = new htm(this.bn);
    Set localSet = this.c.a.getStringSet("app_info_bundle_key", new HashSet());
    Bundle localBundle = new Bundle();
    if (localSet != null)
    {
      Iterator localIterator = localSet.iterator();
      while (localIterator.hasNext()) {
        localBundle.putBoolean((String)localIterator.next(), true);
      }
    }
    this.b = localBundle;
    this.a = this.bo.c(hta.class);
    Collections.sort(this.a, new htb());
  }
  
  public final void q_()
  {
    super.q_();
    htm localhtm = this.c;
    Bundle localBundle = this.b;
    localhtm.a.edit().putStringSet("app_info_bundle_key", localBundle.keySet()).apply();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htg
 * JD-Core Version:    0.7.0.1
 */