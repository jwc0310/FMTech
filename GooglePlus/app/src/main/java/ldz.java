import android.content.Context;
import android.os.Bundle;

public final class ldz
  implements kyu
{
  public ldz(Context paramContext) {}
  
  public final bj a(String paramString1, String paramString2)
  {
    return ldy.a(paramString1, paramString2);
  }
  
  public final bj a(String paramString1, String paramString2, String paramString3)
  {
    ldu localldu = new ldu();
    Bundle localBundle = new Bundle();
    localBundle.putString("gaia_id", paramString1);
    localBundle.putString("square_id", paramString2);
    localBundle.putString("activity_id", paramString3);
    localldu.f(localBundle);
    return localldu;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldz
 * JD-Core Version:    0.7.0.1
 */