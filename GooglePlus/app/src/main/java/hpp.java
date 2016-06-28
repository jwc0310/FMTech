import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class hpp
  implements Parcelable, hrt
{
  public static final Parcelable.Creator<hpp> CREATOR = new hpq();
  public final hps a;
  public final String b;
  public final boolean c;
  
  hpp(Parcel paramParcel)
  {
    this.a = ((hps)paramParcel.readParcelable(hpp.class.getClassLoader()));
    this.b = paramParcel.readString();
    if (paramParcel.readByte() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
  
  public hpp(hpr paramhpr)
  {
    this.a = paramhpr.a;
    this.b = paramhpr.b;
    this.c = paramhpr.c;
  }
  
  public static hpr a()
  {
    return new hpr();
  }
  
  public final String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return this.a.a;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof hpp;
    boolean bool2 = false;
    if (bool1)
    {
      hpp localhpp = (hpp)paramObject;
      boolean bool3 = this.a.equals(localhpp.a);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = TextUtils.equals(this.b, localhpp.b);
        bool2 = false;
        if (bool4)
        {
          boolean bool5 = this.c;
          boolean bool6 = localhpp.c;
          bool2 = false;
          if (bool5 == bool6) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = 17;
    if (this.a != null) {
      i = 527 + this.a.hashCode();
    }
    if (this.b != null) {
      i = i * 31 + this.b.hashCode();
    }
    int j = i * 31;
    if (this.c) {}
    for (int k = 1231;; k = 1237) {
      return k + j;
    }
  }
  
  public final String toString()
  {
    return this.a.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeString(this.b);
    if (this.c) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpp
 * JD-Core Version:    0.7.0.1
 */