import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class gqp
  implements Parcelable
{
  public static final Parcelable.Creator<gqp> CREATOR = new gqq();
  private final long a;
  private final Bundle b;
  
  gqp(Parcel paramParcel)
  {
    this.a = paramParcel.readLong();
    this.b = paramParcel.readBundle();
  }
  
  public static ArrayList<gqp> a(Parcel paramParcel)
  {
    if (paramParcel.readInt() != 0)
    {
      ArrayList localArrayList = new ArrayList();
      paramParcel.readTypedList(localArrayList, CREATOR);
      return localArrayList;
    }
    return null;
  }
  
  public static void a(Parcel paramParcel, ArrayList<gqp> paramArrayList)
  {
    if (paramArrayList == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcel.writeTypedList(paramArrayList);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    paramParcel.writeBundle(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqp
 * JD-Core Version:    0.7.0.1
 */