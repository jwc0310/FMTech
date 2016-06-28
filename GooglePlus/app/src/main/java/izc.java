import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class izc
  implements Parcelable
{
  public static final Parcelable.Creator<izc> CREATOR = new izd();
  long a;
  String b;
  int c;
  long d;
  String e;
  boolean f;
  private int g;
  private String h;
  
  public izc(Context paramContext, int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, int paramInt3, long paramLong2)
  {
    this.a = paramLong1;
    this.g = paramInt2;
    this.h = paramString1;
    this.b = paramString2;
    this.c = paramInt3;
    this.d = paramLong2;
    this.e = ize.a(paramContext, paramInt1);
    switch (paramInt3)
    {
    }
    for (boolean bool = false;; bool = true)
    {
      this.f = bool;
      return;
    }
  }
  
  izc(Parcel paramParcel)
  {
    this.g = paramParcel.readInt();
    this.a = paramParcel.readLong();
    this.h = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readLong();
    this.e = paramParcel.readString();
    if (paramParcel.readInt() == i) {}
    for (;;)
    {
      this.f = i;
      return;
      i = 0;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.g);
    paramParcel.writeLong(this.a);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeLong(this.d);
    paramParcel.writeString(this.e);
    if (this.f) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeByte((byte)i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izc
 * JD-Core Version:    0.7.0.1
 */