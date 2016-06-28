import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class jux
  implements Parcelable
{
  public static final Parcelable.Creator<jux> CREATOR = new juy();
  String a;
  juz b;
  private ipf c;
  private ipf d;
  private final Object e = new Object();
  
  public jux() {}
  
  jux(Parcel paramParcel)
  {
    this.c = ((ipf)paramParcel.readParcelable(ipf.class.getClassLoader()));
    this.a = paramParcel.readString();
    this.d = ((ipf)paramParcel.readParcelable(ipf.class.getClassLoader()));
  }
  
  public final ipf a()
  {
    synchronized (this.e)
    {
      ipf localipf = this.c;
      return localipf;
    }
  }
  
  public final void a(Context paramContext, ipf paramipf1, ipf paramipf2, boolean paramBoolean)
  {
    synchronized (this.e)
    {
      if (efj.c(paramipf1, this.c)) {
        return;
      }
      this.c = paramipf1;
      this.d = paramipf2;
      if ((paramipf1 != null) && (paramipf1.b.a == 0L)) {
        ((jwa)((kij)mbb.a(paramContext, kij.class)).a(jwa.class)).b.a(paramipf1);
      }
      if ((this.b != null) && (paramBoolean))
      {
        this.b.a();
        return;
      }
    }
  }
  
  public final void a(String paramString)
  {
    if (TextUtils.equals(this.a, paramString)) {}
    do
    {
      return;
      this.a = paramString;
    } while (this.b == null);
    this.b.b();
  }
  
  final boolean a(boolean paramBoolean)
  {
    return (!TextUtils.isEmpty(this.a)) && ((!paramBoolean) || (a() != null));
  }
  
  public final ipf b()
  {
    synchronized (this.e)
    {
      if (this.d == null)
      {
        localipf = this.c;
        return localipf;
      }
      ipf localipf = this.d;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jux)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    synchronized (this.e)
    {
      jux localjux = (jux)paramObject;
      boolean bool1 = efj.c(this.a, localjux.a);
      boolean bool2 = false;
      if (bool1)
      {
        boolean bool3 = efj.c(this.c, localjux.c);
        bool2 = false;
        if (bool3)
        {
          boolean bool4 = efj.c(this.d, localjux.d);
          bool2 = false;
          if (bool4) {
            bool2 = true;
          }
        }
      }
      return bool2;
    }
  }
  
  public final int hashCode()
  {
    synchronized (this.e)
    {
      int i;
      int j;
      if (this.c == null)
      {
        i = 0;
        j = 31 * (i + 31);
        if (this.a != null) {
          break label82;
        }
      }
      label82:
      for (int k = 0;; k = this.a.hashCode())
      {
        int m = 31 * (k + j);
        ipf localipf = this.d;
        n = 0;
        if (localipf != null) {
          break label94;
        }
        int i1 = n + m;
        return i1;
        i = this.c.hashCode();
        break;
      }
      label94:
      int n = this.d.hashCode();
    }
  }
  
  public final String toString()
  {
    return this.a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    synchronized (this.e)
    {
      paramParcel.writeParcelable(this.c, 0);
      paramParcel.writeString(this.a);
      paramParcel.writeParcelable(this.d, 0);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jux
 * JD-Core Version:    0.7.0.1
 */