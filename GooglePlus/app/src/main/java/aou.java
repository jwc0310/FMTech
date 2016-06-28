import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public final class aou
  implements Parcelable
{
  public static final Parcelable.Creator<aou> CREATOR = new aov();
  public final int a;
  public final List<Long> b;
  public final List<Long> c;
  
  public aou(int paramInt, List<Long> paramList1, List<Long> paramList2)
  {
    this.a = paramInt;
    this.b = paramList1;
    this.c = paramList2;
  }
  
  public aou(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = new ArrayList();
    paramParcel.readList(this.b, Long.class.getClassLoader());
    this.c = new ArrayList();
    paramParcel.readList(this.c, Long.class.getClassLoader());
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeList(this.b);
    paramParcel.writeList(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aou
 * JD-Core Version:    0.7.0.1
 */