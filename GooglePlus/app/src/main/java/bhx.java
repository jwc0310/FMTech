import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

public final class bhx
  extends cun<mzf, mzg>
{
  private final String a;
  private final String b;
  private final String c;
  private final boolean d;
  private final lln e = (lln)mbb.a(this.j, lln.class);
  
  public bhx(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super(paramContext, paramInt, "collectionread", new mzf(), new mzg());
    if ((TextUtils.isEmpty(paramString1)) && (dun.b())) {
      throw new IllegalArgumentException("CollectionReadOperation: clusterId is null");
    }
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramBoolean;
  }
  
  private static String a(Context paramContext, int paramInt, opo[] paramArrayOfopo)
  {
    if ((paramArrayOfopo == null) || (paramArrayOfopo.length == 0)) {
      return null;
    }
    opo[] arrayOfopo = new opo[1];
    arrayOfopo[0] = paramArrayOfopo[0];
    try
    {
      lmp.a(paramContext, paramInt, arrayOfopo, 1, false);
      return arrayOfopo[0].i;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        if (Log.isLoggable("HttpOperation", 6)) {
          Log.e("HttpOperation", "Error inserting album activity", localIOException);
        }
      }
    }
  }
  
  public final void a(int paramInt, String paramString, Exception paramException)
  {
    if (paramInt == 404) {
      jrf.a(this.j, this.h, this.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bhx
 * JD-Core Version:    0.7.0.1
 */