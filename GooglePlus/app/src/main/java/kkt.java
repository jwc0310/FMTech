import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class kkt
  implements Parcelable
{
  public static final Parcelable.Creator<kkt> CREATOR = new kku();
  final String a;
  private final qbe b;
  
  public kkt(String paramString, qbe paramqbe)
  {
    this.a = paramString;
    this.b = paramqbe;
  }
  
  public final qbe a(String paramString)
  {
    if ((paramString != null) && (this.b != null))
    {
      this.b.c = new qbo();
      this.b.c.b = paramString;
    }
    return this.b;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.a != null) {
      paramParcel.writeString(this.a);
    }
    while (this.b != null)
    {
      paramParcel.writeByteArray(qbe.a(this.b));
      return;
      paramParcel.writeString(null);
    }
    paramParcel.writeString(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkt
 * JD-Core Version:    0.7.0.1
 */