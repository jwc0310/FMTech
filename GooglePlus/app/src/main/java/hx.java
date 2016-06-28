import android.os.Bundle;
import android.os.Message;
import java.util.List;

final class hx
  extends hp
{
  hx(hv paramhv) {}
  
  public final void a()
  {
    this.a.b.obtainMessage(8, null).sendToTarget();
  }
  
  public final void a(Bundle paramBundle)
  {
    this.a.b.obtainMessage(7, paramBundle).sendToTarget();
  }
  
  public final void a(hh paramhh)
  {
    this.a.b.obtainMessage(3, paramhh).sendToTarget();
  }
  
  public final void a(ip paramip)
  {
    ib localib = null;
    if (paramip != null) {
      localib = new ib(paramip.a, paramip.b, paramip.c, paramip.d, paramip.e);
    }
    this.a.b.obtainMessage(4, localib).sendToTarget();
  }
  
  public final void a(ir paramir)
  {
    this.a.b.obtainMessage(2, paramir).sendToTarget();
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.a.b.obtainMessage(6, paramCharSequence).sendToTarget();
  }
  
  public final void a(String paramString, Bundle paramBundle)
  {
    this.a.b.obtainMessage(1, paramString).sendToTarget();
  }
  
  public final void a(List<ij> paramList)
  {
    this.a.b.obtainMessage(5, paramList).sendToTarget();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hx
 * JD-Core Version:    0.7.0.1
 */