import android.content.Context;
import java.io.IOException;

public final class ltz
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final kcg d;
  
  public ltz(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, "com.google.android.libraries.social.topics.TopicStreamTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = new kcg(paramContext, paramInt);
  }
  
  protected final hae a()
  {
    lty locallty = new lty(g(), this.d, this.a, this.b, this.c);
    ((kbu)mbb.a(g(), kbu.class)).a(locallty);
    if (locallty.n()) {
      return new hae(locallty.o, locallty.q, null);
    }
    if (locallty.x) {}
    for (qat localqat = locallty.w;; localqat = null)
    {
      ogf localogf = ((nbs)localqat).a;
      String str = efj.x(this.b);
      llk localllk = (llk)mbb.a(g(), llk.class);
      try
      {
        localllk.a(g(), this.a, str, System.currentTimeMillis(), localogf.a.b, 3, this.c, localogf.a.c, null, null, true, null, null);
        return new hae(true);
      }
      catch (IOException localIOException)
      {
        return new hae(0, localIOException, null);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltz
 * JD-Core Version:    0.7.0.1
 */