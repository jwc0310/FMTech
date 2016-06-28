import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public final class kfk
{
  Activity a;
  kfb b;
  public PreferenceScreen c;
  List<kfm> d;
  List<kfl> e;
  public List<DialogInterface> f;
  public kfn g;
  private Context h;
  private long i = 0L;
  private int j;
  private SharedPreferences k;
  private String l;
  
  public kfk(Activity paramActivity, int paramInt)
  {
    this.a = paramActivity;
    this.j = 100;
    this.h = paramActivity;
    this.l = String.valueOf(paramActivity.getPackageName()).concat("_preferences");
    this.k = null;
  }
  
  final long a()
  {
    try
    {
      long l1 = this.i;
      this.i = (1L + l1);
      return l1;
    }
    finally {}
  }
  
  public final PreferenceScreen a(Context paramContext)
  {
    PreferenceScreen localPreferenceScreen = new PreferenceScreen(paramContext, null);
    localPreferenceScreen.a(this);
    return localPreferenceScreen;
  }
  
  public final SharedPreferences b()
  {
    if (this.k == null) {
      this.k = this.h.getSharedPreferences(this.l, 0);
    }
    return this.k;
  }
  
  final int c()
  {
    try
    {
      int m = this.j;
      this.j = (m + 1);
      return m;
    }
    finally {}
  }
  
  final void d()
  {
    try
    {
      if (this.f == null) {
        return;
      }
      ArrayList localArrayList = new ArrayList(this.f);
      this.f.clear();
      for (int m = -1 + localArrayList.size(); m >= 0; m--) {
        ((DialogInterface)localArrayList.get(m)).dismiss();
      }
      return;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfk
 * JD-Core Version:    0.7.0.1
 */