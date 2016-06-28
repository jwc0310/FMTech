import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class on
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<on> CREATOR;
  public int a;
  public Parcelable b;
  public ClassLoader c;
  
  static
  {
    oo localoo = new oo();
    if (Build.VERSION.SDK_INT >= 13) {}
    for (Object localObject = new jf(localoo);; localObject = new jd(localoo))
    {
      CREATOR = (Parcelable.Creator)localObject;
      return;
    }
  }
  
  on(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    if (paramClassLoader == null) {
      paramClassLoader = getClass().getClassLoader();
    }
    this.a = paramParcel.readInt();
    this.b = paramParcel.readParcelable(paramClassLoader);
    this.c = paramClassLoader;
  }
  
  public on(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
    paramParcel.writeParcelable(this.b, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     on
 * JD-Core Version:    0.7.0.1
 */