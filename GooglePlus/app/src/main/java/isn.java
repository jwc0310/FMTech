import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class isn
  implements Parcelable
{
  public static final Parcelable.Creator<isn> CREATOR = new iso();
  private final int a;
  
  public isn(int paramInt)
  {
    this.a = paramInt;
  }
  
  public isn(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof isn;
    boolean bool2 = false;
    if (bool1)
    {
      int i = this.a;
      int j = ((isn)paramObject).a;
      bool2 = false;
      if (i == j) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isn
 * JD-Core Version:    0.7.0.1
 */