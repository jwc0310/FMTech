import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;

final class knr
  implements Parcelable.Creator<knq>
{
  private static knq a(Parcel paramParcel)
  {
    byte[] arrayOfByte = paramParcel.createByteArray();
    Bundle localBundle = paramParcel.readBundle();
    knw localknw = (knw)paramParcel.readParcelable(knw.class.getClassLoader());
    if (arrayOfByte != null) {}
    knq localknq1;
    for (;;)
    {
      try
      {
        knq localknq2 = efj.a((oln)qat.b(new oln(), arrayOfByte, 0, arrayOfByte.length));
        localknq1 = localknq2;
        if (localknq1 != null) {
          break;
        }
        return efj.a(localBundle, localknw);
      }
      catch (qas localqas)
      {
        Log.e("ApiaryActivity", "Failed to parse LinkPreviewResponse from Parcel", localqas);
      }
      localknq1 = null;
    }
    return localknq1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knr
 * JD-Core Version:    0.7.0.1
 */