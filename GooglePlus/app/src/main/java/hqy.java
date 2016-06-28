import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class hqy
  implements Parcelable
{
  public static final Parcelable.Creator<hqy> CREATOR = new hqz();
  private List<? extends qat> a;
  private byte[] b;
  
  hqy(Parcel paramParcel)
  {
    this.b = paramParcel.createByteArray();
  }
  
  public hqy(List<? extends qat> paramList)
  {
    this.a = paramList;
  }
  
  public hqy(qat[] paramArrayOfqat)
  {
    if (paramArrayOfqat != null) {
      this.a = Arrays.asList(paramArrayOfqat);
    }
  }
  
  public final <T extends qat> T[] a(T[] paramArrayOfT)
  {
    Class localClass = paramArrayOfT.getClass().getComponentType();
    if ((this.a == null) && (this.b != null))
    {
      this.a = hqv.a(this.b, localClass);
      this.b = null;
    }
    List localList = this.a;
    if (localList == null) {
      return null;
    }
    return (qat[])localList.toArray(paramArrayOfT);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ParcelableMessageNano(");
    if (this.a != null) {
      localStringBuilder.append(this.a);
    }
    for (;;)
    {
      return ')';
      if (this.b != null) {
        localStringBuilder.append("byte[").append(this.b.length).append(']');
      } else {
        localStringBuilder.append("null");
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if ((this.b == null) && (this.a != null))
    {
      this.b = hqv.a(this.a);
      this.a = null;
    }
    paramParcel.writeByteArray(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqy
 * JD-Core Version:    0.7.0.1
 */