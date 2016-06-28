import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class jkp
  implements jgw
{
  public static final Parcelable.Creator<jgw> CREATOR = new jkq();
  private final long a;
  private final String b;
  private final String c;
  private final String d;
  private final int e;
  private final int f;
  private final boolean g;
  
  jkp(Parcel paramParcel)
  {
    this.a = paramParcel.readLong();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    if (paramParcel.readByte() == i) {}
    for (;;)
    {
      this.g = i;
      return;
      i = 0;
    }
  }
  
  public jkp(fzk paramfzk)
  {
    this.a = paramfzk.a();
    this.b = efj.a(paramfzk);
    this.c = paramfzk.c();
    this.d = paramfzk.d();
    int i;
    switch (paramfzk.e())
    {
    case 0: 
    default: 
      i = -1;
    }
    for (;;)
    {
      this.e = i;
      this.f = paramfzk.f();
      this.g = paramfzk.h();
      return;
      i = 1;
      continue;
      i = 9;
      continue;
      i = 8;
      continue;
      i = 5;
      continue;
      i = 7;
    }
  }
  
  public final long a()
  {
    return this.a;
  }
  
  public final String b()
  {
    return this.b;
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
  
  public final int e()
  {
    return this.e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jgw)) {
      return false;
    }
    jgw localjgw = (jgw)paramObject;
    return this.b.equals(localjgw.b());
  }
  
  public final int f()
  {
    return this.f;
  }
  
  public final int g()
  {
    switch (this.e)
    {
    case 2: 
    case 3: 
    case 4: 
    case 6: 
    default: 
      return 11;
    case 1: 
      return 0;
    }
    return 3;
  }
  
  public final boolean h()
  {
    return this.g;
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    if (this.g) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeByte((byte)i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkp
 * JD-Core Version:    0.7.0.1
 */