import android.content.Context;
import java.util.List;

public final class bls
  extends cun<nap, naq>
{
  private final nnz[] a;
  private final int b;
  private final String c;
  
  public bls(Context paramContext, int paramInt1, List<String> paramList, long[] paramArrayOfLong, int paramInt2, String paramString)
  {
    super(paramContext, paramInt1, "setnotificationsreadstates", new nap(), new naq());
    this.b = paramInt2;
    this.c = paramString;
    if ((paramList != null) && (paramArrayOfLong != null) && (paramList.size() == paramArrayOfLong.length))
    {
      int i = paramList.size();
      nnz[] arrayOfnnz = new nnz[i];
      for (int j = 0; j < i; j++)
      {
        nnz localnnz = new nnz();
        localnnz.a = ((String)paramList.get(j));
        localnnz.b = Long.valueOf(paramArrayOfLong[j]);
        arrayOfnnz[j] = localnnz;
      }
      this.a = arrayOfnnz;
      return;
    }
    this.a = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bls
 * JD-Core Version:    0.7.0.1
 */