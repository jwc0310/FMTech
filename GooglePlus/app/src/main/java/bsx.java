import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class bsx
  implements btc
{
  public static final Parcelable.Creator<bsx> CREATOR = new bsy();
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  
  public bsx(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = paramInt6;
    this.g = paramBoolean;
  }
  
  bsx(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.g = bool;
      return;
    }
  }
  
  public final int a()
  {
    return this.c;
  }
  
  public final String a(Context paramContext)
  {
    return paramContext.getString(this.a);
  }
  
  public final String b()
  {
    return bsz.a;
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(this.b);
  }
  
  public final int c()
  {
    return this.d;
  }
  
  public final int d()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int e()
  {
    return this.f;
  }
  
  public final boolean f()
  {
    return this.g;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    if (this.g) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsx
 * JD-Core Version:    0.7.0.1
 */