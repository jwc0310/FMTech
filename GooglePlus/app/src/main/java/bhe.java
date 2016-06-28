import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.activitylog.impl.ActivityLogActivity;

public class bhe
{
  public final Intent a;
  
  public bhe(bhm parambhm, Context paramContext)
  {
    this.a = new Intent(paramContext, ActivityLogActivity.class);
  }
  
  public Intent a()
  {
    if (!this.a.hasExtra("account_id")) {
      throw new IllegalStateException();
    }
    return this.a;
  }
  
  public bhe a(int paramInt)
  {
    this.a.putExtra("account_id", paramInt);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bhe
 * JD-Core Version:    0.7.0.1
 */