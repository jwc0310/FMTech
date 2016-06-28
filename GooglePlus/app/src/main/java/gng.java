import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import java.util.ArrayList;

public final class gng
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<gng> CREATOR = new gnh();
  public ArrayList<gnb> a;
  public boolean b;
  public boolean c;
  
  gng(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.createTypedArrayList(gnb.CREATOR);
    boolean bool2;
    if (paramParcel.readInt() != 0)
    {
      bool2 = bool1;
      this.b = bool2;
      if (paramParcel.readInt() == 0) {
        break label50;
      }
    }
    for (;;)
    {
      this.c = bool1;
      return;
      bool2 = false;
      break;
      label50:
      bool1 = false;
    }
  }
  
  public gng(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeTypedList(this.a);
    int j;
    if (this.b)
    {
      j = i;
      paramParcel.writeInt(j);
      if (!this.c) {
        break label51;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      j = 0;
      break;
      label51:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gng
 * JD-Core Version:    0.7.0.1
 */