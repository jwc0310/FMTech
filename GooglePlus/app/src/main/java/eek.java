import com.google.android.gms.clearcut.LogEventParcelable;

final class eek
  extends efs
{
  private final LogEventParcelable a;
  
  eek(eeh parameeh, LogEventParcelable paramLogEventParcelable, efd paramefd)
  {
    super(paramefd, (byte)0);
    this.a = paramLogEventParcelable;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof eek)) {
      return false;
    }
    eek localeek = (eek)paramObject;
    return this.a.equals(localeek.a);
  }
  
  public final String toString()
  {
    return "MethodImpl(" + this.a + ")";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eek
 * JD-Core Version:    0.7.0.1
 */