import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

final class juf
  extends gzf
{
  private final ipf a;
  
  juf(jud paramjud, ipf paramipf)
  {
    super(16 + String.valueOf(str).length() + "UploadPollPhoto-" + str);
    this.a = paramipf;
  }
  
  protected final hae a(Context paramContext)
  {
    jub localjub = this.b.a(paramContext, this.a);
    synchronized (this.b.f)
    {
      this.b.f.remove(this.a);
    }
    synchronized (this.b.g)
    {
      this.b.g.put(this.a, localjub);
      this.b.g.notifyAll();
      return new hae(true);
      localObject1 = finally;
      throw localObject1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     juf
 * JD-Core Version:    0.7.0.1
 */