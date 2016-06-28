import android.os.Parcel;
import android.os.Parcelable.Creator;

final class gyl
  implements Parcelable.Creator<gyk>
{
  private static gyk a(Parcel paramParcel)
  {
    try
    {
      long l = paramParcel.readLong();
      int i = paramParcel.readInt();
      if (i > 0)
      {
        byte[] arrayOfByte = new byte[i];
        paramParcel.readByteArray(arrayOfByte);
        return new gyk(l, (njh)qat.b(new njh(), arrayOfByte, 0, arrayOfByte.length));
      }
      throw new IllegalStateException("LogEvent's length was 0");
    }
    catch (qas localqas)
    {
      throw new IllegalStateException("Unable to de-serialize StoredLog", localqas);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyl
 * JD-Core Version:    0.7.0.1
 */