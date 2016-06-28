import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class eic
  extends eie<Boolean>
{
  private int c;
  private Bundle d;
  
  protected eic(eib parameib, int paramInt, Bundle paramBundle)
  {
    super(parameib, Boolean.valueOf(true));
    this.c = paramInt;
    this.d = paramBundle;
  }
  
  protected abstract void a(ConnectionResult paramConnectionResult);
  
  protected abstract boolean a();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eic
 * JD-Core Version:    0.7.0.1
 */