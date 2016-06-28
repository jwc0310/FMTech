import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class eik
  extends eic
{
  public eik(eib parameib, int paramInt, Bundle paramBundle)
  {
    super(parameib, paramInt, paramBundle);
  }
  
  protected final void a(ConnectionResult paramConnectionResult)
  {
    eib.a(this.c).b(paramConnectionResult);
    this.c.a(paramConnectionResult);
  }
  
  protected final boolean a()
  {
    eib.a(this.c).b(ConnectionResult.a);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eik
 * JD-Core Version:    0.7.0.1
 */