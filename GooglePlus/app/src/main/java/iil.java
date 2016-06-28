import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;

public final class iil
  implements jpd
{
  @TargetApi(23)
  public final int a(Context paramContext, String paramString)
  {
    return paramContext.checkSelfPermission(paramString);
  }
  
  @TargetApi(23)
  public final void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    paramActivity.requestPermissions(paramArrayOfString, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iil
 * JD-Core Version:    0.7.0.1
 */