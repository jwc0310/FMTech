import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class agn
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<agn> CREATOR = new ago();
  public Parcelable a;
  
  agn(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readParcelable(agh.class.getClassLoader());
  }
  
  public agn(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.a, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agn
 * JD-Core Version:    0.7.0.1
 */