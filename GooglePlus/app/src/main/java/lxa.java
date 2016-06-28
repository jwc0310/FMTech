import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class lxa
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<lxa> CREATOR = new lxb();
  public final boolean a;
  public final int b;
  public final int c;
  
  lxa(Parcel paramParcel)
  {
    super(paramParcel);
    if (paramParcel.readInt() == i) {}
    for (;;)
    {
      this.a = i;
      this.b = paramParcel.readInt();
      this.c = paramParcel.readInt();
      return;
      i = 0;
    }
  }
  
  public lxa(Parcelable paramParcelable, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    super(paramParcelable);
    this.a = paramBoolean;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    if (this.a) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      paramParcel.writeInt(this.b);
      paramParcel.writeInt(this.c);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxa
 * JD-Core Version:    0.7.0.1
 */