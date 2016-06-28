import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.libraries.social.acl2.DomainRestrictionToggleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gor
  implements CompoundButton.OnCheckedChangeListener
{
  DomainRestrictionToggleView a;
  private List<gos> b = new ArrayList();
  
  public final void a(gos paramgos)
  {
    this.b.add(paramgos);
    if (this.a != null) {
      paramgos.a(this.a.c.isChecked());
    }
  }
  
  final void a(boolean paramBoolean)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((gos)localIterator.next()).a(paramBoolean);
    }
  }
  
  public final boolean a()
  {
    return (this.a != null) && (this.a.c.isChecked());
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    gow.a = false;
    a(paramBoolean);
    gow.a = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gor
 * JD-Core Version:    0.7.0.1
 */