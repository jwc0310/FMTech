import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;

final class efy
  extends fok
{
  private final WeakReference<efw> a;
  
  efy(efw paramefw)
  {
    this.a = new WeakReference(paramefw);
  }
  
  public final void a(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult)
  {
    efw localefw = (efw)this.a.get();
    if (localefw == null) {
      return;
    }
    localefw.a.a(new efz(this, localefw, localefw, paramConnectionResult));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efy
 * JD-Core Version:    0.7.0.1
 */