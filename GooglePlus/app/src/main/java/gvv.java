import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;

public final class gvv
  implements Parcelable
{
  public static final Parcelable.Creator<gvv> CREATOR = new gvw();
  public final String a;
  public final long b;
  public final int c;
  public final long d;
  private final long e;
  private final gvy f;
  private final String g;
  private final String h;
  
  gvv(Parcel paramParcel)
  {
    this.e = paramParcel.readLong();
    this.b = paramParcel.readLong();
    this.a = paramParcel.readString();
    this.f = gvy.valueOf(paramParcel.readString());
    this.c = paramParcel.readInt();
    this.g = paramParcel.readString();
    this.h = paramParcel.readString();
    this.d = paramParcel.readLong();
  }
  
  public gvv(gvx paramgvx)
  {
    this.e = paramgvx.a;
    this.b = paramgvx.c;
    this.a = paramgvx.b;
    this.f = paramgvx.d;
    this.c = paramgvx.e;
    this.g = paramgvx.f;
    this.h = paramgvx.g;
    this.d = paramgvx.h;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Long.valueOf(this.e);
    arrayOfObject[1] = this.a;
    arrayOfObject[2] = Long.valueOf(this.b);
    arrayOfObject[3] = this.f;
    arrayOfObject[4] = Integer.valueOf(this.c);
    arrayOfObject[5] = this.g;
    arrayOfObject[6] = this.h;
    arrayOfObject[7] = Long.valueOf(this.d);
    return String.format(localLocale, "UploadMediaStatus {uploadId: %d, mediaLocalUri: %s, batchId: %d, state: %s, attemptCount: %d, photoId: %s, mediaKey: %s, updateTime: %d", arrayOfObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.e);
    paramParcel.writeLong(this.b);
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.f.toString());
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeLong(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvv
 * JD-Core Version:    0.7.0.1
 */