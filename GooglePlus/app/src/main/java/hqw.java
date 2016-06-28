import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public final class hqw
  implements Parcelable
{
  public static final Parcelable.Creator<hqw> CREATOR = new hqx();
  private static final mcq a = new mcq("debug.social.die_hard");
  private qat b;
  private byte[] c;
  
  hqw(Parcel paramParcel)
  {
    this.c = paramParcel.createByteArray();
  }
  
  public hqw(qat paramqat)
  {
    this.b = paramqat;
  }
  
  public final <T extends qat> T a(T paramT)
  {
    if ((this.b == null) && (this.c != null)) {}
    try
    {
      byte[] arrayOfByte2 = this.c;
      this.b = qat.b(paramT, arrayOfByte2, 0, arrayOfByte2.length);
      this.c = null;
    }
    catch (qas localqas2)
    {
      for (;;)
      {
        try
        {
          qat localqat2 = this.b;
          return localqat2;
        }
        catch (ClassCastException localClassCastException)
        {
          try
          {
            byte[] arrayOfByte1 = qat.a(this.b);
            qat localqat1 = qat.b(paramT, arrayOfByte1, 0, arrayOfByte1.length);
            return localqat1;
          }
          catch (qas localqas1) {}
        }
        localqas2 = localqas2;
        Log.e("MessageNano", "Failed to deserialize", localqas2);
      }
    }
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ParcelableMessageNano(");
    if (this.b != null) {
      localStringBuilder.append(this.b);
    }
    for (;;)
    {
      return ')';
      if (this.c != null) {
        localStringBuilder.append("byte[").append(this.c.length).append(']');
      } else {
        localStringBuilder.append("null");
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if ((this.c == null) && (this.b != null))
    {
      this.c = qat.a(this.b);
      this.b = null;
    }
    paramParcel.writeByteArray(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqw
 * JD-Core Version:    0.7.0.1
 */