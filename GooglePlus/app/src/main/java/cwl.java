import android.content.Context;
import android.content.SharedPreferences;

public final class cwl
  implements jes
{
  public final int a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    if ((((hyi)mbb.a(paramContext, hyi.class)).b(bwb.q, paramInt)) && (paramBoolean) && (!paramContext.getSharedPreferences("accounts", 0).getBoolean("arkham_warm_welcome_shown", false))) {
      return jet.a;
    }
    return jet.b;
  }
  
  public final bk a()
  {
    return new dgq();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwl
 * JD-Core Version:    0.7.0.1
 */