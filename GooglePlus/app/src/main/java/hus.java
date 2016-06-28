import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class hus
  implements Parcelable
{
  public static final Parcelable.Creator<hus> CREATOR = new hut();
  public int a;
  public ArrayList<String> b;
  public ArrayList<String> c;
  public int d;
  public long e;
  public int f;
  
  public hus(int paramInt1, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, int paramInt2, long paramLong, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramArrayList1;
    this.c = paramArrayList2;
    this.d = paramInt2;
    this.e = paramLong;
    this.f = paramInt3;
  }
  
  public hus(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = new ArrayList();
    paramParcel.readStringList(this.b);
    this.c = new ArrayList();
    paramParcel.readStringList(this.c);
    this.d = paramParcel.readInt();
    this.e = paramParcel.readLong();
    this.f = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeStringList(this.b);
    paramParcel.writeStringList(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeLong(this.e);
    paramParcel.writeInt(this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hus
 * JD-Core Version:    0.7.0.1
 */