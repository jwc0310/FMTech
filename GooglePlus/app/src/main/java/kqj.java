import android.content.Context;
import java.util.Locale;

public final class kqj
  implements gwv
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  private String i;
  
  public kqj(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a = paramInt1;
    this.i = paramString;
    this.b = paramInt2;
    this.c = paramInt4;
    this.d = paramInt3;
    this.e = paramInt5;
    this.f = paramInt6;
    this.g = paramInt7;
    this.h = paramInt8;
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    return this.i;
  }
  
  public final void a(Context paramContext) {}
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(this.e);
    arrayOfObject[3] = Integer.valueOf(this.f);
    arrayOfObject[4] = Integer.valueOf(this.g);
    arrayOfObject[5] = Integer.valueOf(this.h);
    return String.format(localLocale, "NetworkQueuesSuccessEvent: itemType=%d, numProcessed=%d, numPhotos=%d, numPhotosUploaded=%d, numVideos=%d, numVideosUploaded=%d", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqj
 * JD-Core Version:    0.7.0.1
 */