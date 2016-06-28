import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;

final class kku
  implements Parcelable.Creator<kkt>
{
  private static kkt a(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    byte[] arrayOfByte = paramParcel.createByteArray();
    if (arrayOfByte != null) {
      try
      {
        kkt localkkt = new kkt(str, (qbe)qat.b(new qbe(), arrayOfByte, 0, arrayOfByte.length));
        return localkkt;
      }
      catch (qas localqas)
      {
        Log.e("Preview", "Failed to parse EmbedClientItem from Parcel", localqas);
        throw new IllegalStateException("Failed to parse EmbedClientItem from Parcel", localqas);
      }
    }
    return new kkt(null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kku
 * JD-Core Version:    0.7.0.1
 */