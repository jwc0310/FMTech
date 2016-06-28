import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class btd
  implements Parcelable
{
  public static final Parcelable.Creator<btd> CREATOR = new bte();
  public List<ipf> a;
  public int b;
  
  public btd() {}
  
  btd(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    if (i == 1)
    {
      ClassLoader localClassLoader = btd.class.getClassLoader();
      this.a = new ArrayList();
      int j = paramParcel.readInt();
      for (int k = 0; k < j; k++) {
        this.a.add((ipf)paramParcel.readParcelable(localClassLoader));
      }
      this.b = paramParcel.readInt();
      return;
    }
    throw new BadParcelableException(32 + "Unsupported version: " + i);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(1);
    if (this.a == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    int i = this.a.size();
    paramParcel.writeInt(i);
    for (int j = 0; j < i; j++) {
      paramParcel.writeParcelable((Parcelable)this.a.get(j), paramInt);
    }
    paramParcel.writeInt(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btd
 * JD-Core Version:    0.7.0.1
 */