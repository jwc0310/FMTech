import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class jlr
  implements jjg
{
  public static final Parcelable.Creator<jjg> CREATOR = new jls();
  private final long a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final int h;
  private final int i;
  private final long j;
  private final boolean k;
  private List<jgw> l;
  private String m;
  private String[] n;
  private Map<String, jgw> o;
  
  jlr(Parcel paramParcel)
  {
    this.a = paramParcel.readLong();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    this.g = paramParcel.readString();
    this.h = paramParcel.readInt();
    this.l = paramParcel.readArrayList(jgw.class.getClassLoader());
    this.m = paramParcel.readString();
    this.i = paramParcel.readInt();
    this.j = paramParcel.readLong();
    if (paramParcel.readByte() == i1) {}
    for (;;)
    {
      this.k = i1;
      return;
      i1 = 0;
    }
  }
  
  public jlr(fzp paramfzp, Map<String, jgw> paramMap)
  {
    this.a = paramfzp.a();
    this.b = paramfzp.b();
    this.c = paramfzp.c();
    this.d = paramfzp.d();
    this.e = paramfzp.e();
    this.f = paramfzp.f();
    this.g = paramfzp.g();
    this.h = paramfzp.h();
    this.n = a(paramfzp);
    this.o = paramMap;
    this.i = paramfzp.j();
    this.j = paramfzp.k();
    this.k = paramfzp.l();
  }
  
  private static String[] a(fzp paramfzp)
  {
    if ((paramfzp == null) || (paramfzp.i() == null)) {
      return null;
    }
    String[] arrayOfString1 = paramfzp.i();
    String[] arrayOfString2 = new String[arrayOfString1.length];
    int i1 = 0;
    if (i1 < arrayOfString1.length)
    {
      String str1 = String.valueOf(arrayOfString1[i1]);
      if (str1.length() != 0) {}
      for (String str2 = "f.".concat(str1);; str2 = new String("f."))
      {
        arrayOfString2[i1] = str2;
        i1++;
        break;
      }
    }
    return arrayOfString2;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final long b()
  {
    return this.a;
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public final String d()
  {
    return this.d;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    return this.e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jjg)) {
      return false;
    }
    jjg localjjg = (jjg)paramObject;
    return this.b.equals(localjjg.a());
  }
  
  public final String f()
  {
    return this.f;
  }
  
  public final String g()
  {
    return this.g;
  }
  
  public final int h()
  {
    return this.h;
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final List<jgw> i()
  {
    if ((this.l == null) && (this.n != null) && (this.o != null))
    {
      this.l = new ArrayList();
      String[] arrayOfString = this.n;
      int i1 = arrayOfString.length;
      int i2 = 0;
      if (i2 < i1)
      {
        String str = arrayOfString[i2];
        jgw localjgw = (jgw)this.o.get(str);
        if (localjgw != null) {
          this.l.add(localjgw);
        }
        for (;;)
        {
          i2++;
          break;
          Log.e("PersonResourceImpl", String.format("Circle %s is not found in the cached circle list.", new Object[] { str }));
        }
      }
    }
    if (this.l == null) {
      return Collections.EMPTY_LIST;
    }
    return this.l;
  }
  
  public final String j()
  {
    if (this.m == null) {
      this.m = efj.h(i());
    }
    return this.m;
  }
  
  public final int k()
  {
    return this.i;
  }
  
  public final long l()
  {
    return this.j;
  }
  
  public final boolean m()
  {
    return this.k;
  }
  
  public final String toString()
  {
    return this.d;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeList(i());
    paramParcel.writeString(j());
    paramParcel.writeInt(this.i);
    paramParcel.writeLong(this.j);
    if (this.k) {}
    for (int i1 = 1;; i1 = 0)
    {
      paramParcel.writeByte((byte)i1);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlr
 * JD-Core Version:    0.7.0.1
 */