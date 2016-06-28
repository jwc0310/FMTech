import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.plus.views.AllPhotosBar;

public final class aoy
  implements atq
{
  private final int a;
  
  public aoy(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final int a()
  {
    return aow.d.ordinal();
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {}
    for (Object localObject = (AllPhotosBar)LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.sH, paramViewGroup, false);; localObject = paramView)
    {
      AllPhotosBar localAllPhotosBar = (AllPhotosBar)localObject;
      int i = this.a;
      switch (duw.a[(i - 1)])
      {
      default: 
        throw new IllegalStateException("Unknown status");
      case 1: 
        localAllPhotosBar.a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        localAllPhotosBar.a.setText(aau.tW);
        localAllPhotosBar.b.setVisibility(0);
        localAllPhotosBar.b.setIndeterminate(true);
        return localObject;
      }
      localAllPhotosBar.a.setCompoundDrawablesWithIntrinsicBounds(efj.qD, 0, 0, 0);
      localAllPhotosBar.a.setText(aau.tV);
      localAllPhotosBar.b.setVisibility(0);
      localAllPhotosBar.b.setIndeterminate(false);
      localAllPhotosBar.b.setProgress(localAllPhotosBar.b.getMax());
      return localObject;
    }
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aoy
 * JD-Core Version:    0.7.0.1
 */