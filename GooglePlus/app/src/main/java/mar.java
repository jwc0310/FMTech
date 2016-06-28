import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseBooleanArray;

public final class mar
{
  public static final SparseBooleanArray a;
  
  static
  {
    SparseBooleanArray localSparseBooleanArray = new SparseBooleanArray();
    a = localSparseBooleanArray;
    localSparseBooleanArray.put(18, true);
    a.put(22, true);
    a.put(36, true);
  }
  
  public static String a(ojf paramojf)
  {
    if ((paramojf != null) && (paramojf.l != null) && (paramojf.l.b == 3) && (paramojf.l.c != null)) {}
    for (ojy[] arrayOfojy = paramojf.l.c;; arrayOfojy = null)
    {
      Object localObject1;
      int j;
      label71:
      Object localObject2;
      if ((arrayOfojy == null) || (arrayOfojy.length == 0))
      {
        localObject1 = null;
        if (localObject1 != null) {
          return localObject1.c;
        }
      }
      else
      {
        int i = arrayOfojy.length;
        j = 0;
        localObject1 = null;
        int k = -1;
        if (j < i)
        {
          localObject2 = arrayOfojy[j];
          int m = ((ojy)localObject2).a.intValue();
          if ((!a.get(m)) || (TextUtils.isEmpty(((ojy)localObject2).c)) || (((ojy)localObject2).b.intValue() <= k)) {
            break label149;
          }
          k = ((ojy)localObject2).b.intValue();
        }
      }
      for (;;)
      {
        j++;
        localObject1 = localObject2;
        break label71;
        break;
        return null;
        label149:
        localObject2 = localObject1;
      }
    }
  }
  
  public static boolean a(ojx paramojx)
  {
    ojy[] arrayOfojy = paramojx.c;
    if (arrayOfojy != null)
    {
      int i = arrayOfojy.length;
      for (int j = 0; j < i; j++)
      {
        ojy localojy = arrayOfojy[j];
        if (!TextUtils.isEmpty(localojy.c))
        {
          int k = localojy.a.intValue();
          if (!a.get(k))
          {
            String str = Uri.parse(localojy.c).getScheme();
            if ((!"content".equals(str)) && (!"file".equals(str))) {
              break label99;
            }
          }
          label99:
          for (int m = 1; m != 0; m = 0) {
            return true;
          }
        }
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mar
 * JD-Core Version:    0.7.0.1
 */