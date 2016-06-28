import android.content.Context;

public final class hkr
  extends kde<ncb, ncc>
{
  private final String a;
  private final int b;
  private final String c;
  private final String d;
  
  public hkr(Context paramContext, kcg paramkcg, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    super(paramContext, paramkcg, "updatecollexioncoverphoto", new ncb(), new ncc());
    if ((paramString2 != null) && (paramString3 != null)) {
      throw new IllegalArgumentException("Can not call server with both bannerPhotoId and bannerPhotoUrl set");
    }
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
    this.d = paramString3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hkr
 * JD-Core Version:    0.7.0.1
 */