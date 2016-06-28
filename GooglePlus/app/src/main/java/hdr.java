import java.util.ArrayList;
import java.util.List;

public final class hdr
  implements mdl, mfd
{
  public List<hdt> a = new ArrayList();
  
  public hdr(mek parammek)
  {
    parammek.a(this);
  }
  
  public final hdr a(hdt paramhdt)
  {
    if (this.a.contains(paramhdt)) {
      throw new IllegalStateException("BackNavigationHandler already on stack.");
    }
    this.a.add(paramhdt);
    return this;
  }
  
  public final boolean a()
  {
    for (int i = -1 + this.a.size(); i >= 0; i--) {
      if (((hdt)this.a.get(i)).t_()) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdr
 * JD-Core Version:    0.7.0.1
 */