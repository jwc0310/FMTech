import android.media.session.PlaybackState.CustomAction;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class it
  implements Parcelable
{
  public static final Parcelable.Creator<it> CREATOR = new iu();
  private final String a;
  private final CharSequence b;
  private final int c;
  private final Bundle d;
  
  it(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = paramParcel.readInt();
    this.d = paramParcel.readBundle();
  }
  
  private it(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
  {
    this.a = paramString;
    this.b = paramCharSequence;
    this.c = paramInt;
    this.d = paramBundle;
  }
  
  public static it a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    return new it(((PlaybackState.CustomAction)paramObject).getAction(), ((PlaybackState.CustomAction)paramObject).getName(), ((PlaybackState.CustomAction)paramObject).getIcon(), ((PlaybackState.CustomAction)paramObject).getExtras());
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "Action:mName='" + this.b + ", mIcon=" + this.c + ", mExtras=" + this.d;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    TextUtils.writeToParcel(this.b, paramParcel, paramInt);
    paramParcel.writeInt(this.c);
    paramParcel.writeBundle(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     it
 * JD-Core Version:    0.7.0.1
 */