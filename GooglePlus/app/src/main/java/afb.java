import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class afb
  implements Parcelable
{
  public static final Parcelable.Creator<afb> CREATOR = new afc();
  int a;
  int b;
  boolean c;
  
  public afb() {}
  
  public afb(afb paramafb)
  {
    this.a = paramafb.a;
    this.b = paramafb.b;
    this.c = paramafb.c;
  }
  
  afb(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == i) {}
    for (;;)
    {
      this.c = i;
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
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.c) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afb
 * JD-Core Version:    0.7.0.1
 */