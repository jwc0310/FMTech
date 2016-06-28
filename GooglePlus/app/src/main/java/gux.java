import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gux<T extends Parcelable>
  implements Parcelable
{
  public static final Parcelable.Creator<gux<?>> CREATOR = new guy();
  @SuppressLint({"UseSparseArrays"})
  public final Map<Integer, List<T>> a = new HashMap();
  private final Class<?> b;
  
  public gux(Parcel paramParcel)
  {
    this.b = a(paramParcel.readString());
    ClassLoader localClassLoader = this.b.getClassLoader();
    int i = paramParcel.readInt();
    for (int j = 0; j < i; j++)
    {
      int k = paramParcel.readInt();
      int m = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(m);
      for (int n = 0; n < m; n++) {
        localArrayList.add(paramParcel.readParcelable(localClassLoader));
      }
      this.a.put(Integer.valueOf(k), localArrayList);
    }
  }
  
  public gux(Class<?> paramClass)
  {
    this.b = paramClass;
  }
  
  private static Class<?> a(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new RuntimeException(localClassNotFoundException);
    }
  }
  
  public final void a(Integer paramInteger, T paramT)
  {
    Object localObject = (List)this.a.get(paramInteger);
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.a.put(paramInteger, localObject);
    }
    ((List)localObject).add(paramT);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b.getName());
    paramParcel.writeInt(this.a.size());
    Iterator localIterator1 = this.a.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Integer localInteger = (Integer)localIterator1.next();
      paramParcel.writeInt(localInteger.intValue());
      List localList = (List)this.a.get(localInteger);
      paramParcel.writeInt(localList.size());
      Iterator localIterator2 = localList.iterator();
      while (localIterator2.hasNext()) {
        paramParcel.writeParcelable((Parcelable)localIterator2.next(), paramInt);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gux
 * JD-Core Version:    0.7.0.1
 */