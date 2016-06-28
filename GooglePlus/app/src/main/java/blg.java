import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Set;

public final class blg
  extends cun<mzv, mzw>
{
  private final String a;
  private final boolean b;
  
  public blg(Context paramContext, kcg paramkcg, int paramInt)
  {
    super(paramContext, paramkcg, paramInt, "registerdevice", new mzv(), new mzw());
    this.a = paramContext.getSharedPreferences("com.google.android.plus.GCM", 0).getString("regIds", null);
    boolean bool;
    if ((paramContext != null) && (paramInt != -1))
    {
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.plus.GCM", 0);
      String str1 = paramContext.getSharedPreferences("com.google.android.plus.GCM", 0).getString("regIds", null);
      Set localSet = dml.a(localSharedPreferences.getString("destinations", null));
      String str2 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
      if ((!TextUtils.isEmpty(str1)) && (localSet.contains(str2))) {
        bool = true;
      }
    }
    for (;;)
    {
      this.b = bool;
      return;
      bool = false;
      continue;
      bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     blg
 * JD-Core Version:    0.7.0.1
 */