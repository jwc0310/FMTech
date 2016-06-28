import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class aws
  implements Parcelable
{
  public static final Parcelable.Creator<aws> CREATOR = new awt();
  final int a;
  final Object b;
  final Object c;
  
  public aws(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readValue(awp.class.getClassLoader());
    this.c = paramParcel.readValue(awp.class.getClassLoader());
  }
  
  public aws(Double paramDouble1, Double paramDouble2)
  {
    this.a = 0;
    this.b = paramDouble1;
    this.c = paramDouble2;
  }
  
  public aws(String paramString1, String paramString2)
  {
    this.a = 1;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeValue(this.b);
    paramParcel.writeValue(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aws
 * JD-Core Version:    0.7.0.1
 */