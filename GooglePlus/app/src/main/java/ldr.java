import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.social.squares.impl.search.SquareSearchActivity;

public final class ldr
  implements kyj
{
  public final Intent a(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, null);
  }
  
  public final Intent a(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, SquareSearchActivity.class);
    localIntent.putExtra("account_id", paramInt);
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.putExtra("query", paramString);
    }
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldr
 * JD-Core Version:    0.7.0.1
 */