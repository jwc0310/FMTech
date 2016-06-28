import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class ivg
  implements Parcelable
{
  public static final Parcelable.Creator<ivg> CREATOR = new ivh();
  public final String a;
  private String b;
  
  ivg(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.a = paramParcel.readString();
  }
  
  public ivg(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      throw new IllegalArgumentException("gaiaId cannot be empty");
    }
    this.b = paramString1;
    if (TextUtils.isEmpty(paramString2)) {
      throw new IllegalArgumentException("clusterId cannot be empty");
    }
    this.a = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ivg localivg;
    do
    {
      return true;
      if (!(paramObject instanceof ivg)) {
        return false;
      }
      localivg = (ivg)paramObject;
    } while ((this.b.equals(localivg.b)) && (this.a.equals(localivg.a)));
    return false;
  }
  
  public final int hashCode()
  {
    int i;
    int j;
    int k;
    if (this.b == null)
    {
      i = 0;
      j = 31 * (i + 31);
      String str = this.a;
      k = 0;
      if (str != null) {
        break label45;
      }
    }
    for (;;)
    {
      return j + k;
      i = this.b.hashCode();
      break;
      label45:
      k = this.a.hashCode();
    }
  }
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("ClusterId [%s]", arrayOfObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivg
 * JD-Core Version:    0.7.0.1
 */