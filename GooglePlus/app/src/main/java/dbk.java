import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.phone.HomeActivity;

public final class dbk
{
  public Intent a;
  
  public dbk(Context paramContext, int paramInt)
  {
    this.a = new Intent(paramContext, HomeActivity.class);
    this.a.putExtra("destination", 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbk
 * JD-Core Version:    0.7.0.1
 */