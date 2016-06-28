import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@TargetApi(12)
public abstract class ihc
{
  public Collection<ihd> a = new ArrayList();
  
  public abstract void a(int paramInt, boolean paramBoolean);
  
  public abstract boolean a(int paramInt);
  
  public final void b()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((ihd)localIterator.next()).a();
    }
  }
  
  public void b(int paramInt, boolean paramBoolean)
  {
    if (a(paramInt) != paramBoolean)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((ihd)localIterator.next()).a(paramInt, paramBoolean);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihc
 * JD-Core Version:    0.7.0.1
 */