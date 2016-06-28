import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ikf
  implements Parcelable
{
  public static final Parcelable.Creator<ikf> CREATOR = new ikg();
  public final boolean a;
  private final boolean b;
  private final String c;
  private final gnb d;
  private final gnb e;
  
  ikf(Parcel paramParcel)
  {
    int j;
    if (paramParcel.readInt() == i)
    {
      j = i;
      this.b = j;
      this.c = paramParcel.readString();
      if (paramParcel.readInt() != i) {
        break label80;
      }
    }
    for (;;)
    {
      this.a = i;
      this.d = ((gnb)paramParcel.readParcelable(gnb.class.getClassLoader()));
      this.e = ((gnb)paramParcel.readParcelable(gnb.class.getClassLoader()));
      return;
      j = 0;
      break;
      label80:
      i = 0;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    int j;
    if (this.b)
    {
      j = i;
      paramParcel.writeInt(j);
      paramParcel.writeString(this.c);
      if (!this.a) {
        break label63;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      paramParcel.writeParcelable(this.d, 0);
      paramParcel.writeParcelable(this.e, 0);
      return;
      j = 0;
      break;
      label63:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ikf
 * JD-Core Version:    0.7.0.1
 */