import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

public final class lly
  extends mab
{
  public String a;
  public String b;
  public String c;
  public String d;
  public long e;
  public boolean f;
  public llx g;
  public llz[] h;
  public int i;
  public int j;
  public int k;
  public int l;
  public int m;
  public int n;
  
  public lly() {}
  
  private lly(qdz paramqdz)
  {
    this.a = paramqdz.d;
    this.b = paramqdz.b;
    this.c = paramqdz.c;
    this.e = efj.a(paramqdz.f);
    this.f = efj.b(paramqdz.g);
    this.l = paramqdz.j;
    this.n = paramqdz.k;
    String str3;
    String str4;
    int i2;
    label154:
    label177:
    String str1;
    if (paramqdz.i != null)
    {
      qdw localqdw = (qdw)paramqdz.i.b(qdw.a);
      this.g = new llx(localqdw);
      this.g.e = localqdw.f;
      str3 = localqdw.b;
      if (str3 == null)
      {
        str4 = null;
        this.d = str4;
      }
    }
    else
    {
      this.k = -1;
      if (paramqdz.e == null) {
        break label324;
      }
      i2 = paramqdz.e.length;
      this.i = i2;
      if (this.i <= 0) {
        return;
      }
      this.h = new llz[this.i];
      if (i1 >= this.i) {
        return;
      }
      qdy localqdy = (qdy)paramqdz.e[i1].b(qdy.a);
      this.h[i1] = new llz(localqdy);
      if (this.h[i1].d != null)
      {
        this.j = (1 + this.j);
        if (this.d == null)
        {
          str1 = ((qdw)localqdy.e.b(qdw.a)).b;
          if (str1 != null) {
            break label329;
          }
        }
      }
    }
    label324:
    label329:
    for (String str2 = null;; str2 = Uri.parse(str1).getQueryParameter("authkey"))
    {
      this.d = str2;
      if (TextUtils.equals(this.h[i1].a, paramqdz.h)) {
        this.k = i1;
      }
      i1++;
      break label177;
      str4 = Uri.parse(str3).getQueryParameter("authkey");
      break;
      i2 = 0;
      break label154;
    }
  }
  
  public lly(qdz paramqdz, int paramInt)
  {
    this(paramqdz);
    this.m = paramInt;
  }
  
  private final void a(DataOutputStream paramDataOutputStream)
  {
    paramDataOutputStream.writeInt(this.i);
    paramDataOutputStream.writeInt(this.j);
    boolean bool1;
    int i1;
    label108:
    llz localllz;
    if (this.g != null)
    {
      bool1 = true;
      paramDataOutputStream.writeBoolean(bool1);
      a(paramDataOutputStream, this.a);
      a(paramDataOutputStream, this.b);
      a(paramDataOutputStream, this.c);
      a(paramDataOutputStream, this.d);
      paramDataOutputStream.writeInt(this.k);
      paramDataOutputStream.writeLong(this.e);
      paramDataOutputStream.writeBoolean(this.f);
      paramDataOutputStream.writeInt(this.l);
      if (bool1) {
        this.g.a(paramDataOutputStream);
      }
      i1 = 0;
      if (i1 >= this.i) {
        break label202;
      }
      localllz = this.h[i1];
      if (localllz.d == null) {
        break label196;
      }
    }
    label196:
    for (boolean bool2 = true;; bool2 = false)
    {
      paramDataOutputStream.writeBoolean(bool2);
      llz.a(paramDataOutputStream, localllz.a);
      llz.a(paramDataOutputStream, localllz.b);
      paramDataOutputStream.writeLong(localllz.c);
      if (localllz.d != null) {
        localllz.d.a(paramDataOutputStream);
      }
      i1++;
      break label108;
      bool1 = false;
      break;
    }
    label202:
    paramDataOutputStream.writeInt(this.m);
    paramDataOutputStream.writeInt(this.n);
  }
  
  public static byte[] a(lly paramlly)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(512);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    paramlly.a(localDataOutputStream);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  public final boolean a()
  {
    return (this.k == -1) || ((this.k >= 0) && (this.k < this.h.length));
  }
  
  public final llx b()
  {
    if ((this.h == null) || (this.h.length == 0)) {
      return null;
    }
    return this.h[0].d;
  }
  
  public final boolean c()
  {
    return (this.j > 2) && (this.i > 2);
  }
  
  public final boolean d()
  {
    return (this.j == 2) && (this.i == 2);
  }
  
  public final boolean e()
  {
    return (this.j == 1) && (this.i > 2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    lly locallly;
    do
    {
      return true;
      if (!(paramObject instanceof lly)) {
        return false;
      }
      locallly = (lly)paramObject;
    } while ((this.m == locallly.m) && (this.e == locallly.e) && (this.i == locallly.i) && (this.j == locallly.j) && (this.l == locallly.l) && (this.n == locallly.n) && (this.f == locallly.f) && (this.k == locallly.k) && (efj.c(this.a, locallly.a)) && (efj.c(this.g, locallly.g)) && (efj.c(this.b, locallly.b)) && (efj.c(this.c, locallly.c)) && (efj.c(this.d, locallly.d)) && (Arrays.equals(this.h, locallly.h)));
    return false;
  }
  
  public final boolean f()
  {
    return (this.j == 1) && (this.i == 2);
  }
  
  public final boolean g()
  {
    return (this.j == 0) && (this.i >= 2);
  }
  
  public final int hashCode()
  {
    int i1;
    int i3;
    label35:
    int i5;
    label59:
    int i7;
    label85:
    int i9;
    label122:
    int i10;
    if (this.a != null)
    {
      i1 = this.a.hashCode();
      int i2 = i1 * 31;
      if (this.b == null) {
        break label240;
      }
      i3 = this.b.hashCode();
      int i4 = 31 * (i3 + i2);
      if (this.c == null) {
        break label245;
      }
      i5 = this.c.hashCode();
      int i6 = 31 * (i5 + i4);
      if (this.d == null) {
        break label251;
      }
      i7 = this.d.hashCode();
      int i8 = 31 * (31 * (i7 + i6) + (int)(this.e ^ this.e >>> 32));
      if (!this.f) {
        break label257;
      }
      i9 = 1;
      i10 = 31 * (i9 + i8);
      if (this.g == null) {
        break label263;
      }
    }
    label257:
    label263:
    for (int i11 = this.g.hashCode();; i11 = 0)
    {
      int i12 = 31 * (i11 + i10);
      llz[] arrayOfllz = this.h;
      int i13 = 0;
      if (arrayOfllz != null) {
        i13 = Arrays.hashCode(this.h);
      }
      return 31 * (31 * (31 * (31 * (31 * (31 * (i12 + i13) + this.i) + this.j) + this.k) + this.l) + this.m) + this.n;
      i1 = 0;
      break;
      label240:
      i3 = 0;
      break label35;
      label245:
      i5 = 0;
      break label59;
      label251:
      i7 = 0;
      break label85;
      i9 = 0;
      break label122;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lly
 * JD-Core Version:    0.7.0.1
 */