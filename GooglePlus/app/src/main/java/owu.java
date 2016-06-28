import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.IOException;

public final class owu
  implements oww
{
  public static final Parcelable.Creator<owu> CREATOR = new owv();
  private volatile byte[] a;
  private volatile pzd b;
  
  public owu(byte[] paramArrayOfByte, pzd parampzd)
  {
    if ((paramArrayOfByte != null) || (parampzd != null)) {}
    for (int i = 1; i == 0; i = 0) {
      throw new IllegalArgumentException(String.valueOf("Must have a message or bytes"));
    }
    this.a = paramArrayOfByte;
    this.b = parampzd;
  }
  
  public final <T extends pzd> T a(T paramT, pxz parampxz)
  {
    if (this.b == null) {
      this.b = paramT.l().a(this.a, parampxz).f();
    }
    return this.b;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte[] arrayOfByte;
    if (this.a == null) {
      arrayOfByte = new byte[this.b.a()];
    }
    try
    {
      this.b.a(pxx.a(arrayOfByte));
      this.a = arrayOfByte;
      paramParcel.writeInt(this.a.length);
      paramParcel.writeByteArray(this.a);
      return;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     owu
 * JD-Core Version:    0.7.0.1
 */