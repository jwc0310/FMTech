import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.IOException;

public class knq
  implements Parcelable
{
  public static final Parcelable.Creator<knq> CREATOR = new knr();
  public static final int[] d = { 0 };
  public static final int[] e = { 365 };
  public oln a;
  public Bundle b;
  public knw c;
  
  public final String a()
  {
    if (this.a == null) {}
    for (String[] arrayOfString = null; (arrayOfString == null) || (arrayOfString.length == 0); arrayOfString = this.a.d) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder("[");
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append(arrayOfString[j]);
      localStringBuilder.append(',');
    }
    localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  protected void a(ooa paramooa)
  {
    if (this.a == null) {
      throw new IOException("No metadata.");
    }
  }
  
  public final void b()
  {
    if (this.a == null)
    {
      if (this.b == null) {
        throw new IOException("No metadata.");
      }
    }
    else {
      a(this.a.b[0]);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.a != null) {
      paramParcel.writeByteArray(oln.a(this.a));
    }
    for (;;)
    {
      paramParcel.writeBundle(this.b);
      paramParcel.writeParcelable(this.c, 0);
      return;
      paramParcel.writeString(null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knq
 * JD-Core Version:    0.7.0.1
 */