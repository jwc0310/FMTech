import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class cyf
  implements Parcelable
{
  public static final Parcelable.Creator<cyf> CREATOR = new cyg();
  public final String a;
  public String b;
  public final String c;
  public int d;
  public boolean e;
  public String f;
  public boolean g;
  private int h;
  private long i;
  
  public cyf(Context paramContext, Bundle paramBundle)
  {
    this(paramContext, paramBundle.getString("circle_name"), paramBundle.getString("circle_id"), 0, 0L);
    if (paramBundle.containsKey("view"))
    {
      this.d = paramBundle.getInt("view");
      return;
    }
    this.d = 1;
  }
  
  public cyf(Context paramContext, String paramString1, String paramString2, int paramInt, long paramLong)
  {
    if (paramString2 == null) {
      paramString2 = "v.all.circles";
    }
    this.a = paramString2;
    this.h = paramInt;
    this.i = paramLong;
    if (paramString2.equals("v.all.circles"))
    {
      this.d = 1;
      this.b = paramContext.getString(aau.hb);
      this.c = null;
      this.e = true;
    }
    for (;;)
    {
      b();
      return;
      if (paramString2.equals("v.whatshot"))
      {
        this.d = 2;
        this.b = paramContext.getString(aau.uF);
        this.c = null;
        this.e = true;
        this.g = true;
      }
      else
      {
        this.d = 3;
        this.b = paramString1;
        this.c = paramString2;
        this.e = false;
      }
    }
  }
  
  public cyf(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.h = paramParcel.readInt();
    this.d = paramParcel.readInt();
    if (paramParcel.readInt() == j) {}
    for (;;)
    {
      this.e = j;
      this.i = paramParcel.readLong();
      b();
      return;
      j = 0;
    }
  }
  
  private final void b()
  {
    if (this.a != null)
    {
      if (this.a.equals("v.all.circles"))
      {
        this.f = "virtual_circles";
        return;
      }
      if (this.a.equals("v.whatshot"))
      {
        this.f = "explore";
        return;
      }
    }
    this.f = null;
  }
  
  public final long a()
  {
    if (this.e) {
      return this.i;
    }
    if (this.a != null) {
      return this.a.hashCode();
    }
    return 0L;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    cyf localcyf;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localcyf = (cyf)paramObject;
    } while ((this.b == localcyf.b) && (this.c == localcyf.c) && (this.h == localcyf.h) && (a() == localcyf.a()));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = Integer.valueOf(this.h);
    arrayOfObject[3] = Long.valueOf(this.i);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return this.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.d);
    if (this.e) {}
    for (int j = 1;; j = 0)
    {
      paramParcel.writeInt(j);
      paramParcel.writeLong(this.i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyf
 * JD-Core Version:    0.7.0.1
 */