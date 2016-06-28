import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class iwd
  implements Parcelable
{
  public static final Parcelable.Creator<iwd> CREATOR = new iwe();
  private iwf a;
  private int b;
  private plo c;
  private String d;
  
  public iwd(iwf paramiwf, int paramInt, plo paramplo, String paramString)
  {
    if (paramiwf == null) {
      throw new IllegalArgumentException("status cannot be null");
    }
    if (paramiwf == iwf.a)
    {
      if (paramplo == null) {
        throw new IllegalArgumentException("null storyboard with OK status");
      }
      if (paramString == null) {
        throw new IllegalArgumentException("null versionId with OK status");
      }
    }
    this.a = paramiwf;
    this.b = paramInt;
    this.c = paramplo;
    this.d = paramString;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Integer.valueOf(this.b);
    if (this.c == null) {}
    for (String str = "null";; str = efj.a(this.c))
    {
      arrayOfObject[2] = str;
      arrayOfObject[3] = this.d;
      return String.format("GetStoryboardResult[%s, %s, %s, %s]", arrayOfObject);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByte((byte)this.a.ordinal());
    paramParcel.writeInt(this.b);
    if (this.c != null) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeByte((byte)i);
      if (this.c != null) {
        paramParcel.writeByteArray(qat.a(this.c));
      }
      paramParcel.writeString(this.d);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iwd
 * JD-Core Version:    0.7.0.1
 */