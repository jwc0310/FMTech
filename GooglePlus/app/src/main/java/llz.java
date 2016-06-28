public final class llz
  extends mab
{
  public String a;
  public String b;
  public long c;
  public llx d;
  
  public llz() {}
  
  public llz(qdy paramqdy)
  {
    this.a = paramqdy.c;
    this.b = paramqdy.b;
    this.c = efj.a(paramqdy.d);
    if (paramqdy.e != null)
    {
      qdw localqdw = (qdw)paramqdy.e.b(qdw.a);
      this.d = new llx(localqdw);
      this.d.e = localqdw.f;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    llz localllz;
    do
    {
      return true;
      if (!(paramObject instanceof llz)) {
        return false;
      }
      localllz = (llz)paramObject;
    } while ((this.c == localllz.c) && (efj.c(this.a, localllz.a)) && (efj.c(this.d, localllz.d)) && (efj.c(this.b, localllz.b)));
    return false;
  }
  
  public final int hashCode()
  {
    int i;
    int j;
    if (this.a != null)
    {
      i = this.a.hashCode();
      j = i * 31;
      if (this.b == null) {
        break label94;
      }
    }
    label94:
    for (int k = this.b.hashCode();; k = 0)
    {
      int m = 31 * (31 * (k + j) + (int)(this.c ^ this.c >>> 32));
      llx localllx = this.d;
      int n = 0;
      if (localllx != null) {
        n = this.d.hashCode();
      }
      return m + n;
      i = 0;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llz
 * JD-Core Version:    0.7.0.1
 */