import com.google.android.gms.common.ConnectionResult;

public final class eih
  implements efh
{
  public eih(eib parameib) {}
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    int i;
    if (paramConnectionResult.c == 0)
    {
      i = 1;
      if (i == 0) {
        break label34;
      }
      this.a.a(null, eib.d(this.a));
    }
    label34:
    while (eib.e(this.a) == null)
    {
      return;
      i = 0;
      break;
    }
    eib.e(this.a).a(paramConnectionResult);
  }
  
  public final void b(ConnectionResult paramConnectionResult)
  {
    throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eih
 * JD-Core Version:    0.7.0.1
 */