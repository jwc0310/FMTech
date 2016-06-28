import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;

final class ajo
  extends anc
{
  ajo(ajj paramajj)
  {
    super(paramajj);
  }
  
  public final boolean a(Integer paramInteger)
  {
    this.b.c.a = paramInteger.intValue();
    this.b.a(this.b.c, true);
    this.b.N().a(3, paramInteger.intValue());
    this.b.O();
    ToolButton localToolButton = this.b.a;
    if (paramInteger.intValue() == this.b.b) {}
    for (boolean bool = true;; bool = false)
    {
      localToolButton.setSelected(bool);
      this.b.R();
      this.b.g_();
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajo
 * JD-Core Version:    0.7.0.1
 */