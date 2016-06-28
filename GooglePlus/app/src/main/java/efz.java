import com.google.android.gms.common.ConnectionResult;

final class efz
  extends egq
{
  efz(efy paramefy, egu paramegu, efw paramefw, ConnectionResult paramConnectionResult)
  {
    super(paramegu);
  }
  
  public final void a()
  {
    efw localefw = this.b;
    ConnectionResult localConnectionResult = this.c;
    if (localefw.b(2)) {
      if (localConnectionResult.c != 0) {
        break label36;
      }
    }
    label36:
    for (int i = 1; i != 0; i = 0)
    {
      localefw.h();
      return;
    }
    if (localefw.a(localConnectionResult))
    {
      localefw.i();
      localefw.h();
      return;
    }
    localefw.b(localConnectionResult);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efz
 * JD-Core Version:    0.7.0.1
 */