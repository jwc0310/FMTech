import android.content.Context;
import android.provider.Settings.Secure;

final class iqx
{
  public static final int a;
  
  static
  {
    if (iqw.a != null)
    {
      String str = Settings.Secure.getString(iqw.a.getContentResolver(), "android_id");
      if (str != null)
      {
        i = Math.abs(str.hashCode());
        if (i != 0) {}
      }
    }
    for (int i = 1;; i = 0)
    {
      a = i;
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqx
 * JD-Core Version:    0.7.0.1
 */