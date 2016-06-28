import android.text.TextUtils;

final class lhf
  implements Runnable
{
  lhf(lhe paramlhe) {}
  
  public final void run()
  {
    lhe locallhe = this.a;
    lhh locallhh = (lhh)locallhe.b.b(locallhe.h);
    if ((locallhh != null) && (locallhh.m) && (!TextUtils.equals(locallhh.h, locallhe.i.b)))
    {
      locallhe.d = true;
      locallhe.b.b(locallhe.h, null, locallhe);
      locallhe.d();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhf
 * JD-Core Version:    0.7.0.1
 */