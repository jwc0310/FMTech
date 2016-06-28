import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class hry
  implements hrs, hrw
{
  private final ArrayList<hru> a = new ArrayList();
  private Parcelable b;
  
  public hry(mek parammek)
  {
    if (parammek != null) {
      parammek.a(this);
    }
  }
  
  private final void a(int paramInt, Parcelable paramParcelable)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++) {
      ((hru)this.a.get(j)).a(paramInt, paramParcelable);
    }
  }
  
  private final boolean d(Parcelable paramParcelable)
  {
    if (this.b == null) {
      return paramParcelable == null;
    }
    return this.b.equals(paramParcelable);
  }
  
  public final void a()
  {
    this.b = null;
    a(hrv.c, null);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.b = paramBundle.getParcelable("com.google.android.libraries.social.content.multi.selection.SingleItemSelection.value");
    }
  }
  
  public final void a(hru paramhru)
  {
    this.a.add(paramhru);
  }
  
  public final void a(Collection<Parcelable> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean a(Parcelable paramParcelable)
  {
    if (d(paramParcelable)) {
      return false;
    }
    this.b = paramParcelable;
    a(hrv.a, paramParcelable);
    return true;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelable("com.google.android.libraries.social.content.multi.selection.SingleItemSelection.value", this.b);
  }
  
  public final boolean b()
  {
    return this.b == null;
  }
  
  public final boolean b(Parcelable paramParcelable)
  {
    if (d(paramParcelable))
    {
      this.b = null;
      a(hrv.b, paramParcelable);
      return true;
    }
    return false;
  }
  
  public final List<Parcelable> c()
  {
    return Collections.singletonList(this.b);
  }
  
  public final boolean c(Parcelable paramParcelable)
  {
    return d(paramParcelable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hry
 * JD-Core Version:    0.7.0.1
 */