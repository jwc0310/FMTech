import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;
import android.view.View.BaseSavedState;

public final class lyi
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<lyi> CREATOR = new lyj();
  public long a = -1L;
  public int b;
  public int c;
  public int d;
  public SparseBooleanArray e;
  public boolean f;
  public boolean g;
  
  lyi(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readLong();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readSparseBooleanArray();
    int j;
    if (paramParcel.readInt() == i)
    {
      j = i;
      this.f = j;
      if (paramParcel.readInt() != i) {
        break label88;
      }
    }
    for (;;)
    {
      this.g = i;
      return;
      j = 0;
      break;
      label88:
      i = 0;
    }
  }
  
  public lyi(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
    long l = this.a;
    int i = this.b;
    String str2 = String.valueOf(this.e);
    boolean bool = this.f;
    return 109 + String.valueOf(str1).length() + String.valueOf(str2).length() + "StaggereGridView.SavedState{" + str1 + " firstId=" + l + " position=" + i + " selected=" + str2 + " selectionMode=" + bool + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeSparseBooleanArray(this.e);
    int j;
    if (this.f)
    {
      j = i;
      paramParcel.writeInt(j);
      if (!this.g) {
        break label83;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      j = 0;
      break;
      label83:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyi
 * JD-Core Version:    0.7.0.1
 */