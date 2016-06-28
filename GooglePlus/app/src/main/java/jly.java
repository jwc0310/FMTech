import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

public final class jly
  implements cw<Cursor>
{
  public final cv a;
  public final DataSetObservable b = new DataSetObservable();
  public boolean c;
  public final int d;
  private final Context e;
  private final int f;
  private Map<String, String> g;
  private final StringBuilder h = new StringBuilder();
  
  public jly(Context paramContext, cv paramcv, int paramInt)
  {
    this(paramContext, paramcv, paramInt, 0);
  }
  
  public jly(Context paramContext, cv paramcv, int paramInt1, int paramInt2)
  {
    this.e = paramContext;
    this.a = paramcv;
    this.f = paramInt1;
    this.d = (paramInt2 + 2048);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new jma(this.e, this.f, 0);
  }
  
  public final CharSequence a(String paramString)
  {
    for (;;)
    {
      int k;
      try
      {
        Object localObject2;
        if ((!this.c) || (TextUtils.isEmpty(paramString)))
        {
          localObject2 = "";
          return localObject2;
        }
        this.h.setLength(0);
        i = 0;
        int j;
        if (i < paramString.length())
        {
          j = paramString.indexOf('|', i);
          if (j == -1)
          {
            k = paramString.length();
            String str2 = (String)this.g.get(paramString.substring(i, k));
            if (str2 == null) {
              break label152;
            }
            if (this.h.length() != 0) {
              this.h.append(", ");
            }
            this.h.append(str2);
            break label152;
          }
        }
        else
        {
          String str1 = this.h.toString();
          localObject2 = str1;
          continue;
        }
        k = j;
      }
      finally {}
      continue;
      label152:
      int i = k + 1;
    }
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.b.notifyInvalidated();
  }
  
  public final ArrayList<String> b(String paramString)
  {
    for (;;)
    {
      try
      {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2;
        if (this.c)
        {
          boolean bool = TextUtils.isEmpty(paramString);
          if (!bool) {}
        }
        else
        {
          localArrayList2 = localArrayList1;
          return localArrayList2;
        }
        int i = 0;
        int j;
        if (i < paramString.length())
        {
          j = paramString.indexOf('|', i);
          if (j == -1)
          {
            k = paramString.length();
            String str = (String)this.g.get(paramString.substring(i, k));
            if (str != null) {
              localArrayList1.add(str);
            }
            i = k + 1;
          }
        }
        else
        {
          localArrayList2 = localArrayList1;
          continue;
        }
        int k = j;
      }
      finally {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jly
 * JD-Core Version:    0.7.0.1
 */