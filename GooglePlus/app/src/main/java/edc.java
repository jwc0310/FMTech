import java.util.Map;

final class edc
  implements Runnable
{
  edc(edk paramedk, ecx paramecx, String paramString1, String paramString2) {}
  
  public final void run()
  {
    synchronized (ecx.d(this.a))
    {
      ebu localebu = (ebu)ecx.d(this.a).get(this.b);
      if (localebu != null)
      {
        ecx.e(this.a);
        localebu.a(this.b, this.c);
        return;
      }
    }
    edm localedm = ecx.a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b;
    localedm.a("Discarded message for unknown namespace '%s'", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edc
 * JD-Core Version:    0.7.0.1
 */