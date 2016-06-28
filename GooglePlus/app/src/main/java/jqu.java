import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jqu
  implements Parcelable
{
  public static final Parcelable.Creator<jqu> CREATOR = new jqv();
  public int a;
  public ContentValues[] b;
  private int c;
  
  public jqu()
  {
    this.c = 1;
  }
  
  jqu(Parcel paramParcel)
  {
    this.c = paramParcel.readInt();
    this.a = paramParcel.readInt();
    this.b = ((ContentValues[])paramParcel.createTypedArray(ContentValues.CREATOR));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.a);
    paramParcel.writeTypedArray(this.b, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqu
 * JD-Core Version:    0.7.0.1
 */