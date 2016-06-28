import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class hur
  implements Parcelable
{
  public int a;
  public ori b;
  public ArrayList<odg> c;
  public ArrayList<odg> d;
  private boolean e;
  
  public hur(int paramInt, ori paramori, ArrayList<odg> paramArrayList, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramori;
    this.c = paramArrayList;
    this.e = paramBoolean;
  }
  
  public hur(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    byte[] arrayOfByte1;
    if ((3 == this.a) || (2 == this.a))
    {
      arrayOfByte1 = new byte[paramParcel.readInt()];
      paramParcel.readByteArray(arrayOfByte1);
    }
    try
    {
      this.b = ((ori)qat.b(new ori(), arrayOfByte1, 0, arrayOfByte1.length));
      int i = paramParcel.readInt();
      this.c = new ArrayList(i);
      j = 0;
      if (j < i)
      {
        arrayOfByte2 = new byte[paramParcel.readInt()];
        paramParcel.readByteArray(arrayOfByte2);
      }
    }
    catch (qas localqas1)
    {
      try
      {
        for (;;)
        {
          int j;
          byte[] arrayOfByte2;
          odg localodg = (odg)qat.b(new odg(), arrayOfByte2, 0, arrayOfByte2.length);
          this.c.add(localodg);
          label135:
          j++;
          continue;
          localqas1 = localqas1;
          this.b = null;
        }
        if (paramParcel.readInt() != 0) {}
        for (boolean bool = true;; bool = false)
        {
          this.e = bool;
          return;
        }
      }
      catch (qas localqas2)
      {
        break label135;
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    if ((3 == this.a) || (2 == this.a))
    {
      byte[] arrayOfByte1 = qat.a(this.b);
      paramParcel.writeInt(arrayOfByte1.length);
      paramParcel.writeByteArray(arrayOfByte1);
    }
    int i = this.c.size();
    paramParcel.writeInt(i);
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte2 = qat.a((qat)this.c.get(j));
      paramParcel.writeInt(arrayOfByte2.length);
      paramParcel.writeByteArray(arrayOfByte2);
    }
    if (this.e) {}
    for (int k = 1;; k = 0)
    {
      paramParcel.writeInt(k);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hur
 * JD-Core Version:    0.7.0.1
 */