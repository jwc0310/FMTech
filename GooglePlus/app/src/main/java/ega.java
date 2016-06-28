import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

final class ega
  extends ejd
{
  private final WeakReference<efw> a;
  
  ega(efw paramefw)
  {
    this.a = new WeakReference(paramefw);
  }
  
  public final void a(ResolveAccountResponse paramResolveAccountResponse)
  {
    efw localefw = (efw)this.a.get();
    if (localefw == null) {
      return;
    }
    localefw.a.a(new egb(this, localefw, localefw, paramResolveAccountResponse));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ega
 * JD-Core Version:    0.7.0.1
 */