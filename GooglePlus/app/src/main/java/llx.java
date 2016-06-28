import android.net.Uri;
import android.text.TextUtils;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class llx
  extends mab
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public String g;
  public long h;
  public short i;
  public short j;
  public short k;
  public short l;
  public ipm m;
  
  public llx() {}
  
  public llx(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.f = paramString1;
    this.h = Long.parseLong(paramString2);
    this.g = paramString3;
    this.e = paramString4;
    this.m = ipm.a;
  }
  
  private llx(String paramString1, String paramString2, String paramString3, qbe paramqbe)
  {
    this.a = paramString1;
    this.b = paramString2;
    a(paramString3);
    this.m = ipm.a;
    if (paramqbe != null)
    {
      qdl localqdl = (qdl)paramqbe.b(qdl.a);
      if (localqdl != null)
      {
        this.k = ((short)efj.a(localqdl.e));
        this.l = ((short)efj.a(localqdl.f));
        if (localqdl.d != null) {
          this.e = localqdl.d.a;
        }
      }
    }
  }
  
  @Deprecated
  public llx(qcj paramqcj)
  {
    this(paramqcj.d, paramqcj.e, paramqcj.b, paramqcj.f);
  }
  
  public llx(qcx paramqcx)
  {
    this(paramqcx.d, paramqcx.e, paramqcx.b, paramqcx.g);
  }
  
  public llx(qdw paramqdw)
  {
    String str;
    if ((paramqdw.c != null) && (paramqdw.c.a != null)) {
      str = efj.E(paramqdw.c.a);
    }
    for (;;)
    {
      this.e = iqw.b(str);
      this.f = null;
      if (!TextUtils.isEmpty(paramqdw.g)) {
        this.f = paramqdw.g;
      }
      this.g = null;
      try
      {
        if ((!TextUtils.isEmpty(paramqdw.h)) && (0L != Long.parseLong(paramqdw.h))) {
          this.g = paramqdw.h;
        }
        label98:
        if (!TextUtils.isEmpty(paramqdw.i)) {
          this.h = efj.D(paramqdw.i);
        }
        this.i = ((short)efj.a(paramqdw.d));
        this.j = ((short)efj.a(paramqdw.e));
        switch (paramqdw.j)
        {
        default: 
          this.m = ipm.a;
          label179:
          if (this.m != ipm.b) {
            break;
          }
        }
        for (int n = 1;; n = 0)
        {
          if (n != 0) {
            a(paramqdw.b);
          }
          return;
          str = null;
          break;
          this.m = ipm.b;
          break label179;
          this.m = ipm.c;
          break label179;
          this.m = ipm.d;
          break label179;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        break label98;
      }
    }
  }
  
  public llx(qeg paramqeg)
  {
    this(paramqeg.d, paramqeg.e, paramqeg.b, paramqeg.g);
  }
  
  public llx(qeh paramqeh)
  {
    a(paramqeh.b);
    if (paramqeh.e != null) {
      this.e = paramqeh.e.a;
    }
    int n = efj.a(paramqeh.f);
    int i1 = efj.a(paramqeh.g);
    if ((n > 0) && (i1 > 0))
    {
      this.i = 480;
      this.j = ((short)(i1 * this.i / n));
      if (TextUtils.isEmpty(paramqeh.c)) {
        break label125;
      }
      this.a = paramqeh.c;
      this.b = paramqeh.d;
    }
    for (;;)
    {
      this.m = ipm.b;
      return;
      this.i = 480;
      this.j = 360;
      break;
      label125:
      this.a = paramqeh.d;
    }
  }
  
  public llx(qei paramqei)
  {
    this(paramqei.d, paramqei.e, paramqei.b, paramqei.g);
  }
  
  public static llx a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    llx localllx = new llx();
    localllx.a(localByteBuffer);
    return localllx;
  }
  
  private void a(String paramString)
  {
    this.c = paramString;
    String str1 = this.c;
    String str3;
    if (!TextUtils.isEmpty(str1))
    {
      str3 = Uri.parse(str1).getHost();
      if (!TextUtils.isEmpty(str3)) {
        if (str3.startsWith("www.")) {
          str3 = str3.substring(4);
        }
      }
    }
    for (String str2 = str3.toLowerCase();; str2 = null)
    {
      this.d = str2;
      return;
    }
  }
  
  public final String a()
  {
    if (this.m == ipm.b) {}
    for (int n = 1; n != 0; n = 0) {
      return this.c;
    }
    return null;
  }
  
  public final void a(DataOutputStream paramDataOutputStream)
  {
    a(paramDataOutputStream, this.a);
    a(paramDataOutputStream, this.b);
    a(paramDataOutputStream, this.c);
    a(paramDataOutputStream, this.d);
    a(paramDataOutputStream, this.e);
    a(paramDataOutputStream, this.f);
    a(paramDataOutputStream, this.g);
    paramDataOutputStream.writeLong(this.h);
    paramDataOutputStream.writeShort(this.i);
    paramDataOutputStream.writeShort(this.j);
    paramDataOutputStream.writeShort(this.m.e);
    paramDataOutputStream.writeShort(this.k);
    paramDataOutputStream.writeShort(this.l);
  }
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    this.a = d(paramByteBuffer);
    this.b = d(paramByteBuffer);
    this.c = d(paramByteBuffer);
    this.d = d(paramByteBuffer);
    this.e = d(paramByteBuffer);
    this.f = d(paramByteBuffer);
    this.g = d(paramByteBuffer);
    this.h = paramByteBuffer.getLong();
    this.i = paramByteBuffer.getShort();
    this.j = paramByteBuffer.getShort();
    this.m = ipm.a(paramByteBuffer.getShort());
    this.k = paramByteBuffer.getShort();
    this.l = paramByteBuffer.getShort();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    llx localllx;
    do
    {
      return true;
      if (!(paramObject instanceof llx)) {
        return false;
      }
      localllx = (llx)paramObject;
    } while ((this.j == localllx.j) && (this.h == localllx.h) && (this.l == localllx.l) && (this.k == localllx.k) && (this.i == localllx.i) && (this.m == localllx.m) && (efj.c(this.g, localllx.g)) && (efj.c(this.c, localllx.c)) && (efj.c(this.b, localllx.b)) && (efj.c(this.d, localllx.d)) && (efj.c(this.e, localllx.e)) && (efj.c(this.f, localllx.f)) && (efj.c(this.a, localllx.a)));
    return false;
  }
  
  public final int hashCode()
  {
    int n;
    int i2;
    label35:
    int i4;
    label59:
    int i6;
    label85:
    int i8;
    label111:
    int i10;
    label137:
    int i11;
    if (this.a != null)
    {
      n = this.a.hashCode();
      int i1 = n * 31;
      if (this.b == null) {
        break label256;
      }
      i2 = this.b.hashCode();
      int i3 = 31 * (i2 + i1);
      if (this.c == null) {
        break label261;
      }
      i4 = this.c.hashCode();
      int i5 = 31 * (i4 + i3);
      if (this.d == null) {
        break label267;
      }
      i6 = this.d.hashCode();
      int i7 = 31 * (i6 + i5);
      if (this.e == null) {
        break label273;
      }
      i8 = this.e.hashCode();
      int i9 = 31 * (i8 + i7);
      if (this.f == null) {
        break label279;
      }
      i10 = this.f.hashCode();
      i11 = 31 * (i10 + i9);
      if (this.g == null) {
        break label285;
      }
    }
    label256:
    label261:
    label267:
    label273:
    label279:
    label285:
    for (int i12 = this.g.hashCode();; i12 = 0)
    {
      int i13 = 31 * (31 * (31 * (31 * (31 * (31 * (i12 + i11) + (int)(this.h ^ this.h >>> 32)) + this.i) + this.j) + this.k) + this.l);
      ipm localipm = this.m;
      int i14 = 0;
      if (localipm != null) {
        i14 = this.m.hashCode();
      }
      return i13 + i14;
      n = 0;
      break;
      i2 = 0;
      break label35;
      i4 = 0;
      break label59;
      i6 = 0;
      break label85;
      i8 = 0;
      break label111;
      i10 = 0;
      break label137;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llx
 * JD-Core Version:    0.7.0.1
 */