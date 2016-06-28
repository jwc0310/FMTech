import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class jd<T>
  implements Parcelable.Creator<T>
{
  private je<T> a;
  
  public jd(je<T> paramje)
  {
    this.a = paramje;
  }
  
  public final T createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public final T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jd
 * JD-Core Version:    0.7.0.1
 */