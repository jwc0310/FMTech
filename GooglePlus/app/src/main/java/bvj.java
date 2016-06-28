import android.os.Parcel;
import android.os.Parcelable.Creator;

public class bvj
  implements isp
{
  public static final Parcelable.Creator<bvj> CREATOR = new bvk();
  public final String a;
  private final isn b;
  private final aip c;
  private int d;
  
  public bvj(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = new bvl(this);
    this.c = new bvm(this, this.a);
  }
  
  public bvj(String paramString)
  {
    this.a = paramString;
    this.b = new bvl(this);
    this.c = new bvm(this, this.a);
  }
  
  public final isn a()
  {
    return this.b;
  }
  
  public final void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public final aip b()
  {
    return this.c;
  }
  
  public final long c()
  {
    return 256L;
  }
  
  public final int d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvj
 * JD-Core Version:    0.7.0.1
 */