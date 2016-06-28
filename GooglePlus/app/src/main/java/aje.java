import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;

final class aje
  implements View.OnClickListener
{
  aje(ajc paramajc) {}
  
  public final void onClick(View paramView)
  {
    ajc localajc = this.a;
    localajc.a.a = localajc.N().getParameterInteger(241);
    localajc.a(localajc.a, localajc.d);
    localajc.c = localajc.a;
    this.a.S();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aje
 * JD-Core Version:    0.7.0.1
 */