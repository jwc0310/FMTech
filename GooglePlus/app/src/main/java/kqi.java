import android.content.Context;
import java.util.Locale;

public final class kqi
  implements gwv
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final boolean e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  private String j;
  
  public kqi(String paramString, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a = paramInt1;
    this.j = paramString;
    this.e = false;
    this.b = paramInt2;
    this.d = paramInt3;
    this.c = paramInt4;
    this.f = paramInt5;
    this.g = paramInt6;
    this.h = paramInt7;
    this.i = paramInt8;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return this.j;
  }
  
  public final void a(Context paramContext) {}
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(this.f);
    arrayOfObject[3] = Integer.valueOf(this.g);
    arrayOfObject[4] = Integer.valueOf(this.h);
    arrayOfObject[5] = Integer.valueOf(this.i);
    if (this.e) {}
    for (String str = "yes";; str = "no")
    {
      arrayOfObject[6] = str;
      return String.format(localLocale, "NetworkQueuesFailureEvent: itemType=%d, numProcessed=%d, numPhotos=%d, numPhotosUploaded=%d, numVideos=%d, numVideosUploaded=%d, userCanceled=%s", arrayOfObject);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqi
 * JD-Core Version:    0.7.0.1
 */