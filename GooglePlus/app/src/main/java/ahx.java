import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

final class ahx
  implements Parcelable
{
  public static final Parcelable.Creator<ahx> CREATOR = new ahy();
  int a;
  int b;
  int c;
  int[] d;
  int e;
  int[] f;
  List<ahv> g;
  boolean h;
  boolean i;
  boolean j;
  
  public ahx() {}
  
  public ahx(ahx paramahx)
  {
    this.c = paramahx.c;
    this.a = paramahx.a;
    this.b = paramahx.b;
    this.d = paramahx.d;
    this.e = paramahx.e;
    this.f = paramahx.f;
    this.h = paramahx.h;
    this.i = paramahx.i;
    this.j = paramahx.j;
    this.g = paramahx.g;
  }
  
  ahx(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    if (this.c > 0)
    {
      this.d = new int[this.c];
      paramParcel.readIntArray(this.d);
    }
    this.e = paramParcel.readInt();
    if (this.e > 0)
    {
      this.f = new int[this.e];
      paramParcel.readIntArray(this.f);
    }
    int m;
    int n;
    if (paramParcel.readInt() == k)
    {
      m = k;
      this.h = m;
      if (paramParcel.readInt() != k) {
        break label152;
      }
      n = k;
      label114:
      this.i = n;
      if (paramParcel.readInt() != k) {
        break label158;
      }
    }
    for (;;)
    {
      this.j = k;
      this.g = paramParcel.readArrayList(ahv.class.getClassLoader());
      return;
      m = 0;
      break;
      label152:
      n = 0;
      break label114;
      label158:
      k = 0;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = 1;
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    if (this.c > 0) {
      paramParcel.writeIntArray(this.d);
    }
    paramParcel.writeInt(this.e);
    if (this.e > 0) {
      paramParcel.writeIntArray(this.f);
    }
    int m;
    int n;
    if (this.h)
    {
      m = k;
      paramParcel.writeInt(m);
      if (!this.i) {
        break label123;
      }
      n = k;
      label90:
      paramParcel.writeInt(n);
      if (!this.j) {
        break label129;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(k);
      paramParcel.writeList(this.g);
      return;
      m = 0;
      break;
      label123:
      n = 0;
      break label90;
      label129:
      k = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahx
 * JD-Core Version:    0.7.0.1
 */