import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class gve
  implements Parcelable
{
  public static final Parcelable.Creator<gve> CREATOR = new gvf();
  @SuppressLint({"UseSparseArrays"})
  final Map<Integer, Integer> a = new HashMap();
  
  public gve() {}
  
  public gve(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    for (int j = 0; j < i; j++)
    {
      int k = paramParcel.readInt();
      int m = paramParcel.readInt();
      this.a.put(Integer.valueOf(k), Integer.valueOf(m));
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a.size());
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramParcel.writeInt(((Integer)localEntry.getKey()).intValue());
      paramParcel.writeInt(((Integer)localEntry.getValue()).intValue());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gve
 * JD-Core Version:    0.7.0.1
 */