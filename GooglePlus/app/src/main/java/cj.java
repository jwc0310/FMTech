import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class cj
  implements Parcelable
{
  public static final Parcelable.Creator<cj> CREATOR = new ck();
  final String a;
  final int b;
  final boolean c;
  final int d;
  final int e;
  final String f;
  final boolean g;
  final boolean h;
  final Bundle i;
  Bundle j;
  bk k;
  
  public cj(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
    boolean bool2;
    boolean bool3;
    if (paramParcel.readInt() != 0)
    {
      bool2 = bool1;
      this.c = bool2;
      this.d = paramParcel.readInt();
      this.e = paramParcel.readInt();
      this.f = paramParcel.readString();
      if (paramParcel.readInt() == 0) {
        break label110;
      }
      bool3 = bool1;
      label70:
      this.g = bool3;
      if (paramParcel.readInt() == 0) {
        break label116;
      }
    }
    for (;;)
    {
      this.h = bool1;
      this.i = paramParcel.readBundle();
      this.j = paramParcel.readBundle();
      return;
      bool2 = false;
      break;
      label110:
      bool3 = false;
      break label70;
      label116:
      bool1 = false;
    }
  }
  
  public cj(bk parambk)
  {
    this.a = parambk.getClass().getName();
    this.b = parambk.k;
    this.c = parambk.t;
    this.d = parambk.B;
    this.e = parambk.C;
    this.f = parambk.D;
    this.g = parambk.G;
    this.h = parambk.F;
    this.i = parambk.m;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 1;
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
    int n;
    int i1;
    if (this.c)
    {
      n = m;
      paramParcel.writeInt(n);
      paramParcel.writeInt(this.d);
      paramParcel.writeInt(this.e);
      paramParcel.writeString(this.f);
      if (!this.g) {
        break label109;
      }
      i1 = m;
      label68:
      paramParcel.writeInt(i1);
      if (!this.h) {
        break label115;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(m);
      paramParcel.writeBundle(this.i);
      paramParcel.writeBundle(this.j);
      return;
      n = 0;
      break;
      label109:
      i1 = 0;
      break label68;
      label115:
      m = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cj
 * JD-Core Version:    0.7.0.1
 */