import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ive
  implements Parcelable
{
  public static final Parcelable.Creator<ive> CREATOR = new ivf();
  public final ivg a;
  private String b;
  private String c;
  private int d;
  private boolean e;
  
  public ive(Parcel paramParcel)
  {
    String[] arrayOfString = new String[3];
    int[] arrayOfInt = new int[2];
    this.a = ((ivg)paramParcel.readParcelable(getClass().getClassLoader()));
    paramParcel.readStringArray(arrayOfString);
    this.b = arrayOfString[1];
    this.c = arrayOfString[2];
    paramParcel.readIntArray(arrayOfInt);
    this.d = arrayOfInt[0];
    if (arrayOfInt[1] != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.e = bool;
      return;
    }
  }
  
  public ive(ivg paramivg, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    this.a = paramivg;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt;
    this.e = paramBoolean;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, 0);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = this.b;
    arrayOfString[1] = this.c;
    paramParcel.writeStringArray(arrayOfString);
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = this.d;
    boolean bool = this.e;
    int i = 0;
    if (bool) {
      i = 1;
    }
    arrayOfInt[1] = i;
    paramParcel.writeIntArray(arrayOfInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ive
 * JD-Core Version:    0.7.0.1
 */