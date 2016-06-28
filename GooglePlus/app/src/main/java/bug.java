import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.Arrays;

public final class bug
  implements Parcelable
{
  public static final Parcelable.Creator<bug> CREATOR = new buh();
  public final String a;
  public final obg[] b;
  
  bug(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    try
    {
      obf localobf = new obf();
      byte[] arrayOfByte = paramParcel.createByteArray();
      arrayOfobg = ((obf)qat.b(localobf, arrayOfByte, 0, arrayOfByte.length)).a;
      this.b = arrayOfobg;
      return;
    }
    catch (qas localqas)
    {
      for (;;)
      {
        Log.e("NotifSettingsCategory", "Unable to deserialize NotificationSettings. This should not happen since was serialized earlier by writeToParcel.");
        obg[] arrayOfobg = null;
      }
    }
  }
  
  public bug(String paramString, obg[] paramArrayOfobg)
  {
    this.a = paramString;
    this.b = paramArrayOfobg;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "Category: " + this.a + " Settings: " + Arrays.asList(this.b);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    obf localobf = new obf();
    localobf.a = this.b;
    paramParcel.writeByteArray(qat.a(localobf));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bug
 * JD-Core Version:    0.7.0.1
 */