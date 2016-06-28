import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.phone.HomeActivity;

public final class dbh
{
  public Intent a;
  
  public dbh(Context paramContext)
  {
    this.a = new Intent(paramContext, HomeActivity.class);
    this.a.setAction("android.intent.action.VIEW");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbh
 * JD-Core Version:    0.7.0.1
 */