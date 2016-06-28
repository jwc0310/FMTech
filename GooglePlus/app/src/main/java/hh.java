import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

public final class hh
  implements Parcelable
{
  public static final Parcelable.Creator<hh> CREATOR = new hi();
  static final kl<String, Integer> a;
  private static final String[] b;
  private static final String[] c;
  private static final String[] d;
  private final Bundle e;
  private he f;
  
  static
  {
    kl localkl = new kl();
    a = localkl;
    localkl.put("android.media.metadata.TITLE", Integer.valueOf(1));
    a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
    a.put("android.media.metadata.DURATION", Integer.valueOf(0));
    a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
    a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
    a.put("android.media.metadata.WRITER", Integer.valueOf(1));
    a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
    a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
    a.put("android.media.metadata.DATE", Integer.valueOf(1));
    a.put("android.media.metadata.YEAR", Integer.valueOf(0));
    a.put("android.media.metadata.GENRE", Integer.valueOf(1));
    a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
    a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
    a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
    a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
    a.put("android.media.metadata.ART", Integer.valueOf(2));
    a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
    a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
    a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
    a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
    a.put("android.media.metadata.RATING", Integer.valueOf(3));
    a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
    a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
    a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
    b = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    c = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    d = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  }
  
  hh(Bundle paramBundle)
  {
    this.e = new Bundle(paramBundle);
  }
  
  hh(Parcel paramParcel)
  {
    this.e = paramParcel.readBundle();
  }
  
  public static hh a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    hj localhj = new hj();
    Iterator localIterator = ((MediaMetadata)paramObject).keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Integer localInteger = (Integer)a.get(str);
      if (localInteger != null)
      {
        long l;
        switch (localInteger.intValue())
        {
        default: 
          break;
        case 0: 
          l = ((MediaMetadata)paramObject).getLong(str);
          if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 0)) {
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
          }
        case 2: 
          Bitmap localBitmap = ((MediaMetadata)paramObject).getBitmap(str);
          if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 2)) {
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
          }
          localhj.a.putParcelable(str, localBitmap);
          continue;
          localhj.a.putLong(str, l);
          break;
        case 3: 
          hk localhk = hk.a(((MediaMetadata)paramObject).getRating(str));
          if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 3)) {
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
          }
          localhj.a.putParcelable(str, localhk);
          break;
        case 1: 
          CharSequence localCharSequence = ((MediaMetadata)paramObject).getText(str);
          if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 1)) {
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
          }
          localhj.a.putCharSequence(str, localCharSequence);
        }
      }
    }
    return new hh(localhj.a);
  }
  
  private String a(String paramString)
  {
    CharSequence localCharSequence = this.e.getCharSequence(paramString);
    if (localCharSequence != null) {
      return localCharSequence.toString();
    }
    return null;
  }
  
  private Bitmap b(String paramString)
  {
    try
    {
      Bitmap localBitmap = (Bitmap)this.e.getParcelable(paramString);
      return localBitmap;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final he a()
  {
    if (this.f != null) {
      return this.f;
    }
    String str1 = a("android.media.metadata.MEDIA_ID");
    CharSequence[] arrayOfCharSequence = new CharSequence[3];
    CharSequence localCharSequence1 = this.e.getCharSequence("android.media.metadata.DISPLAY_TITLE");
    int n;
    label72:
    Bitmap localBitmap1;
    label102:
    int i1;
    label105:
    int i;
    int j;
    label221:
    int k;
    int m;
    if (!TextUtils.isEmpty(localCharSequence1))
    {
      arrayOfCharSequence[0] = localCharSequence1;
      arrayOfCharSequence[1] = this.e.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
      arrayOfCharSequence[2] = this.e.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
      n = 0;
      if (n >= c.length) {
        break label308;
      }
      Bitmap localBitmap2 = b(c[n]);
      if (localBitmap2 != null)
      {
        localBitmap1 = localBitmap2;
        i1 = 0;
        int i2 = d.length;
        Uri localUri = null;
        if (i1 < i2)
        {
          String str3 = a(d[i1]);
          if (TextUtils.isEmpty(str3)) {
            break label302;
          }
          localUri = Uri.parse(str3);
        }
        hg localhg = new hg();
        localhg.a = str1;
        localhg.b = arrayOfCharSequence[0];
        localhg.c = arrayOfCharSequence[1];
        localhg.d = arrayOfCharSequence[2];
        localhg.e = localBitmap1;
        localhg.f = localUri;
        this.f = localhg.a();
        return this.f;
      }
    }
    else
    {
      i = 0;
      j = 0;
      if ((j < 3) && (i < b.length))
      {
        String[] arrayOfString = b;
        k = i + 1;
        String str2 = arrayOfString[i];
        CharSequence localCharSequence2 = this.e.getCharSequence(str2);
        if (TextUtils.isEmpty(localCharSequence2)) {
          break label314;
        }
        m = j + 1;
        arrayOfCharSequence[j] = localCharSequence2;
      }
    }
    for (;;)
    {
      j = m;
      i = k;
      break label221;
      break;
      n++;
      break label72;
      label302:
      i1++;
      break label105;
      label308:
      localBitmap1 = null;
      break label102;
      label314:
      m = j;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hh
 * JD-Core Version:    0.7.0.1
 */