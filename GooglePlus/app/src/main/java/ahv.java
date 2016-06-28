import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class ahv
  implements Parcelable
{
  public static final Parcelable.Creator<ahv> CREATOR = new ahw();
  int a;
  int b;
  int[] c;
  boolean d;
  
  public ahv() {}
  
  public ahv(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == i) {}
    for (;;)
    {
      this.d = i;
      int j = paramParcel.readInt();
      if (j > 0)
      {
        this.c = new int[j];
        paramParcel.readIntArray(this.c);
      }
      return;
      i = 0;
    }
  }
  
  final int a(int paramInt)
  {
    if (this.c == null) {
      return 0;
    }
    return this.c[paramInt];
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.d) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      if ((this.c == null) || (this.c.length <= 0)) {
        break;
      }
      paramParcel.writeInt(this.c.length);
      paramParcel.writeIntArray(this.c);
      return;
    }
    paramParcel.writeInt(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahv
 * JD-Core Version:    0.7.0.1
 */