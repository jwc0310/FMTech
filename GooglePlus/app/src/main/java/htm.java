import android.content.Context;
import android.content.SharedPreferences;

final class htm
{
  SharedPreferences a;
  
  public htm(Context paramContext)
  {
    this.a = paramContext.getSharedPreferences("app_info_shared_prefs", 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htm
 * JD-Core Version:    0.7.0.1
 */