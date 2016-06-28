import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;

public final class jpu
  implements jpx
{
  public static final Parcelable.Creator<jpu> CREATOR = new jpv();
  private static final String g = jrf.a(1, new String[0]);
  public final oih a;
  public final ipf b;
  public final String c;
  public final String d;
  public final long e;
  public String f;
  private final String h;
  private final long i;
  private int j;
  private final isn k;
  private final aip l;
  private final long m;
  
  protected jpu(Parcel paramParcel)
  {
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.b = ((ipf)paramParcel.readParcelable(ipf.class.getClassLoader()));
    this.e = paramParcel.readLong();
    this.i = paramParcel.readLong();
    this.j = paramParcel.readInt();
    this.k = new jpy(this.c);
    this.l = new jpw(this.b);
    this.h = paramParcel.readString();
    this.m = j();
    byte[] arrayOfByte = paramParcel.createByteArray();
    if (arrayOfByte != null) {}
    for (;;)
    {
      try
      {
        localoih = (oih)qat.b(new oih(), arrayOfByte, 0, arrayOfByte.length);
        this.a = localoih;
        return;
      }
      catch (qas localqas)
      {
        Log.e("MediaItem", "Failed to deserialize EditInfo.", localqas);
      }
      oih localoih = null;
    }
  }
  
  public jpu(ipf paramipf)
  {
    this(g, g, paramipf, null, 0L, 0L, null);
  }
  
  public jpu(String paramString1, String paramString2, ipf paramipf, long paramLong1, long paramLong2)
  {
    this(paramString1, paramString2, paramipf, null, paramLong1, paramLong2, null);
  }
  
  public jpu(String paramString1, String paramString2, ipf paramipf, String paramString3, long paramLong1, long paramLong2, oih paramoih)
  {
    this.d = paramString1;
    this.c = paramString2;
    this.b = paramipf;
    this.h = paramString3;
    this.e = paramLong1;
    this.a = paramoih;
    this.i = paramLong2;
    this.k = new jpy(this.c);
    this.m = j();
    this.l = new jpw(this.b);
  }
  
  private final long j()
  {
    long l1 = 0L;
    long l2;
    int n;
    label27:
    long l3;
    label37:
    int i5;
    label73:
    int i1;
    label81:
    long l5;
    label91:
    int i2;
    label114:
    long l7;
    label124:
    int i3;
    label154:
    long l9;
    label164:
    long l11;
    label183:
    long l13;
    label209:
    long l14;
    if (l())
    {
      l2 = 1L;
      if ((0x0 & this.i) == l1) {
        break label255;
      }
      n = 1;
      if (n == 0) {
        break label261;
      }
      l3 = 2L;
      long l4 = l3 | l2;
      if (this.b == null) {
        break label273;
      }
      if (!this.b.a())
      {
        if (this.b.a == null) {
          break label267;
        }
        i5 = 1;
        if (i5 == 0) {
          break label273;
        }
      }
      i1 = 1;
      if (i1 == 0) {
        break label279;
      }
      l5 = 4L;
      long l6 = l4 | l5;
      if ((0x2 & this.e) == l1) {
        break label285;
      }
      i2 = 1;
      if (i2 == 0) {
        break label291;
      }
      l7 = 8L;
      long l8 = l6 | l7;
      if ((this.b == null) || (this.b.e != ipm.b)) {
        break label297;
      }
      i3 = 1;
      if (i3 == 0) {
        break label303;
      }
      l9 = 16L;
      long l10 = l8 | l9;
      if (!k()) {
        break label309;
      }
      l11 = 32L;
      long l12 = l10 | l11;
      if ((k()) || (l())) {
        break label315;
      }
      l13 = 128L;
      l14 = l12 | l13;
      if ((0x100 & this.e) == l1) {
        break label321;
      }
    }
    label261:
    label267:
    label273:
    label279:
    label285:
    label291:
    label297:
    label303:
    label309:
    label315:
    label321:
    for (int i4 = 1;; i4 = 0)
    {
      if (i4 != 0) {
        l1 = 512L;
      }
      return 0x40 | l14 | l1;
      l2 = l1;
      break;
      label255:
      n = 0;
      break label27;
      l3 = l1;
      break label37;
      i5 = 0;
      break label73;
      i1 = 0;
      break label81;
      l5 = l1;
      break label91;
      i2 = 0;
      break label114;
      l7 = l1;
      break label124;
      i3 = 0;
      break label154;
      l9 = l1;
      break label164;
      l11 = l1;
      break label183;
      l13 = l1;
      break label209;
    }
  }
  
  private boolean k()
  {
    if (this.b != null)
    {
      if (this.b.d != null) {}
      for (int n = 1; n != 0; n = 0) {
        return true;
      }
    }
    return false;
  }
  
  private boolean l()
  {
    return (jrf.m(this.c)) && (!TextUtils.equals(this.c, jrf.a()));
  }
  
  public final isn a()
  {
    return this.k;
  }
  
  public final jpx a(oih paramoih)
  {
    return new jpu(this.d, this.c, this.b, this.h, this.e, this.i, paramoih);
  }
  
  public final void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public final void a(String paramString)
  {
    this.f = paramString;
  }
  
  public final aip b()
  {
    return this.l;
  }
  
  public final long c()
  {
    return this.m;
  }
  
  public final int d()
  {
    return this.j;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final ipf e()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jpu)) {}
    jpu localjpu;
    do
    {
      return false;
      localjpu = (jpu)paramObject;
    } while ((!TextUtils.equals(this.d, localjpu.d)) || (!TextUtils.equals(this.c, localjpu.c)) || (((this.b != null) || (localjpu.b != null)) && ((this.b == null) || (!this.b.equals(localjpu.b)) || (this.e != localjpu.e) || (((this.a != null) || (localjpu.a != null)) && ((this.a == null) || (!this.a.equals(localjpu.a)) || (this.i != localjpu.i))))));
    return true;
  }
  
  public final String f()
  {
    return this.f;
  }
  
  public final String g()
  {
    return this.h;
  }
  
  public final oih h()
  {
    return this.a;
  }
  
  public final int hashCode()
  {
    int n;
    int i2;
    label26:
    int i4;
    label44:
    int i5;
    int i6;
    if (this.a == null)
    {
      n = 0;
      int i1 = 31 * (n + 31);
      if (this.b != null) {
        break label113;
      }
      i2 = 0;
      int i3 = 31 * (i2 + i1);
      if (this.c != null) {
        break label124;
      }
      i4 = 0;
      i5 = 31 * (i4 + i3);
      String str = this.d;
      i6 = 0;
      if (str != null) {
        break label136;
      }
    }
    for (;;)
    {
      return 17 * (17 * (i5 + i6) + Long.valueOf(this.e).hashCode()) + Long.valueOf(this.i).hashCode();
      n = this.a.hashCode();
      break;
      label113:
      i2 = this.b.hashCode();
      break label26;
      label124:
      i4 = this.c.hashCode();
      break label44;
      label136:
      i6 = this.d.hashCode();
    }
  }
  
  public final long i()
  {
    return this.e;
  }
  
  public final String toString()
  {
    String str1 = this.c;
    String str2 = this.h;
    String str3 = String.valueOf(this.b);
    return 24 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + "[MediaItem clusterId=" + str1 + " " + str2 + " " + str3 + "]";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeParcelable(this.b, 0);
    paramParcel.writeLong(this.e);
    paramParcel.writeLong(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeString(this.h);
    if (this.a != null) {}
    for (byte[] arrayOfByte = qat.a(this.a);; arrayOfByte = null)
    {
      paramParcel.writeByteArray(arrayOfByte);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpu
 * JD-Core Version:    0.7.0.1
 */