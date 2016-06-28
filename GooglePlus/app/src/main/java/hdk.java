public final class hdk
  extends ipk
{
  int a;
  private int l;
  
  public hdk(hdi paramhdi) {}
  
  protected final String a()
  {
    String str = super.a();
    switch (this.a)
    {
    default: 
      return str;
    case 0: 
      return String.valueOf(str).concat("-normal");
    case 1: 
      return String.valueOf(str).concat("-rounded");
    }
    return String.valueOf(str).concat("-roundedcorners");
  }
  
  public final void a(int paramInt1, ipf paramipf, int paramInt2, int paramInt3, int paramInt4)
  {
    super.a(paramInt1, paramipf, 0, paramInt2, paramInt2, paramInt3, null, null);
    this.a = paramInt4;
    this.l = 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof hdk)) {
      return false;
    }
    hdk localhdk = (hdk)paramObject;
    if (this.a != localhdk.a) {
      return false;
    }
    return super.equals(paramObject);
  }
  
  public final int hashCode()
  {
    if (this.l == 0) {
      this.l = (this.a + 31 * super.hashCode());
    }
    return this.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdk
 * JD-Core Version:    0.7.0.1
 */