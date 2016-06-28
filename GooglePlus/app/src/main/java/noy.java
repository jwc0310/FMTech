import java.nio.ByteBuffer;

public final class noy
  extends qan<noy>
{
  public ome a = null;
  public Integer b = null;
  public ojv[] c = ojv.b();
  private npf d = null;
  private Boolean e = null;
  private Integer f = null;
  private String g = null;
  
  public noy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.d != null)
    {
      npf localnpf = this.d;
      int i11 = qal.d(8);
      int i12 = localnpf.a();
      localnpf.ak = i12;
      j += i11 + (i12 + qal.d(i12));
    }
    int i8;
    int i9;
    if (this.b != null)
    {
      i8 = this.b.intValue();
      i9 = qal.d(16);
      if (i8 < 0) {
        break label187;
      }
    }
    int i4;
    label187:
    for (int i10 = qal.d(i8);; i10 = i)
    {
      j += i10 + i9;
      if ((this.c == null) || (this.c.length <= 0)) {
        break label196;
      }
      i4 = j;
      for (int i5 = 0; i5 < this.c.length; i5++)
      {
        ojv localojv = this.c[i5];
        if (localojv != null)
        {
          int i6 = qal.d(24);
          int i7 = localojv.a();
          localojv.ak = i7;
          i4 += i6 + (i7 + qal.d(i7));
        }
      }
    }
    j = i4;
    label196:
    if (this.g != null)
    {
      String str = this.g;
      int i2 = qal.d(32);
      int i3 = qal.a(str);
      j += i2 + (i3 + qal.d(i3));
    }
    if (this.f != null)
    {
      int n = this.f.intValue();
      int i1 = qal.d(40);
      if (n >= 0) {
        i = qal.d(n);
      }
      j += i1 + i;
    }
    if (this.a != null)
    {
      ome localome = this.a;
      int k = qal.d(48);
      int m = localome.a();
      localome.ak = m;
      j += k + (m + qal.d(m));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      j += 1 + qal.d(56);
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.d != null)
    {
      npf localnpf = this.d;
      paramqal.c(10);
      if (localnpf.ak < 0) {
        localnpf.ak = localnpf.a();
      }
      paramqal.c(localnpf.ak);
      localnpf.a(paramqal);
    }
    if (this.b != null)
    {
      int m = this.b.intValue();
      paramqal.c(16);
      paramqal.a(m);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        ojv localojv = this.c[k];
        if (localojv != null)
        {
          paramqal.c(26);
          if (localojv.ak < 0) {
            localojv.ak = localojv.a();
          }
          paramqal.c(localojv.ak);
          localojv.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      String str = this.g;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(40);
      paramqal.a(j);
    }
    if (this.a != null)
    {
      ome localome = this.a;
      paramqal.c(50);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
      paramqal.c(56);
      int i = 0;
      if (bool) {
        i = 1;
      }
      byte b1 = (byte)i;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     noy
 * JD-Core Version:    0.7.0.1
 */