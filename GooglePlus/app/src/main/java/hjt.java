import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class hjt
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<hjt> CREATOR = new hju();
  public final boolean a;
  public final boolean b;
  
  hjt(Parcel paramParcel)
  {
    super(paramParcel);
    boolean bool2;
    if (paramParcel.readByte() != 0)
    {
      bool2 = bool1;
      this.a = bool2;
      if (paramParcel.readByte() == 0) {
        break label39;
      }
    }
    for (;;)
    {
      this.b = bool1;
      return;
      bool2 = false;
      break;
      label39:
      bool1 = false;
    }
  }
  
  public hjt(Parcelable paramParcelable, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramParcelable);
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    super.writeToParcel(paramParcel, paramInt);
    int j;
    if (this.a)
    {
      j = i;
      paramParcel.writeByte((byte)j);
      if (!this.b) {
        break label45;
      }
    }
    for (;;)
    {
      paramParcel.writeByte((byte)i);
      return;
      j = 0;
      break;
      label45:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjt
 * JD-Core Version:    0.7.0.1
 */