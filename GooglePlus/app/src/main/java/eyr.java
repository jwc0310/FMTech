public final class eyr
  extends eyf<eyr>
{
  private static volatile eyr[] c;
  private String d = "";
  private String e = "";
  
  public eyr()
  {
    this.a = null;
    this.b = -1;
  }
  
  public static eyr[] d()
  {
    if (c == null) {}
    synchronized (eyj.a)
    {
      if (c == null) {
        c = new eyr[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (!this.d.equals("")) {
      i += eyd.b(1, this.d);
    }
    if (!this.e.equals("")) {
      i += eyd.b(2, this.e);
    }
    return i;
  }
  
  public final void a(eyd parameyd)
  {
    if (!this.d.equals("")) {
      parameyd.a(1, this.d);
    }
    if (!this.e.equals("")) {
      parameyd.a(2, this.e);
    }
    super.a(parameyd);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    eyr localeyr;
    do
    {
      String str2;
      do
      {
        boolean bool1;
        do
        {
          return bool2;
          bool1 = paramObject instanceof eyr;
          bool2 = false;
        } while (!bool1);
        localeyr = (eyr)paramObject;
        if (this.d != null) {
          break;
        }
        str2 = localeyr.d;
        bool2 = false;
      } while (str2 != null);
      if (this.e != null) {
        break label92;
      }
      str1 = localeyr.e;
      bool2 = false;
    } while (str1 != null);
    label92:
    while (this.e.equals(localeyr.e))
    {
      String str1;
      return a(localeyr);
      if (this.d.equals(localeyr.d)) {
        break;
      }
      return false;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i;
    int j;
    int k;
    if (this.d == null)
    {
      i = 0;
      j = 31 * (i + 527);
      String str = this.e;
      k = 0;
      if (str != null) {
        break label54;
      }
    }
    for (;;)
    {
      return 31 * (j + k) + b();
      i = this.d.hashCode();
      break;
      label54:
      k = this.e.hashCode();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyr
 * JD-Core Version:    0.7.0.1
 */