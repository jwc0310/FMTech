import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class lyy
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<lyy> CREATOR = new lyz();
  public final lyu a;
  private final float[] b;
  
  lyy(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = lyu.valueOf(paramParcel.readString());
    this.b = paramParcel.createFloatArray();
  }
  
  public lyy(Parcelable paramParcelable, lyu paramlyu, float[] paramArrayOfFloat)
  {
    super(paramParcelable);
    this.a = paramlyu;
    this.b = paramArrayOfFloat;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.a.toString());
    paramParcel.writeFloatArray(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyy
 * JD-Core Version:    0.7.0.1
 */