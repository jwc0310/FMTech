import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

@Deprecated
final class gnn
  implements jjg
{
  public static final Parcelable.Creator<gnn> CREATOR = new gno();
  private final jjd a;
  
  gnn(Parcel paramParcel)
  {
    this.a = ((jjd)paramParcel.readParcelable(gnn.class.getClassLoader()));
  }
  
  gnn(jjd paramjjd)
  {
    this.a = paramjjd;
  }
  
  public final String a()
  {
    if (!TextUtils.isEmpty(this.a.a))
    {
      String str2 = String.valueOf(this.a.a);
      if (str2.length() != 0) {
        return "g:".concat(str2);
      }
      return new String("g:");
    }
    if (!TextUtils.isEmpty(this.a.c))
    {
      String str1 = String.valueOf(this.a.c);
      if (str1.length() != 0) {
        return "e:".concat(str1);
      }
      return new String("e:");
    }
    return null;
  }
  
  public final long b()
  {
    return 0L;
  }
  
  public final String c()
  {
    return this.a.a;
  }
  
  public final String d()
  {
    return this.a.b;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    return this.a.d;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jjg)) {
      return false;
    }
    jjg localjjg = (jjg)paramObject;
    if (localjjg == this) {
      return true;
    }
    return a().equals(localjjg.a());
  }
  
  public final String f()
  {
    return null;
  }
  
  public final String g()
  {
    return "";
  }
  
  public final int h()
  {
    return 1;
  }
  
  public final int hashCode()
  {
    return a().hashCode();
  }
  
  public final List<jgw> i()
  {
    return Collections.emptyList();
  }
  
  public final String j()
  {
    return null;
  }
  
  public final int k()
  {
    if (this.a.e) {
      return 2;
    }
    return 1;
  }
  
  public final long l()
  {
    return 0L;
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final String toString()
  {
    return this.a.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gnn
 * JD-Core Version:    0.7.0.1
 */