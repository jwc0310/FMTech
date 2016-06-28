import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;

public final class jpp
  extends kde<mqj, mqk>
{
  Collection<String> a;
  Collection<String> b;
  public List<String> c;
  public List<String> d;
  psl e;
  private final String f;
  private final int g;
  private String h;
  private String z;
  
  jpp(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, Collection<String> paramCollection1, Collection<String> paramCollection2, Integer paramInteger)
  {
    super(paramContext, new kcg(paramContext, paramInt), "copyphotosbyshare", new mqj(), new mqk());
    boolean bool1;
    int i;
    if (TextUtils.isEmpty(paramString1) == TextUtils.isEmpty(paramString2)) {
      if ((TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString3)))
      {
        bool1 = true;
        String str1 = String.valueOf("Exactly one of legacyAlbumId, album media key, or albumTitle must be set. Set legacyAlbumId/album media key if we're copying to an existing album. Set albumTitle if we're copying to a new album.\nAlbum ID: ");
        efj.c(bool1, 32 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(paramString3).length() + str1 + paramString1 + "\nAlbum media key: " + paramString2 + "\nAlbum title: " + paramString3);
        if (paramCollection2 != null) {
          break label308;
        }
        i = 1;
        label156:
        if (paramCollection1 != null) {
          break label314;
        }
      }
    }
    label308:
    label314:
    for (int j = 1;; j = 0)
    {
      boolean bool2 = j ^ i;
      String str2 = String.valueOf("Exactly one of legacyPhotoIds or mediaKeys must be set.\nPhoto IDs: ");
      String str3 = String.valueOf(paramCollection2);
      String str4 = String.valueOf(paramCollection1);
      efj.c(bool2, 13 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + str2 + str3 + "\nMedia keys: " + str4);
      this.h = paramString1;
      this.z = paramString2;
      this.f = paramString3;
      this.b = paramCollection1;
      this.a = paramCollection2;
      this.g = paramInteger;
      return;
      bool1 = false;
      break;
      bool1 = TextUtils.isEmpty(paramString3);
      break;
      i = 0;
      break label156;
    }
  }
  
  @Deprecated
  public jpp(Context paramContext, int paramInt, String paramString1, String paramString2, Collection<String> paramCollection, Integer paramInteger)
  {
    this(paramContext, paramInt, paramString1, null, paramString2, null, paramCollection, paramInteger);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpp
 * JD-Core Version:    0.7.0.1
 */