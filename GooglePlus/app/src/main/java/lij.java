import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class lij
  implements Parcelable
{
  public static final Parcelable.Creator<lij> CREATOR = new lik();
  final int a;
  final boolean b;
  final boolean c;
  
  lij(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    int j;
    if (paramParcel.readInt() == i)
    {
      j = i;
      this.b = j;
      if (paramParcel.readInt() != i) {
        break label48;
      }
    }
    for (;;)
    {
      this.c = i;
      return;
      j = 0;
      break;
      label48:
      i = 0;
    }
  }
  
  lij(lil paramlil)
  {
    this.a = paramlil.a;
    this.b = paramlil.b;
    this.c = paramlil.c;
  }
  
  public static lil a()
  {
    return new lil();
  }
  
  public static lil a(lij paramlij)
  {
    lil locallil = new lil();
    locallil.b = paramlij.b;
    locallil.c = paramlij.c;
    locallil.a = paramlij.a;
    return locallil;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof lij;
    boolean bool2 = false;
    if (bool1)
    {
      lij locallij = (lij)paramObject;
      int i = this.a;
      int j = locallij.a;
      bool2 = false;
      if (i == j)
      {
        boolean bool3 = this.b;
        boolean bool4 = locallij.b;
        bool2 = false;
        if (bool3 == bool4)
        {
          boolean bool5 = this.c;
          boolean bool6 = locallij.c;
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
    int i = 31 * (527 + this.a);
    int j;
    int k;
    int m;
    if (this.b)
    {
      j = 0;
      k = 31 * (j + i);
      boolean bool = this.c;
      m = 0;
      if (!bool) {
        break label52;
      }
    }
    for (;;)
    {
      return k + m;
      j = 1;
      break;
      label52:
      m = 1;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeInt(this.a);
    int j;
    if (this.b)
    {
      j = i;
      paramParcel.writeInt(j);
      if (!this.c) {
        break label45;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      j = 0;
      break;
      label45:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lij
 * JD-Core Version:    0.7.0.1
 */