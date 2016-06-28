import android.os.Parcel;
import android.os.Parcelable.Creator;

final class iwe
  implements Parcelable.Creator<iwd>
{
  private static iwd a(Parcel paramParcel)
  {
    iwf localiwf = iwf.values()[paramParcel.readByte()];
    int i = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {}
    for (int j = 1;; j = 0)
    {
      plo localplo = null;
      if (j != 0) {
        localplo = new plo();
      }
      try
      {
        byte[] arrayOfByte = paramParcel.createByteArray();
        qat.b(localplo, arrayOfByte, 0, arrayOfByte.length);
        return new iwd(localiwf, i, localplo, paramParcel.readString());
      }
      catch (qas localqas)
      {
        throw new IllegalArgumentException("Invalid storyboard proto", localqas);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iwe
 * JD-Core Version:    0.7.0.1
 */