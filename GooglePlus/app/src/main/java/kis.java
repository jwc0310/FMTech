import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class kis
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<kis> CREATOR = new kit();
  public final Bundle a;
  
  kis(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = ((Bundle)paramParcel.readParcelable(jiq.class.getClassLoader()));
  }
  
  public kis(Parcelable paramParcelable, Bundle paramBundle)
  {
    super(paramParcelable);
    this.a = paramBundle;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
    String str2 = String.valueOf(this.a);
    return 38 + String.valueOf(str1).length() + String.valueOf(str2).length() + "MentionMultiAutoComplete.SavedState{" + str1 + " " + str2 + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.a, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kis
 * JD-Core Version:    0.7.0.1
 */