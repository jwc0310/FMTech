import android.content.Context;
import java.nio.ByteBuffer;
import java.util.List;

final class gyj
  extends kde<myv, myw>
{
  private nji a;
  private List<gyk> b;
  private Context c;
  
  public gyj(Context paramContext, kcg paramkcg, List<gyk> paramList)
  {
    super(paramContext, paramkcg, "postclientlogs", new myv(), new myw());
    this.b = paramList;
    this.a = gxy.a(paramContext);
    njh[] arrayOfnjh = new njh[paramList.size()];
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfnjh[i] = ((gyk)this.b.get(i)).b;
    }
    this.a.a = arrayOfnjh;
    this.c = paramContext;
  }
  
  public final void b(ByteBuffer paramByteBuffer, String paramString)
  {
    gyh.a(this.c, this.k.a, this.b);
    super.b(paramByteBuffer, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyj
 * JD-Core Version:    0.7.0.1
 */