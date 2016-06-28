import com.google.android.gms.common.ConnectionResult;

final class fsq
  implements frs
{
  private final ConnectionResult a;
  
  public fsq(ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult == null) {
      throw new IllegalArgumentException("null connectionResult");
    }
    this.a = paramConnectionResult;
  }
  
  public final boolean a()
  {
    return this.a.c == 0;
  }
  
  public final int b()
  {
    return this.a.c;
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fsq
 * JD-Core Version:    0.7.0.1
 */