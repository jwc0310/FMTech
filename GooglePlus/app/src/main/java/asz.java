import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

final class asz
  implements atq
{
  private LayoutInflater a;
  private int b;
  private int c;
  private CharSequence d;
  
  public asz(Context paramContext, int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    this.a = LayoutInflater.from(paramContext);
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramCharSequence;
  }
  
  public final int a()
  {
    return -1 + atb.a;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.a.inflate(efj.tV, paramViewGroup, false);
    }
    ImageView localImageView = (ImageView)paramView.findViewById(aaw.ek);
    localImageView.setImageResource(this.c);
    localImageView.setVisibility(0);
    ((TextView)paramView.findViewById(aaw.ls)).setText(this.d);
    return paramView;
  }
  
  public final void a(atr paramatr)
  {
    paramatr.a(new asy(this.b));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     asz
 * JD-Core Version:    0.7.0.1
 */