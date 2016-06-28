import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class gla
  implements Parcelable
{
  public static final Parcelable.Creator<gla> CREATOR = new glb();
  public final int a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final boolean f;
  public final String g;
  public final boolean h;
  
  public gla(int paramInt, gjb paramgjb, gmc paramgmc)
  {
    this.a = paramInt;
    this.b = paramgjb.b("gaia_id");
    this.c = paramgjb.b("display_name");
    this.d = paramgjb.b("account_name");
    this.e = paramgjb.b("profile_photo_url");
    this.f = paramgjb.c("has_irrecoverable_error");
    this.g = paramgmc.a(paramInt);
    this.h = false;
  }
  
  gla(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    int j;
    if (paramParcel.readInt() == i)
    {
      j = i;
      this.f = j;
      this.g = paramParcel.readString();
      if (paramParcel.readInt() != i) {
        break label88;
      }
    }
    for (;;)
    {
      this.h = i;
      return;
      j = 0;
      break;
      label88:
      i = 0;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    int j;
    if (this.f)
    {
      j = i;
      paramParcel.writeInt(j);
      paramParcel.writeString(this.g);
      if (!this.h) {
        break label85;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      j = 0;
      break;
      label85:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gla
 * JD-Core Version:    0.7.0.1
 */