import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class kfq
  extends keu
{
  public static final Parcelable.Creator<kfq> CREATOR = new kfr();
  public boolean a;
  public Bundle b;
  
  public kfq(Parcel paramParcel)
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
  
  public kfq(Parcelable paramParcelable)
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
 * Qualified Name:     kfq
 * JD-Core Version:    0.7.0.1
 */