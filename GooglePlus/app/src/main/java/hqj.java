import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.plus.content.EsProvider;
import java.util.List;

public class hqj
  extends fp
{
  private boolean r;
  private final fv s = new fv(this);
  private final Uri t;
  
  public hqj(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public hqj(Context paramContext, int paramInt, List<bpx> paramList)
  {
    this(paramContext);
    int i = paramList.size();
    String[] arrayOfString = new String[i];
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder1.append("gaia_id IN (");
    localStringBuilder2.append("(CASE gaia_id");
    for (int j = 0; j < i; j++)
    {
      String str = ((bpx)paramList.get(j)).c;
      arrayOfString[j] = str;
      if (j > 0) {
        localStringBuilder1.append(',');
      }
      localStringBuilder1.append(" ?");
      localStringBuilder2.append(" WHEN '");
      localStringBuilder2.append(str);
      localStringBuilder2.append("' THEN ");
      localStringBuilder2.append(j);
    }
    localStringBuilder1.append(')');
    localStringBuilder2.append(" END)");
    this.d = EsProvider.a(EsProvider.f(paramContext), paramInt);
    this.e = clk.a;
    this.f = localStringBuilder1.toString();
    this.g = arrayOfString;
    this.h = localStringBuilder2.toString();
  }
  
  public hqj(Context paramContext, Uri paramUri)
  {
    super(paramContext);
    this.t = paramUri;
  }
  
  public hqj(Context paramContext, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    this(paramContext, paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, null);
  }
  
  private hqj(Context paramContext, Uri paramUri1, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, Uri paramUri2)
  {
    super(paramContext, paramUri1, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2);
    this.t = null;
  }
  
  public final void a(Cursor paramCursor)
  {
    if ((paramCursor != null) && (!paramCursor.isClosed())) {}
    for (;;)
    {
      try
      {
        paramCursor.getCount();
        localCursor1 = paramCursor;
      }
      catch (Exception localException)
      {
        localCursor1 = null;
        continue;
        int i = 0;
        continue;
        Cursor localCursor2 = localCursor1;
        continue;
      }
      if ((localCursor1 != null) && (localCursor1.isClosed()))
      {
        i = 1;
        localCursor2 = null;
        if (i == 0) {
          continue;
        }
        super.a(localCursor2);
      }
      Cursor localCursor1 = paramCursor;
    }
  }
  
  public final Cursor f()
  {
    Cursor localCursor = o();
    if (localCursor != null) {
      localCursor.getCount();
    }
    return localCursor;
  }
  
  public void g()
  {
    super.g();
    if ((!this.r) && (this.t != null))
    {
      this.l.getContentResolver().registerContentObserver(this.t, false, this.s);
      this.r = true;
    }
  }
  
  protected final void h() {}
  
  protected final void i()
  {
    k();
    super.i();
    l();
  }
  
  public void l()
  {
    if (this.r)
    {
      this.l.getContentResolver().unregisterContentObserver(this.s);
      this.r = false;
    }
  }
  
  public Cursor o()
  {
    return super.f();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqj
 * JD-Core Version:    0.7.0.1
 */