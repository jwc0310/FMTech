import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class gvt
  implements Parcelable
{
  public static final Parcelable.Creator<gvt> CREATOR = new gvu();
  public final gvq a;
  public final gvy b;
  public final int c;
  
  gvt(Parcel paramParcel)
  {
    this.a = ((gvq)gvq.CREATOR.createFromParcel(paramParcel));
    this.b = gvy.valueOf(paramParcel.readString());
    this.c = paramParcel.readInt();
  }
  
  public gvt(gvq paramgvq, gvy paramgvy, int paramInt)
  {
    this.a = paramgvq;
    this.b = paramgvy;
    this.c = paramInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.b);
    int i = this.c;
    String str2 = String.valueOf(this.a);
    return 60 + String.valueOf(str1).length() + String.valueOf(str2).length() + "UploadGroupStatus {state: " + str1 + ", remaining: " + i + ", group: " + str2 + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, 0);
    paramParcel.writeString(this.b.toString());
    paramParcel.writeInt(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvt
 * JD-Core Version:    0.7.0.1
 */