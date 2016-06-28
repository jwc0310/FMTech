import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class lmg
  extends mab
  implements Parcelable
{
  public static final Parcelable.Creator<lmg> CREATOR = new lmh();
  public final int a;
  public final String b;
  public final String c;
  public final int d;
  public final int e;
  public final boolean f;
  public final String g;
  public final double h;
  
  public lmg(int paramInt, Integer paramInteger1, Integer paramInteger2, String paramString1, String paramString2, String paramString3, double paramDouble)
  {
    if ((paramInt < 0) || (paramInt > 3)) {
      throw new IllegalArgumentException();
    }
    this.a = paramInt;
    this.c = paramString1;
    this.b = paramString2;
    this.g = paramString3;
    boolean bool;
    if ((paramInteger1 != null) && (paramInteger2 != null))
    {
      bool = true;
      this.f = bool;
      if (!this.f) {
        break label97;
      }
      this.d = paramInteger1.intValue();
      this.e = paramInteger2.intValue();
    }
    for (;;)
    {
      this.h = paramDouble;
      return;
      bool = false;
      break;
      label97:
      this.e = 0;
      this.d = 0;
    }
  }
  
  public lmg(int paramInt, onv paramonv)
  {
    if ((paramInt < 0) || (paramInt > 3) || (paramonv == null)) {
      throw new IllegalArgumentException();
    }
    this.a = paramInt;
    this.c = paramonv.e;
    this.b = paramonv.f;
    this.g = paramonv.g;
    Integer localInteger1;
    Integer localInteger2;
    label79:
    boolean bool;
    if (paramonv.a != null)
    {
      localInteger1 = paramonv.a;
      if (paramonv.b == null) {
        break label172;
      }
      localInteger2 = paramonv.b;
      if ((localInteger1 == null) || (localInteger2 == null)) {
        break label206;
      }
      bool = true;
      label91:
      this.f = bool;
      if (!this.f) {
        break label212;
      }
      this.d = localInteger1.intValue();
      this.e = localInteger2.intValue();
      label121:
      if (paramonv.h != null) {
        break label225;
      }
    }
    label172:
    label206:
    label212:
    label225:
    for (double d1 = -1.0D;; d1 = paramonv.h.doubleValue())
    {
      this.h = d1;
      return;
      if (paramonv.c != null)
      {
        localInteger1 = Integer.valueOf((int)(10000000.0D * paramonv.c.floatValue()));
        break;
      }
      localInteger1 = null;
      break;
      if (paramonv.d != null)
      {
        localInteger2 = Integer.valueOf((int)(10000000.0D * paramonv.d.floatValue()));
        break label79;
      }
      localInteger2 = null;
      break label79;
      bool = false;
      break label91;
      this.e = 0;
      this.d = 0;
      break label121;
    }
  }
  
  lmg(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.c = paramParcel.readString();
    this.b = paramParcel.readString();
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.f = bool;
      this.d = paramParcel.readInt();
      this.e = paramParcel.readInt();
      this.h = paramParcel.readDouble();
      this.g = paramParcel.readString();
      return;
    }
  }
  
  public lmg(fwt paramfwt, qkn paramqkn)
  {
    int i;
    label116:
    int j;
    label155:
    Long localLong;
    if ((paramfwt.c() == null) || (paramfwt.b() == null))
    {
      i = 1;
      this.a = i;
      this.b = paramfwt.b();
      this.c = paramfwt.c();
      paramfwt.d();
      this.f = true;
      if (!this.f) {
        break label302;
      }
      this.d = ((int)(10000000.0D * efj.a(Double.valueOf(paramfwt.d().a))));
      this.e = ((int)(10000000.0D * efj.a(Double.valueOf(paramfwt.d().b))));
      if ((paramqkn == null) || (paramqkn.a == null) || (paramqkn.a.a == null) || (paramqkn.a.a.longValue() == 0L)) {
        break label315;
      }
      j = 1;
      if ((j == 0) || (paramfwt.e())) {
        break label333;
      }
      localLong = paramqkn.a.a;
      if (localLong.longValue() >= 0L) {
        break label321;
      }
      long l1 = localLong.longValue();
      long l2 = (0xFFFFFFFF & l1 >> 1) / 5L;
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l2);
      String str = String.valueOf(String.format(localLocale, "%d", arrayOfObject));
      long l3 = l1 - 10L * l2;
      this.g = (20 + String.valueOf(str).length() + str + l3);
    }
    for (;;)
    {
      this.h = -1.0D;
      return;
      i = 3;
      break;
      label302:
      this.e = 0;
      this.d = 0;
      break label116;
      label315:
      j = 0;
      break label155;
      label321:
      this.g = localLong.toString();
      continue;
      label333:
      this.g = null;
    }
  }
  
  public lmg(qcz paramqcz)
  {
    if (paramqcz == null) {
      throw new IllegalArgumentException();
    }
    this.a = 3;
    qdq localqdq;
    String str;
    if ((paramqcz.c != null) && (paramqcz.c.b(qdq.a) != null))
    {
      localqdq = (qdq)paramqcz.c.b(qdq.a);
      if (localqdq.b == null)
      {
        str = paramqcz.b;
        this.c = str;
        if ((localqdq.d == null) || (localqdq.d.b(qea.a) == null)) {
          break label244;
        }
        this.b = ((qea)localqdq.d.b(qea.a)).c;
        label112:
        if ((localqdq.e == null) || (localqdq.e.b(qdd.a) == null)) {
          break label252;
        }
        qdd localqdd = (qdd)localqdq.e.b(qdd.a);
        Double localDouble1 = localqdd.c;
        boolean bool = false;
        if (localDouble1 != null)
        {
          Double localDouble2 = localqdd.d;
          bool = false;
          if (localDouble2 != null) {
            bool = true;
          }
        }
        this.f = bool;
        this.d = ((int)(10000000.0D * efj.a(localqdd.c)));
        this.e = ((int)(10000000.0D * efj.a(localqdd.d)));
      }
    }
    label220:
    for (this.g = localqdq.f;; this.g = null)
    {
      this.h = -1.0D;
      return;
      str = localqdq.b;
      break;
      label244:
      this.b = null;
      break label112;
      label252:
      this.f = false;
      this.e = 0;
      this.d = 0;
      break label220;
      this.c = paramqcz.b;
      this.b = null;
      this.f = false;
      this.e = 0;
      this.d = 0;
    }
  }
  
  public lmg(qek paramqek)
  {
    if (paramqek == null) {
      throw new IllegalArgumentException();
    }
    this.a = 3;
    this.c = paramqek.a;
    String str;
    boolean bool;
    if (paramqek.c == null)
    {
      str = null;
      this.b = str;
      if (paramqek.d == null) {
        break label144;
      }
      if ((paramqek.d.a == null) || (paramqek.d.b == null)) {
        break label139;
      }
      bool = true;
      label72:
      this.f = bool;
      this.d = ((int)(10000000.0D * efj.a(paramqek.d.a)));
      this.e = ((int)(10000000.0D * efj.a(paramqek.d.b)));
    }
    for (;;)
    {
      this.h = -1.0D;
      this.g = null;
      return;
      str = paramqek.c.a;
      break;
      label139:
      bool = false;
      break label72;
      label144:
      this.f = false;
      this.e = 0;
      this.d = 0;
    }
  }
  
  public static lmg a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getInt();
    String str1 = d(localByteBuffer);
    String str2 = d(localByteBuffer);
    int j;
    int k;
    int m;
    double d1;
    String str3;
    if (localByteBuffer.getInt() != 0)
    {
      j = 1;
      k = localByteBuffer.getInt();
      m = localByteBuffer.getInt();
      d1 = localByteBuffer.getDouble();
      str3 = d(localByteBuffer);
      if (j == 0) {
        break label114;
      }
    }
    label114:
    for (Integer localInteger1 = Integer.valueOf(k);; localInteger1 = null)
    {
      Integer localInteger2 = null;
      if (j != 0) {
        localInteger2 = Integer.valueOf(m);
      }
      return new lmg(i, localInteger1, localInteger2, str1, str2, str3, d1);
      j = 0;
      break;
    }
  }
  
  public static byte[] a(lmg paramlmg)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(32);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    localDataOutputStream.writeInt(paramlmg.a);
    a(localDataOutputStream, paramlmg.c);
    a(localDataOutputStream, paramlmg.b);
    if (paramlmg.f) {}
    for (int i = 1;; i = 0)
    {
      localDataOutputStream.writeInt(i);
      localDataOutputStream.writeInt(paramlmg.d);
      localDataOutputStream.writeInt(paramlmg.e);
      localDataOutputStream.writeDouble(paramlmg.h);
      a(localDataOutputStream, paramlmg.g);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localDataOutputStream.close();
      return arrayOfByte;
    }
  }
  
  public final String a(Context paramContext)
  {
    if (!TextUtils.isEmpty(this.c)) {
      return this.c;
    }
    if (!TextUtils.isEmpty(this.b)) {
      return this.b;
    }
    if (this.f)
    {
      Resources localResources = paramContext.getResources();
      int i = do.av;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(this.d / 10000000.0D);
      arrayOfObject[1] = Double.valueOf(this.e / 10000000.0D);
      return localResources.getString(i, arrayOfObject);
    }
    return "";
  }
  
  public final onv a()
  {
    onv localonv = new onv();
    localonv.e = this.c;
    localonv.f = this.b;
    localonv.g = this.g;
    if (this.f)
    {
      localonv.a = Integer.valueOf(this.d);
      localonv.b = Integer.valueOf(this.e);
    }
    if (this.h >= 0.0D) {
      localonv.h = Double.valueOf(this.h);
    }
    return localonv;
  }
  
  public final boolean b(lmg paramlmg)
  {
    if (this == paramlmg) {}
    label23:
    label38:
    label168:
    label172:
    for (;;)
    {
      return true;
      if (paramlmg == null) {
        return false;
      }
      int i;
      int m;
      int j;
      if (this.a == 1)
      {
        i = 1;
        if (i != 0)
        {
          if (paramlmg.a != 1) {
            break label157;
          }
          m = 1;
          if (m != 0) {
            break label161;
          }
        }
        if (this.a != 2) {
          break label163;
        }
        j = 1;
        label53:
        if (j != 0) {
          if (paramlmg.a != 2) {
            break label168;
          }
        }
      }
      for (int k = 1;; k = 0)
      {
        if (k != 0) {
          break label172;
        }
        if ((this.a == 3) && (paramlmg.a == 3) && (TextUtils.equals(this.c, paramlmg.c)) && (TextUtils.equals(this.b, paramlmg.b)) && (this.f == paramlmg.f) && (this.d == paramlmg.d) && (this.e == paramlmg.e)) {
          break;
        }
        return false;
        i = 0;
        break label23;
        m = 0;
        break label38;
        break;
        j = 0;
        break label53;
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    String str1;
    switch (this.a)
    {
    default: 
      int k = this.a;
      str1 = 20 + "unknown(" + k + ")";
    }
    for (;;)
    {
      String str2 = String.valueOf(str1);
      String str3 = this.c;
      String str4 = this.b;
      boolean bool = this.f;
      int i = this.d;
      int j = this.e;
      String str5 = this.g;
      double d1 = this.h;
      return 141 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "LocationValue type: " + str2 + ", name: " + str3 + ", addr: " + str4 + ", hasCoord: " + bool + ", latE7: " + i + ", lngE7: " + j + ", cluster: " + str5 + ", precision: " + d1;
      str1 = "precise";
      continue;
      str1 = "coarse";
      continue;
      str1 = "place";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.b);
    if (this.f) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      paramParcel.writeInt(this.d);
      paramParcel.writeInt(this.e);
      paramParcel.writeDouble(this.h);
      paramParcel.writeString(this.g);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmg
 * JD-Core Version:    0.7.0.1
 */