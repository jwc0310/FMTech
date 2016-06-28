public final class oae
  extends qan<oae>
{
  public oor a = null;
  public nzq b = null;
  public nzj c = null;
  public int d = -2147483648;
  public qbd e = null;
  public int[] f = qay.a;
  private nzl g = null;
  private qzk h = null;
  
  public oae()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      oor localoor = this.a;
      int i14 = qal.d(8);
      int i15 = localoor.a();
      localoor.ak = i15;
      j += i14 + (i15 + qal.d(i15));
    }
    if (this.b != null)
    {
      nzq localnzq = this.b;
      int i12 = qal.d(16);
      int i13 = localnzq.a();
      localnzq.ak = i13;
      j += i12 + (i13 + qal.d(i13));
    }
    if (this.c != null)
    {
      nzj localnzj = this.c;
      int i10 = qal.d(24);
      int i11 = localnzj.a();
      localnzj.ak = i11;
      j += i10 + (i11 + qal.d(i11));
    }
    int i9;
    int i2;
    label259:
    int i3;
    if (this.d != -2147483648)
    {
      int i7 = this.d;
      int i8 = qal.d(32);
      if (i7 >= 0)
      {
        i9 = qal.d(i7);
        j += i9 + i8;
      }
    }
    else
    {
      if (this.e != null)
      {
        qbd localqbd = this.e;
        int i5 = qal.d(40);
        int i6 = localqbd.a();
        localqbd.ak = i6;
        j += i5 + (i6 + qal.d(i6));
      }
      if ((this.f == null) || (this.f.length <= 0)) {
        break label327;
      }
      i2 = 0;
      if (i2 >= this.f.length) {
        break label315;
      }
      i3 = this.f[i2];
      if (i3 < 0) {
        break label308;
      }
    }
    label308:
    for (int i4 = qal.d(i3);; i4 = 10)
    {
      i += i4;
      i2++;
      break label259;
      i9 = 10;
      break;
    }
    label315:
    j = j + i + 1 * this.f.length;
    label327:
    if (this.h != null)
    {
      qzk localqzk = this.h;
      int n = qal.d(56);
      int i1 = localqzk.a();
      localqzk.ak = i1;
      j += n + (i1 + qal.d(i1));
    }
    if (this.g != null)
    {
      nzl localnzl = this.g;
      int k = qal.d(64);
      int m = localnzl.a();
      localnzl.ak = m;
      j += k + (m + qal.d(m));
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oor localoor = this.a;
      paramqal.c(10);
      if (localoor.ak < 0) {
        localoor.ak = localoor.a();
      }
      paramqal.c(localoor.ak);
      localoor.a(paramqal);
    }
    if (this.b != null)
    {
      nzq localnzq = this.b;
      paramqal.c(18);
      if (localnzq.ak < 0) {
        localnzq.ak = localnzq.a();
      }
      paramqal.c(localnzq.ak);
      localnzq.a(paramqal);
    }
    if (this.c != null)
    {
      nzj localnzj = this.c;
      paramqal.c(26);
      if (localnzj.ak < 0) {
        localnzj.ak = localnzj.a();
      }
      paramqal.c(localnzj.ak);
      localnzj.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int k = this.d;
      paramqal.c(32);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      qbd localqbd = this.e;
      paramqal.c(42);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i = 0; i < this.f.length; i++)
      {
        int j = this.f[i];
        paramqal.c(48);
        paramqal.a(j);
      }
    }
    if (this.h != null)
    {
      qzk localqzk = this.h;
      paramqal.c(58);
      if (localqzk.ak < 0) {
        localqzk.ak = localqzk.a();
      }
      paramqal.c(localqzk.ak);
      localqzk.a(paramqal);
    }
    if (this.g != null)
    {
      nzl localnzl = this.g;
      paramqal.c(66);
      if (localnzl.ak < 0) {
        localnzl.ak = localnzl.a();
      }
      paramqal.c(localnzl.ak);
      localnzl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oae
 * JD-Core Version:    0.7.0.1
 */