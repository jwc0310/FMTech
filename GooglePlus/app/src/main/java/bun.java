import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class bun
  implements Parcelable
{
  public ArrayList<hur> a = new ArrayList();
  
  public bun()
  {
    this.a = new ArrayList();
  }
  
  public bun(Parcel paramParcel)
  {
    this.a.clear();
    int i = paramParcel.readInt();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = new byte[paramParcel.readInt()];
      paramParcel.readByteArray(arrayOfByte);
      Parcel localParcel = Parcel.obtain();
      localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
      localParcel.setDataPosition(0);
      hur localhur = new hur(localParcel);
      localParcel.recycle();
      this.a.add(localhur);
    }
  }
  
  public bun(bun parambun)
  {
    this.a = new ArrayList(parambun.a);
  }
  
  public final byte[] a()
  {
    Parcel localParcel = Parcel.obtain();
    writeToParcel(localParcel, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    return arrayOfByte;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a.size());
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      hur localhur = (hur)localIterator.next();
      Parcel localParcel = Parcel.obtain();
      localhur.writeToParcel(localParcel, 0);
      byte[] arrayOfByte = localParcel.marshall();
      localParcel.recycle();
      paramParcel.writeInt(arrayOfByte.length);
      paramParcel.writeByteArray(arrayOfByte);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bun
 * JD-Core Version:    0.7.0.1
 */