import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;

final class akw
  extends anc
{
  akw(akt paramakt)
  {
    super(paramakt);
  }
  
  public final boolean a(Integer paramInteger)
  {
    gem localgem = efj.Cv;
    this.b.a.a = paramInteger.intValue();
    this.b.a(this.b.a, true);
    int i = this.b.N().getParameterInteger(223);
    ToolButton localToolButton;
    if (paramInteger.intValue() != i)
    {
      this.b.a(223, paramInteger, true);
      localToolButton = this.b.c;
      if (paramInteger.intValue() >= 11) {
        break label138;
      }
    }
    label138:
    for (boolean bool = true;; bool = false)
    {
      localToolButton.setEnabled(bool);
      return true;
      if (!localgem.frameShouldShuffle(paramInteger.intValue())) {
        break;
      }
      localgem.a(this.b.N(), 1);
      this.b.O();
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akw
 * JD-Core Version:    0.7.0.1
 */