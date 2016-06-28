public final class kdi
{
  final int a;
  final String[] b;
  private final String c;
  private final int d;
  
  kdi(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 == null) {
      throw new NullPointerException();
    }
    this.c = ((String)paramString1);
    this.a = paramInt;
    if ((paramString1.toLowerCase().endsWith("batch")) && (paramString2.startsWith("ApiaryBatchOperation{")) && (paramString2.endsWith("}"))) {}
    for (this.b = paramString2.replace("ApiaryBatchOperation{", "").replace("}", "").split(",");; this.b = new String[] { paramString1 })
    {
      this.d = 0;
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    kdi localkdi;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof kdi)) {
        break;
      }
      localkdi = (kdi)paramObject;
    } while ((this.c.equals(localkdi.c)) && (this.a == localkdi.a));
    return false;
    return false;
  }
  
  public final int hashCode()
  {
    if (this.c == null) {}
    for (int i = 0;; i = this.c.hashCode()) {
      return 31 * (i + 31) + this.a;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdi
 * JD-Core Version:    0.7.0.1
 */