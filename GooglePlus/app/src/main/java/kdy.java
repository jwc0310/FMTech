import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class kdy
  extends keu
{
  public static final Parcelable.Creator<kdy> CREATOR = new kdz();
  boolean a;
  Bundle b;
  
  public kdy(Parcel paramParcel)
  {
    super(paramParcel);
    if (paramParcel.readInt() == i) {}
    for (;;)
    {
      this.a = i;
      this.b = paramParcel.readBundle();
      return;
      i = 0;
    }
  }
  
  public kdy(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    if (this.a) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      paramParcel.writeBundle(this.b);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdy
 * JD-Core Version:    0.7.0.1
 */