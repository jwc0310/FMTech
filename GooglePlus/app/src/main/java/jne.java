import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jne
  implements Parcelable, hrt
{
  public static final Parcelable.Creator<jne> CREATOR = new jnf();
  public jjg a;
  public boolean b = true;
  
  jne(Parcel paramParcel)
  {
    this.a = ((jjg)paramParcel.readParcelable(jne.class.getClassLoader()));
    if (paramParcel.readInt() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.b = bool;
      return;
    }
  }
  
  public jne(jng paramjng)
  {
    this.a = paramjng.a;
    this.b = paramjng.b;
  }
  
  public static jng a()
  {
    return new jng();
  }
  
  public final String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return this.a.a();
  }
  
  public final int describeContents()
  {
    return this.a.describeContents();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof jne))
    {
      jne localjne = (jne)paramObject;
      return this.a.equals(localjne.a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    if (this.b) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jne
 * JD-Core Version:    0.7.0.1
 */