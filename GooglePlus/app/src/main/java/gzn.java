import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class gzn
  implements Parcelable
{
  public static final Parcelable.Creator<gzn> CREATOR = new gzo();
  static final String[] a = new String[0];
  public int b;
  Map<String, Integer> c;
  
  gzn(Parcel paramParcel)
  {
    this.b = paramParcel.readInt();
    int i = paramParcel.readInt();
    this.c = new HashMap(i);
    for (int j = 0; j < i; j++)
    {
      String str = paramParcel.readString();
      int k = paramParcel.readInt();
      this.c.put(str, Integer.valueOf(k));
    }
  }
  
  public gzn(gzy paramgzy)
  {
    efj.k();
    int i = 1 + paramgzy.g;
    paramgzy.g = i;
    if (i == 0) {
      paramgzy.g = (1 + paramgzy.g);
    }
    this.b = paramgzy.g;
    this.c = new HashMap();
  }
  
  final void a(String paramString)
  {
    Integer localInteger = (Integer)this.c.get(paramString);
    if (localInteger != null)
    {
      if (localInteger.intValue() == 1) {
        this.c.remove(paramString);
      }
    }
    else {
      return;
    }
    this.c.put(paramString, Integer.valueOf(-1 + localInteger.intValue()));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c.size());
    Iterator localIterator = this.c.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramParcel.writeString((String)localEntry.getKey());
      paramParcel.writeInt(((Integer)localEntry.getValue()).intValue());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzn
 * JD-Core Version:    0.7.0.1
 */