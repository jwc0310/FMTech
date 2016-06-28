import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;

public class bpr
  implements jpx
{
  public static final Parcelable.Creator<bpr> CREATOR = new bps();
  public final long a;
  public final ipf b;
  public final oih c;
  private final String d;
  private final long e;
  private final isn f;
  private final aip g;
  private String h;
  private int i;
  
  public bpr(long paramLong1, ipf paramipf, String paramString, oih paramoih, long paramLong2)
  {
    this.a = paramLong1;
    this.b = paramipf;
    this.d = paramString;
    this.c = paramoih;
    this.e = paramLong2;
    this.g = new bpu(this.a);
    this.f = new bpt();
  }
  
  public bpr(Parcel paramParcel)
  {
    this.a = paramParcel.readLong();
    this.b = ((ipf)paramParcel.readParcelable(ipf.class.getClassLoader()));
    this.d = paramParcel.readString();
    this.e = paramParcel.readLong();
    byte[] arrayOfByte = paramParcel.createByteArray();
    if (arrayOfByte != null) {}
    for (;;)
    {
      try
      {
        localoih = (oih)qat.b(new oih(), arrayOfByte, 0, arrayOfByte.length);
        this.c = localoih;
        this.g = new bpu(this.a);
        this.f = new bpt();
        return;
      }
      catch (qas localqas)
      {
        Log.e("AllPhotosSelectable", "Failed to deserialize EditInfo.", localqas);
      }
      oih localoih = null;
    }
  }
  
  public final isn a()
  {
    return this.f;
  }
  
  public final jpx a(oih paramoih)
  {
    return new bpr(this.a, this.b, this.d, paramoih, this.e);
  }
  
  public final void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public final void a(String paramString)
  {
    this.h = paramString;
  }
  
  public final aip b()
  {
    return this.g;
  }
  
  public final long c()
  {
    long l1 = 0L;
    int j;
    long l2;
    label23:
    long l3;
    if (this.b.d != null)
    {
      j = 1;
      if (j == 0) {
        break label78;
      }
      l2 = 32L;
      l3 = 0x80 | 0x40 | 0x4 | l2 | 0x2;
      if ((0x100 & this.e) == l1) {
        break label84;
      }
    }
    label78:
    label84:
    for (int k = 1;; k = 0)
    {
      if (k != 0) {
        l1 = 512L;
      }
      return l3 | l1;
      j = 0;
      break;
      l2 = l1;
      break label23;
    }
  }
  
  public final int d()
  {
    return this.i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Deprecated
  public final ipf e()
  {
    return this.b;
  }
  
  public final String f()
  {
    return this.h;
  }
  
  public final String g()
  {
    return this.d;
  }
  
  public final oih h()
  {
    return this.c;
  }
  
  public final long i()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    paramParcel.writeParcelable(this.b, 0);
    paramParcel.writeString(this.d);
    paramParcel.writeLong(this.e);
    if (this.c != null) {}
    for (byte[] arrayOfByte = qat.a(this.c);; arrayOfByte = null)
    {
      paramParcel.writeByteArray(arrayOfByte);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpr
 * JD-Core Version:    0.7.0.1
 */