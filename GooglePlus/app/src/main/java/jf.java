import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class jf<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final je<T> a;
  
  public jf(je<T> paramje)
  {
    this.a = paramje;
  }
  
  public final T createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public final T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.a.a(paramParcel, paramClassLoader);
  }
  
  public final T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jf
 * JD-Core Version:    0.7.0.1
 */