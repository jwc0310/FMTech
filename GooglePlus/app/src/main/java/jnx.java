import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class jnx
  implements jjg
{
  public static final Parcelable.Creator<jjg> CREATOR = new jny();
  final String a;
  ArrayList<jgw> b;
  public String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final int h;
  private String i;
  private int j;
  private boolean k;
  
  jnx(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    this.g = paramParcel.readString();
    this.h = paramParcel.readInt();
    this.b = paramParcel.readArrayList(jgw.class.getClassLoader());
    this.i = paramParcel.readString();
    this.j = paramParcel.readInt();
    if (paramParcel.readByte() == m) {}
    for (;;)
    {
      this.k = m;
      this.c = paramParcel.readString();
      return;
      m = 0;
    }
  }
  
  public jnx(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, ArrayList<jgw> paramArrayList, int paramInt2, boolean paramBoolean, String paramString5)
  {
    this.a = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.h = paramInt1;
    this.g = null;
    this.b = paramArrayList;
    this.j = paramInt2;
    this.k = paramBoolean;
    this.c = paramString5;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final long b()
  {
    return 0L;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final String d()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    return this.f;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jjg)) {
      return false;
    }
    jjg localjjg = (jjg)paramObject;
    if (localjjg == this) {
      return true;
    }
    return this.a.equals(localjjg.a());
  }
  
  public final String f()
  {
    return null;
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
    return this.a.hashCode();
  }
  
  public final List<jgw> i()
  {
    return this.b;
  }
  
  public final String j()
  {
    ArrayList localArrayList;
    if (this.i == null)
    {
      localArrayList = this.b;
      if ((localArrayList != null) && (!localArrayList.isEmpty())) {
        break label35;
      }
    }
    label35:
    StringBuilder localStringBuilder;
    for (String str = null;; str = localStringBuilder.toString())
    {
      this.i = str;
      return this.i;
      localStringBuilder = new StringBuilder();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        localStringBuilder.append(((jgw)localIterator.next()).b());
        localStringBuilder.append('|');
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
    }
  }
  
  public final int k()
  {
    return this.j;
  }
  
  public final long l()
  {
    return 0L;
  }
  
  public final boolean m()
  {
    return this.k;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeList(this.b);
    paramParcel.writeString(j());
    paramParcel.writeInt(this.j);
    if (this.k) {}
    for (int m = 1;; m = 0)
    {
      paramParcel.writeByte((byte)m);
      paramParcel.writeString(this.c);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jnx
 * JD-Core Version:    0.7.0.1
 */