import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class bta
  implements btc
{
  public static final Parcelable.Creator<bta> CREATOR = new btb();
  private String a;
  private String b;
  private String c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  
  bta(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
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
  
  public bta(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramBoolean;
  }
  
  public final int a()
  {
    return -1;
  }
  
  public final String a(Context paramContext)
  {
    return this.a;
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final String b(Context paramContext)
  {
    return this.b;
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
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
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
 * Qualified Name:     bta
 * JD-Core Version:    0.7.0.1
 */