import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.phone.HomeActivity;

final class day
  implements iwu
{
  day(dax paramdax) {}
  
  public final Intent a(Context paramContext)
  {
    return efj.c(paramContext);
  }
  
  public final Intent a(Context paramContext, int paramInt)
  {
    return efj.g(paramContext, paramInt);
  }
  
  public final Intent a(Context paramContext, int paramInt, String paramString)
  {
    return efj.a(paramContext, paramInt, paramString, null, false);
  }
  
  public final Intent b(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.putExtra("destination", 10);
    return localIntent;
  }
  
  public final Intent b(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.putExtra("destination", 7);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent c(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.putExtra("destination", 9);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent d(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, HomeActivity.class);
    localIntent.putExtra("destination", 4);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent e(Context paramContext, int paramInt)
  {
    return efj.f(paramContext, paramInt);
  }
  
  public final Intent f(Context paramContext, int paramInt)
  {
    return efj.d(paramContext, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     day
 * JD-Core Version:    0.7.0.1
 */