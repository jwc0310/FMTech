import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;

final class ajd
  implements View.OnClickListener
{
  ajd(ajc paramajc) {}
  
  public final void onClick(View paramView)
  {
    ajc localajc = this.a;
    localajc.b.a = localajc.N().getParameterInteger(3);
    localajc.a(localajc.b, localajc.Z);
    localajc.c = localajc.b;
    this.a.S();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajd
 * JD-Core Version:    0.7.0.1
 */