import android.content.Context;
import android.os.Bundle;

public final class kqy
{
  private static final String a = Integer.toString(efj.Vv);
  private static final String b = Integer.toString(efj.Vw);
  
  public static String a(Bundle paramBundle)
  {
    if (!paramBundle.containsKey(a)) {
      throw new IllegalStateException("AccountName is not populated for this bundle");
    }
    return paramBundle.getString(a);
  }
  
  public static void a(Context paramContext, Bundle paramBundle)
  {
    if (!paramBundle.containsKey(b)) {
      paramBundle.putInt(b, mbb.a(paramContext, "com.google.android.libraries.social.appid", 300));
    }
  }
  
  public static void a(Context paramContext, gwv paramgwv, Bundle paramBundle)
  {
    if (!paramBundle.containsKey(a))
    {
      gwx localgwx = (gwx)mbb.a(paramContext, gwx.class);
      paramBundle.putString(a, paramgwv.a(paramContext, localgwx));
    }
  }
  
  public static void a(Bundle paramBundle, int paramInt)
  {
    if (!paramBundle.containsKey(b)) {
      paramBundle.putInt(b, paramInt);
    }
  }
  
  public static void a(Bundle paramBundle, String paramString)
  {
    if (!paramBundle.containsKey(a)) {
      paramBundle.putString(a, null);
    }
  }
  
  public static int b(Bundle paramBundle)
  {
    if (!paramBundle.containsKey(b)) {
      throw new IllegalStateException("AppId is not populated for this bundle");
    }
    return paramBundle.getInt(b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqy
 * JD-Core Version:    0.7.0.1
 */