import java.nio.ByteBuffer;

public final class ogo
  extends qan<ogo>
{
  public String a = null;
  public Boolean b = null;
  public String c = null;
  public Boolean d = null;
  public int e = -2147483648;
  public qbd f = null;
  private String g = null;
  private String h = null;
  private Boolean i = null;
  private qbe[] j = qbe.b();
  private onh k = null;
  private int l = -2147483648;
  private omp m = null;
  private qzk n = null;
  
  public ogo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i26 = qal.d(8);
      int i27 = qal.a(str4);
      i2 += i26 + (i27 + qal.d(i27));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i24 = qal.d(16);
      int i25 = qal.a(str3);
      i2 += i24 + (i25 + qal.d(i25));
    }
    if (this.g != null)
    {
      String str2 = this.g;
      int i22 = qal.d(24);
      int i23 = qal.a(str2);
      i2 += i22 + (i23 + qal.d(i23));
    }
    if (this.h != null)
    {
      String str1 = this.h;
      int i20 = qal.d(32);
      int i21 = qal.a(str1);
      i2 += i20 + (i21 + qal.d(i21));
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i2 += 1 + qal.d(40);
    }
    if ((this.j != null) && (this.j.length > 0))
    {
      int i16 = i2;
      for (int i17 = 0; i17 < this.j.length; i17++)
      {
        qbe localqbe = this.j[i17];
        if (localqbe != null)
        {
          int i18 = qal.d(48);
          int i19 = localqbe.a();
          localqbe.ak = i19;
          i16 += i18 + (i19 + qal.d(i19));
        }
      }
      i2 = i16;
    }
    if (this.k != null)
    {
      onh localonh = this.k;
      int i14 = qal.d(56);
      int i15 = localonh.a();
      localonh.ak = i15;
      i2 += i14 + (i15 + qal.d(i15));
    }
    int i11;
    int i12;
    if (this.e != -2147483648)
    {
      i11 = this.e;
      i12 = qal.d(64);
      if (i11 < 0) {
        break label611;
      }
    }
    label611:
    for (int i13 = qal.d(i11);; i13 = i1)
    {
      i2 += i13 + i12;
      if (this.l != -2147483648)
      {
        int i9 = this.l;
        int i10 = qal.d(72);
        if (i9 >= 0) {
          i1 = qal.d(i9);
        }
        i2 += i10 + i1;
      }
      if (this.b != null)
      {
        this.b.booleanValue();
        i2 += 1 + qal.d(80);
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        i2 += 1 + qal.d(88);
      }
      if (this.f != null)
      {
        qbd localqbd = this.f;
        int i7 = qal.d(96);
        int i8 = localqbd.a();
        localqbd.ak = i8;
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.m != null)
      {
        omp localomp = this.m;
        int i5 = qal.d(104);
        int i6 = localomp.a();
        localomp.ak = i6;
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.n != null)
      {
        qzk localqzk = this.n;
        int i3 = qal.d(112);
        int i4 = localqzk.a();
        localqzk.ak = i4;
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.i != null)
    {
      boolean bool3 = this.i.booleanValue();
      paramqal.c(40);
      if (bool3) {}
      byte b3;
      for (int i6 = i1;; i6 = 0)
      {
        b3 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (int i5 = 0; i5 < this.j.length; i5++)
      {
        qbe localqbe = this.j[i5];
        if (localqbe != null)
        {
          paramqal.c(50);
          if (localqbe.ak < 0) {
            localqbe.ak = localqbe.a();
          }
          paramqal.c(localqbe.ak);
          localqbe.a(paramqal);
        }
      }
    }
    if (this.k != null)
    {
      onh localonh = this.k;
      paramqal.c(58);
      if (localonh.ak < 0) {
        localonh.ak = localonh.a();
      }
      paramqal.c(localonh.ak);
      localonh.a(paramqal);
    }
    if (this.e != -2147483648)
    {
      int i4 = this.e;
      paramqal.c(64);
      paramqal.a(i4);
    }
    if (this.l != -2147483648)
    {
      int i3 = this.l;
      paramqal.c(72);
      paramqal.a(i3);
    }
    if (this.b != null)
    {
      boolean bool2 = this.b.booleanValue();
      paramqal.c(80);
      if (bool2) {}
      byte b2;
      for (int i2 = i1;; i2 = 0)
      {
        b2 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
      paramqal.c(88);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.f != null)
    {
      qbd localqbd = this.f;
      paramqal.c(98);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if (this.m != null)
    {
      omp localomp = this.m;
      paramqal.c(106);
      if (localomp.ak < 0) {
        localomp.ak = localomp.a();
      }
      paramqal.c(localomp.ak);
      localomp.a(paramqal);
    }
    if (this.n != null)
    {
      qzk localqzk = this.n;
      paramqal.c(114);
      if (localqzk.ak < 0) {
        localqzk.ak = localqzk.a();
      }
      paramqal.c(localqzk.ak);
      localqzk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogo
 * JD-Core Version:    0.7.0.1
 */