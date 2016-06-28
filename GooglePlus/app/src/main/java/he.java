import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class he
  implements Parcelable
{
  public static final Parcelable.Creator<he> CREATOR = new hf();
  public final CharSequence a;
  public final CharSequence b;
  public final Bitmap c;
  public final Uri d;
  private final String e;
  private final CharSequence f;
  private final Bundle g;
  private final Uri h;
  private Object i;
  
  he(Parcel paramParcel)
  {
    this.e = paramParcel.readString();
    this.a = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.f = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = ((Bitmap)paramParcel.readParcelable(null));
    this.d = ((Uri)paramParcel.readParcelable(null));
    this.g = paramParcel.readBundle();
    this.h = ((Uri)paramParcel.readParcelable(null));
  }
  
  he(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.e = paramString;
    this.a = paramCharSequence1;
    this.b = paramCharSequence2;
    this.f = paramCharSequence3;
    this.c = paramBitmap;
    this.d = paramUri1;
    this.g = paramBundle;
    this.h = paramUri2;
  }
  
  public static he a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    hg localhg = new hg();
    localhg.a = ((MediaDescription)paramObject).getMediaId();
    localhg.b = ((MediaDescription)paramObject).getTitle();
    localhg.c = ((MediaDescription)paramObject).getSubtitle();
    localhg.d = ((MediaDescription)paramObject).getDescription();
    localhg.e = ((MediaDescription)paramObject).getIconBitmap();
    localhg.f = ((MediaDescription)paramObject).getIconUri();
    localhg.g = ((MediaDescription)paramObject).getExtras();
    if (Build.VERSION.SDK_INT >= 23) {
      localhg.h = ((MediaDescription)paramObject).getMediaUri();
    }
    he localhe = localhg.a();
    localhe.i = paramObject;
    return localhe;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.a + ", " + this.b + ", " + this.f;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.e);
      TextUtils.writeToParcel(this.a, paramParcel, paramInt);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      TextUtils.writeToParcel(this.f, paramParcel, paramInt);
      paramParcel.writeParcelable(this.c, paramInt);
      paramParcel.writeParcelable(this.d, paramInt);
      paramParcel.writeBundle(this.g);
      return;
    }
    if ((this.i != null) || (Build.VERSION.SDK_INT < 21)) {}
    for (Object localObject = this.i;; localObject = this.i)
    {
      ((MediaDescription)localObject).writeToParcel(paramParcel, paramInt);
      return;
      MediaDescription.Builder localBuilder = new MediaDescription.Builder();
      String str = this.e;
      ((MediaDescription.Builder)localBuilder).setMediaId(str);
      CharSequence localCharSequence1 = this.a;
      ((MediaDescription.Builder)localBuilder).setTitle(localCharSequence1);
      CharSequence localCharSequence2 = this.b;
      ((MediaDescription.Builder)localBuilder).setSubtitle(localCharSequence2);
      CharSequence localCharSequence3 = this.f;
      ((MediaDescription.Builder)localBuilder).setDescription(localCharSequence3);
      Bitmap localBitmap = this.c;
      ((MediaDescription.Builder)localBuilder).setIconBitmap(localBitmap);
      Uri localUri1 = this.d;
      ((MediaDescription.Builder)localBuilder).setIconUri(localUri1);
      Bundle localBundle = this.g;
      ((MediaDescription.Builder)localBuilder).setExtras(localBundle);
      if (Build.VERSION.SDK_INT >= 23)
      {
        Uri localUri2 = this.h;
        ((MediaDescription.Builder)localBuilder).setMediaUri(localUri2);
      }
      this.i = ((MediaDescription.Builder)localBuilder).build();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     he
 * JD-Core Version:    0.7.0.1
 */