import com.google.android.gms.common.ConnectionResult;

public final class eij
  extends eic
{
  public eij(eib parameib)
  {
    super(parameib, 0, null);
  }
  
  protected final void a(ConnectionResult paramConnectionResult)
  {
    eib.a(this.c).a(paramConnectionResult);
    this.c.a(paramConnectionResult);
  }
  
  protected final boolean a()
  {
    eib.a(this.c).a(ConnectionResult.a);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eij
 * JD-Core Version:    0.7.0.1
 */