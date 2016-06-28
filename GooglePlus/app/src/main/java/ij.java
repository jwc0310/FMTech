import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ij
  implements Parcelable
{
  public static final Parcelable.Creator<ij> CREATOR = new ik();
  private final he a;
  private final long b;
  
  ij(Parcel paramParcel)
  {
    this.a = ((he)he.CREATOR.createFromParcel(paramParcel));
    this.b = paramParcel.readLong();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ij
 * JD-Core Version:    0.7.0.1
 */