import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class dvh
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<dvh> CREATOR = new dvi();
  public int a;
  public int b;
  public int[] c;
  public String[] d;
  public int[] e;
  
  dvh(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    int j = paramParcel.readInt();
    if (j > 0)
    {
      this.c = new int[j];
      this.d = new String[j];
      for (int m = 0; m < j; m++)
      {
        this.c[m] = paramParcel.readInt();
        this.d[m] = paramParcel.readString();
      }
    }
    int k = paramParcel.readInt();
    if (k > 0)
    {
      this.e = new int[k];
      while (i < k)
      {
        this.e[i] = paramParcel.readInt();
        i++;
      }
    }
  }
  
  public dvh(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    String str = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
    int i = this.a;
    return 56 + String.valueOf(str).length() + "BestPhotosTileListView.SavedState{" + str + " position=" + i + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.c == null) {}
    for (int j = 0;; j = this.c.length)
    {
      paramParcel.writeInt(j);
      for (int k = 0; k < j; k++)
      {
        paramParcel.writeInt(this.c[k]);
        paramParcel.writeString(this.d[k]);
      }
    }
    if (this.e == null) {}
    for (int m = 0;; m = this.e.length)
    {
      paramParcel.writeInt(m);
      while (i < m)
      {
        paramParcel.writeInt(this.e[i]);
        i++;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvh
 * JD-Core Version:    0.7.0.1
 */