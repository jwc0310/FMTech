import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cua
  implements Parcelable
{
  public static final Parcelable.Creator<cua> CREATOR = new cub();
  final int a;
  final int b;
  final int c;
  final gxt d;
  
  public cua(int paramInt1, int paramInt2, int paramInt3, gxt paramgxt)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramgxt;
  }
  
  cua(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = new gxt(paramParcel.readInt());
  }
  
  public static cua a(int paramInt)
  {
    return new cua(paramInt, 0, 0, new gxt(0));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof cua;
    boolean bool2 = false;
    if (bool1)
    {
      int i = ((cua)paramObject).a;
      int j = this.a;
      bool2 = false;
      if (i == j) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    return this.a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cua
 * JD-Core Version:    0.7.0.1
 */