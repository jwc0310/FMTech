public final class eyo
  extends eyf<eyo>
{
  private int c = 0;
  private String d = "";
  private String e = "";
  
  public eyo()
  {
    this.a = null;
    this.b = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (!this.d.equals("")) {
      i += eyd.b(2, this.d);
    }
    if (!this.e.equals("")) {
      i += eyd.b(3, this.e);
    }
    return i;
  }
  
  public final void a(eyd parameyd)
  {
    if (!this.d.equals("")) {
      parameyd.a(2, this.d);
    }
    if (!this.e.equals("")) {
      parameyd.a(3, this.e);
    }
    super.a(parameyd);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    eyo localeyo;
    do
    {
      String str2;
      do
      {
        boolean bool1;
        do
        {
          return bool2;
          bool1 = paramObject instanceof eyo;
          bool2 = false;
        } while (!bool1);
        localeyo = (eyo)paramObject;
        if (this.d != null) {
          break;
        }
        str2 = localeyo.d;
        bool2 = false;
      } while (str2 != null);
      if (this.e != null) {
        break label92;
      }
      str1 = localeyo.e;
      bool2 = false;
    } while (str1 != null);
    label92:
    while (this.e.equals(localeyo.e))
    {
      String str1;
      return a(localeyo);
      if (this.d.equals(localeyo.d)) {
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
      j = 31 * (i + 16337);
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
 * Qualified Name:     eyo
 * JD-Core Version:    0.7.0.1
 */