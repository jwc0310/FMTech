import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.style.URLSpan;

public final class khu
  implements Parcelable
{
  public static final Parcelable.Creator<khu> CREATOR = new khv();
  public final URLSpan a;
  public final int b;
  public final int c;
  
  public khu(Parcel paramParcel)
  {
    this.a = ((URLSpan)paramParcel.readParcelable(URLSpan.class.getClassLoader()));
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
  }
  
  public khu(URLSpan paramURLSpan, int paramInt1, int paramInt2)
  {
    this.a = paramURLSpan;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     khu
 * JD-Core Version:    0.7.0.1
 */