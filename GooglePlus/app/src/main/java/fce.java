public final class fce
{
  public static final efc<fdd> a = new efc();
  public static final eew<eez> b;
  public static final fby c;
  private static final eex<fdd, eez> d = new fcf();
  
  static
  {
    b = new eew("LocationServices.API", d, a);
    c = new fby();
    new fbz();
    new fcg();
  }
  
  public static fdd a(efd paramefd)
  {
    boolean bool1 = true;
    boolean bool2;
    fdd localfdd;
    if (paramefd != null)
    {
      bool2 = bool1;
      efj.b(bool2, "GoogleApiClient parameter is required.");
      localfdd = (fdd)paramefd.a(a);
      if (localfdd == null) {
        break label44;
      }
    }
    for (;;)
    {
      efj.a(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return localfdd;
      bool2 = false;
      break;
      label44:
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fce
 * JD-Core Version:    0.7.0.1
 */